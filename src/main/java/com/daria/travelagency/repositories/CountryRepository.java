package com.daria.travelagency.repositories;


import com.daria.travelagency.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository  extends CrudRepository<Country, Long> {
}
