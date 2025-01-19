package com.microsv.hotels_service.controller;

import com.microsv.hotels_service.model.Hotel;
import com.microsv.hotels_service.service.HotelsService;
import jakarta.ws.rs.GET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelsController {
    @Autowired
    private HotelsService hotelsService;

    @GetMapping("/{city_id}")
    public List<Hotel> getHotelsByCityId(@PathVariable("city_id") Long cityId) {
        return hotelsService.getHotelsByCityId(cityId);
    }
}
