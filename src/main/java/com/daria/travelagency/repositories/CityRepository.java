package com.daria.travelagency.repositories;

import com.daria.travelagency.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long>, JpaRepository<City, Long> {


    @Query("select c from City c where c.id = ?1")
    City findCityById(Long id);

    @Query("select c from City c where c.name = ?1")
    City findByName(String name);
}