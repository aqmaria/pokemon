package com.pokemon.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;

public class PageDto {

    public ArrayList<PokemonDto> pokemonList;
    @ApiModelProperty(value = "Total number of pages", example = "651")
    public Integer totalPages;
    public ArrayList<PokemonDto> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(ArrayList<PokemonDto> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

}
