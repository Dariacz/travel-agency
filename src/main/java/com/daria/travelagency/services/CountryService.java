package com.daria.travelagency.services;

import com.daria.travelagency.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private CountryRepository countryRepository;
    private ContinentService continentService;

    @Autowired
    public CountryService(CountryRepository countryRepository, ContinentService continentService) {
        this.countryRepository = countryRepository;
        this.continentService = continentService;
    }
}
