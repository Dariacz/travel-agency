package com.daria.travelagency.repositories;


import com.daria.travelagency.model.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Trip, Long> {

}
