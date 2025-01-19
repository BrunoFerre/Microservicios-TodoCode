package com.microsv.hotels_service.model;

public class Hotel {
    private Long id;
    private String name;
    private int stars;
    private Long id_ciudad;

    public Hotel() {
    }

    public Hotel(Long id, String name, int stars, Long id_ciudad) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.id_ciudad = id_ciudad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Long getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Long id_ciudad) {
        this.id_ciudad = id_ciudad;
    }
}
