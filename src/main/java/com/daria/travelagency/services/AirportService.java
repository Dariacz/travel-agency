package com.daria.travelagency.services;


import com.daria.travelagency.model.Airport;
import com.daria.travelagency.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    private AirportRepository airportRepository;
    private CityService cityService;

    @Autowired
    public AirportService(AirportRepository airportRepository,
                          CityService cityService) {
        this.airportRepository = airportRepository;
        this.cityService = cityService;
    }

    public List<Airport> getAllAirports() {

        return (List<Airport>) airportRepository.findAll();
    }


}
