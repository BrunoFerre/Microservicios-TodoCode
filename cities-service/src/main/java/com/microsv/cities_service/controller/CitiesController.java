package com.microsv.cities_service.controller;

import com.microsv.cities_service.dto.CityDTO;
import com.microsv.cities_service.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CitiesController {
    @Autowired
    private CityService cityService;

    @GetMapping("/hotels")
    public CityDTO getCitiesHotels(@RequestParam String name, @RequestParam String country) {
        return cityService.getCitiesHotels(name, country);
    }
}
