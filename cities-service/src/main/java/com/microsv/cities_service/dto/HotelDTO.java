package com.microsv.cities_service.dto;

public class HotelDTO {
    private Long id;
    private String name;
    private int stars;
    private Long city_id;

    public HotelDTO() {
    }

    public HotelDTO(Long id, String name, int stars, Long city_id) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.city_id = city_id;
    }

    public Long getCity_id() {
        return city_id;
    }

    public int getStars() {
        return stars;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
