package com.pokemon.dto.response;


import com.pokemon.dto.PokemonApiGenericDto;

import java.util.ArrayList;

public class GetPokemonResponse {
    public ArrayList<Ability> abilities;
    public String name;
    public ArrayList<Move> moves;
    public ArrayList<Type> types;
    public Integer weight;
    public Sprites sprites;

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public Integer getWeight(){return weight;}

    public void setWeight(Integer weight){ this.weight = weight; }

    public void setSprites(Sprites sprites){this.sprites = sprites;}
    public Sprites getSprites(){return sprites;}
    public static class Move{
        PokemonApiGenericDto move;

        public PokemonApiGenericDto getMove() {
            return move;
        }

        public void setMove(PokemonApiGenericDto move) {
            this.move = move;
        }
    }

    public static class Ability{
        PokemonApiGenericDto ability;

        public PokemonApiGenericDto getAbility() {
            return ability;
        }

        public void setAbility(PokemonApiGenericDto ability) {
            this.ability = ability;
        }
    }

    public static class Type{
        PokemonApiGenericDto type;

        public PokemonApiGenericDto getType() {
            return type;
        }

        public void setType(PokemonApiGenericDto type) {
            this.type = type;
        }
    }

    public static class Sprites{
        String front_default;

        public String getFront_default(){return front_default;}
        public void setFront_default(String frontDefault){this.front_default = frontDefault;}
    }

}
