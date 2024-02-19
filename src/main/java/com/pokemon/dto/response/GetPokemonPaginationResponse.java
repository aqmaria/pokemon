package com.pokemon.dto.response;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetPokemonPaginationResponse {

    public Integer count;
    public ArrayList<Result> results;

    public void setCount(Integer count){this.count = count;}
    public Integer getCount(){return count;}
    public static class Result{
        public String name;
        public String url;

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

    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }
}
