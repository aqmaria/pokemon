package com.pokemon.service;

import com.pokemon.dto.PageDto;

public interface PokemonService{
    public PageDto getPagination(int limit, int offset);
}
