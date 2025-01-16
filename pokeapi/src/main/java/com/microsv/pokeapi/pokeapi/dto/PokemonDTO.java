package com.microsv.pokeapi.pokeapi.dto;

public class PokemonDTO {
    private Long id;
    private String name;

    public PokemonDTO() {
    }

    public PokemonDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
