package com.microsv.pokeapi.pokeapi.repository;

import com.microsv.pokeapi.pokeapi.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {
    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemon(@PathVariable("pokemonId") int pokemonId);
}
