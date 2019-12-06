package com.daria.travelagency.repositories;

import com.daria.travelagency.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    //City findByName(String name);
}