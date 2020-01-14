package com.daria.travelagency.repositories;

import com.daria.travelagency.model.City;
import com.daria.travelagency.model.Continent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends CrudRepository<Continent, Long> {
}
