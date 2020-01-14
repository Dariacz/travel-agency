package com.daria.travelagency.repositories;

import com.daria.travelagency.model.Airport;
import com.daria.travelagency.model.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {

    List<Airport> findAllByCity_Id(Long cityId);
}
