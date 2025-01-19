package com.microsv.cities_service.model;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    private Long id_city;
    private String name;
    private String continent;
    private String country;
    private String state;

    public Cities() {
    }

    public Cities(String name, String continent, String country, String state, List<String> hotels) {
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.state = state;
    }

    public Long getId_city() {
        return id_city;
    }

    public void setId_city(Long id_city) {
        this.id_city = id_city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
