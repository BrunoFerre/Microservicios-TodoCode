package com.microsv.hotels_service.service;

import com.microsv.hotels_service.model.Hotel;

import java.util.List;

public interface HotelsService {
    public List<Hotel> getHotelsByCityId(Long city_id);
}
