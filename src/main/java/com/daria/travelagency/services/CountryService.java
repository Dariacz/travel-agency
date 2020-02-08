package com.daria.travelagency.services;

import com.daria.travelagency.model.Country;
import com.daria.travelagency.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CountryService {
    private CountryRepository countryRepository;
    private ContinentService continentService;

    @Autowired
    public CountryService(CountryRepository countryRepository, ContinentService continentService) {
        this.countryRepository = countryRepository;
        this.continentService = continentService;
    }

    public List<Country> getAllCountriesByName() {
        List<Country> countries = countryRepository.findAll();
        countries.sort(Comparator.comparing(Country::getName));
        return countries;
    }
}
