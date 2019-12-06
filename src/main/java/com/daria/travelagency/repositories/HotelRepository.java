package com.daria.travelagency.repositories;

import com.daria.travelagency.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

    Hotel findByName(String name);
}
