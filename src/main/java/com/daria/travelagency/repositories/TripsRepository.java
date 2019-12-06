package com.daria.travelagency.repositories;

import com.daria.travelagency.model.Trips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripsRepository extends PagingAndSortingRepository<Trips, Long>, JpaRepository<Trips, Long> {

//    @Query("select new ;
//
//    @Query(");

}
