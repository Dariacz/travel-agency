package com.daria.travelagency.repositories;

import com.daria.travelagency.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {


    @Query("select c from City c where c.id = ?1")
    City findCityById(Long id);

    @Query("select c from City c where c.name = ?1")
    City findByName(String name);

    @Query("select c from City c left join fetch c.country o where c.id = ?1")
    List<City> findCityByCountryId(Long countryId);
}