package com.microsv.pokeapi.pokeapi.controller;

import com.microsv.pokeapi.pokeapi.dto.PokemonDTO;
import com.microsv.pokeapi.pokeapi.repository.PokeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeApiController {
    @Autowired
    private PokeApiClient pokeApiClient;
    @GetMapping("/pokemon/{pokemonId}")
    public ResponseEntity<Object> getPokemon(@PathVariable("pokemonId") int pokemonId) {
        try {
            PokemonDTO pokemon = pokeApiClient.getPokemon(pokemonId);
            return ResponseEntity.ok(pokemon);
        }catch (Exception e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
}
