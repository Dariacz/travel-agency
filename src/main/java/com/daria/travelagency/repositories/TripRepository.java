package com.daria.travelagency.repositories;


import com.daria.travelagency.dto.TripView;
import com.daria.travelagency.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    @Query("select t from Trip t left join fetch t.user u where t.id = ?1 order by t.createdOn")
    Trip findTripById(Long id);


    @Query("select new com.daria.travelagency.dto.TripView(t.id, t.title) from Trip t group by t.id, t.title order by t.createdOn desc ")
    List<TripView> findTripViews();

    @Query("select new com.daria.travelagency.dto.TripView(t.id, t.title) from Trip t where t.user.id = ?1 group by t.id, t.title order by t.createdOn desc ")
    List<TripView> findTripViewsById(long usedId);


}