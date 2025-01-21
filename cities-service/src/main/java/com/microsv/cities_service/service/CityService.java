package com.microsv.cities_service.service;

import com.microsv.cities_service.dto.CityDTO;

public interface CityService {
    CityDTO getCitiesHotels(String name, String country);
}
