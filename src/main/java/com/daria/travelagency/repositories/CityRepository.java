package com.daria.travelagency.repositories;

import com.daria.travelagency.model.City;
import com.daria.travelagency.model.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    //City findByName(String name);
    @Query("select t from Trip t where t.id = ?1 order by t.createdOn")
    Trip findTripById(Long id);
}