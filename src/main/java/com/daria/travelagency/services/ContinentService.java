package com.daria.travelagency.services;


import com.daria.travelagency.dto.ContinentDto;
import com.daria.travelagency.model.Continent;
import com.daria.travelagency.repositories.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ContinentService {

    private ContinentRepository continentRepository;

    @Autowired
    public ContinentService(ContinentRepository continentRepository) {

        this.continentRepository = continentRepository;
    }

    public Optional<Continent> getContinentById(Long continentId) {

        return continentRepository.findById(continentId);
    }

    public List<Continent> getAllContinentsByName(){
        List<Continent> continents = continentRepository.findAll();
        continents.sort(Comparator.comparing(Continent::getName));
        return continents;
    }


    public List<ContinentDto> findContinentsByName() {

        return continentRepository.findContinentsByName();
    }
}

