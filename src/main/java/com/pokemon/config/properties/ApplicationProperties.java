package com.pokemon.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationProperties {
    @Value("${pokemon.api.url}")
    private String pokeAPIUrl;

    @Value("${pokemon.api.ability.endpoint}")
    private String pokeAPIAbilityEndpoint;

    @Value("${pokemon.api.characteristic.endpoint}")
    private String pokeAPICharacteristicEndpoint;

    public String getPokeAPIUrl() {
        return pokeAPIUrl;
    }

    public String getPokeAPIAbilityEndpoint() {
        return pokeAPIAbilityEndpoint;
    }

    public String getPokeAPICharacteristicEndpoint() {
        return pokeAPICharacteristicEndpoint;
    }

}
