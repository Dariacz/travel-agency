package com.daria.travelagency.services;

import com.daria.travelagency.model.Hotel;
import com.daria.travelagency.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

   private HotelRepository hotelRepository;
   private CityService cityService;

   @Autowired
    public HotelService(HotelRepository hotelRepository, CityService cityService) {
        this.hotelRepository = hotelRepository;
        this.cityService = cityService;
    }

    public List<Hotel> getAllHotels(){
       return (List<Hotel>) hotelRepository.findAll();
    }
}
