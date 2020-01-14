package com.daria.travelagency.services;

import com.daria.travelagency.model.City;
import com.daria.travelagency.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;
    private CountryService countryService;

    @Autowired
    public CityService(CityRepository cityRepository,
                       CountryService countryService) {
        this.cityRepository = cityRepository;
        this.countryService = countryService;
    }

    public List<City> getAllCities() {
        return (List<City>) cityRepository.findAll();
    }

}
