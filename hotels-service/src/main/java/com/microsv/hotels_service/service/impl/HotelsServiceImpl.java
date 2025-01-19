package com.microsv.hotels_service.service.impl;

import com.microsv.hotels_service.model.Hotel;
import com.microsv.hotels_service.service.HotelsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelsServiceImpl implements HotelsService {
    List<Hotel> hotelsList = new ArrayList<>();

    @Override

    public List<Hotel> getHotelsByCityId(Long city_id) {
        List<Hotel> hotelsLCityList = new ArrayList<>();
        this.loadHotels();
        for (Hotel h : hotelsList) {
            if (h.getId_ciudad() == city_id) {
                hotelsList.add(h);
            }
        }
        return hotelsLCityList;
    }

    public void loadHotels() {
        hotelsList.add(new Hotel(1L, "Hotel 1", 5, 1L));
        hotelsList.add(new Hotel(2L, "Hotel 2", 4, 1L));
        hotelsList.add(new Hotel(3L, "Hotel 3", 3, 1L));
        hotelsList.add(new Hotel(4L, "Hotel 4", 2, 1L));
        hotelsList.add(new Hotel(5L, "Hotel 5", 1, 1L));
        hotelsList.add(new Hotel(6L, "Hotel 6", 5, 2L));
        hotelsList.add(new Hotel(7L, "Hotel 7", 4, 2L));
        hotelsList.add(new Hotel(8L, "Hotel 8", 3, 2L));
    }

    ;
}
