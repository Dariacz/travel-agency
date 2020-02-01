package com.daria.travelagency.repositories;


import com.daria.travelagency.dto.TripView;
import com.daria.travelagency.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    @Query("select t from Trip t where t.id = ?1")
    Trip findTripById(Long id);

    @Query("select t from Trip t left join fetch t.arrivalCity u where t.id = ?1")
    Trip findTripByArrivalCityId(Long id);


    @Query("select new com.daria.travelagency.dto.TripView(t.id, t.title) from Trip t group by t.id, t.title")
   List<TripView> findTripViews();


}
