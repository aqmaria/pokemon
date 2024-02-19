package com.pokemon.service.impl;

import com.pokemon.config.properties.ApplicationProperties;
import com.pokemon.dto.PageDto;
import com.pokemon.dto.PokemonApiGenericDto;
import com.pokemon.dto.PokemonDto;
import com.pokemon.dto.response.GetPokemonPaginationResponse;
import com.pokemon.dto.response.GetPokemonResponse;
import com.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class PokemonServiceImpl implements PokemonService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ApplicationProperties properties;

    @Override
    public PageDto getPagination(int limit, int offset) {

        ArrayList<PokemonDto> pokemonList = new ArrayList<>();

        ResponseEntity<GetPokemonPaginationResponse> paginationResponse
                = restTemplate.getForEntity(properties.getPokeAPIUrl() + "?limit=" + limit
                + "&offset=" + offset, GetPokemonPaginationResponse.class);

        paginationResponse.getBody().getResults().parallelStream().forEach( result ->{

            PokemonDto pokemon = new PokemonDto();

            ResponseEntity<GetPokemonResponse> pokemonResponse
                    = restTemplate.getForEntity(properties.getPokeAPIUrl() + "/" + result.getName()
                    , GetPokemonResponse.class);

            pokemon.setName(result.getName());
            pokemon.setWeight(pokemonResponse.getBody().getWeight());
            pokemon.setUrl(pokemonResponse.getBody().getSprites().getFront_default());

            pokemon.setAbilities ((ArrayList<PokemonApiGenericDto>)pokemonResponse.getBody().getAbilities()
                    .stream()
                    .map(ability -> ability.getAbility()).collect(Collectors.toList()));

            pokemon.setMoves((ArrayList<PokemonApiGenericDto>) pokemonResponse.getBody().getMoves()
                    .stream()
                    .map(move -> move.getMove()).collect(Collectors.toList()));

            pokemon.setTypes((ArrayList<PokemonApiGenericDto>) pokemonResponse.getBody().getTypes()
                    .stream()
                    .map(type -> type.getType()).collect(Collectors.toList()));

            pokemonList.add(pokemon);
        });

        PageDto page = new PageDto();
        page.setPokemonList(pokemonList);
        page.setTotalPages((paginationResponse.getBody().getCount()/limit));

        return page;
    }

}