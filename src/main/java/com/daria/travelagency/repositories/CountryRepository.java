package com.daria.travelagency.repositories;


import com.daria.travelagency.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository  extends JpaRepository<Country, Long> {

    List<Country> findCountryByContinentId(Long id);
}
