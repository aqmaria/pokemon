package com.pokemon.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;

public class PokemonDto {
    @ApiModelProperty(value = "Name of the Pokemon", example = "Bulbasaur", required = true)
    public String name;

    @ApiModelProperty(value = "URL of the Pokemon image", example = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png", required = true)
    public String url;

    @ApiModelProperty(value = "Weight of the Pokemon", example = "69", required = true)
    public Integer weight;

    @ApiModelProperty(value = "Abilities of the Pokemon", required = true, example = "[{\"name\":\"overgrow\",\"url\":\"https://pokeapi.co/api/v2/ability/65/\"},{\"name\":\"chlorophyll\",\"url\":\"https://pokeapi.co/api/v2/ability/34/\"}]")
    public ArrayList<PokemonApiGenericDto> abilities;

    @ApiModelProperty(value = "Moves of the Pokemon", required = true, example = "[{\"name\":\"razor-wind\",\"url\":\"https://pokeapi.co/api/v2/move/13/\"},{\"name\":\"swords-dance\",\"url\":\"https://pokeapi.co/api/v2/move/14/\"}]")
    public ArrayList<PokemonApiGenericDto> moves;

    @ApiModelProperty(value = "Types of the Pokemon", required = true, example = "[{\"name\":\"grass\",\"url\":\"https://pokeapi.co/api/v2/type/12/\"},{\"name\":\"poison\",\"url\":\"https://pokeapi.co/api/v2/type/4/\"}]")
    public ArrayList<PokemonApiGenericDto> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ArrayList<PokemonApiGenericDto> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<PokemonApiGenericDto> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<PokemonApiGenericDto> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<PokemonApiGenericDto> moves) {
        this.moves = moves;
    }

    public ArrayList<PokemonApiGenericDto> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<PokemonApiGenericDto> types) {
        this.types = types;
    }
}
