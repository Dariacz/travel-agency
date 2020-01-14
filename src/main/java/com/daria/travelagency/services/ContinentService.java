package com.daria.travelagency.services;


import com.daria.travelagency.repositories.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentService {

    private ContinentRepository continentRepository;

    @Autowired
    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }
    }

