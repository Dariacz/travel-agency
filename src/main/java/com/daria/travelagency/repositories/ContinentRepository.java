package com.daria.travelagency.repositories;


import com.daria.travelagency.dto.ContinentDto;
import com.daria.travelagency.dto.TripView;
import com.daria.travelagency.model.Continent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {


    @Query("select new com.daria.travelagency.dto.ContinentDto(c.id, c.name) from Continent c group by c.id, c.name")
    List<ContinentDto> findContinentsByName();
}
