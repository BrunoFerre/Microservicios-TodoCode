package com.microsv.hotels_service.model;

public class Hotel {
    private Long id;
    private String name;
    private int stars;
    private Long city_id;

    public Hotel() {
    }

    public Hotel(Long id, String name, int stars, Long city_id) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.city_id = city_id;
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

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }
}
