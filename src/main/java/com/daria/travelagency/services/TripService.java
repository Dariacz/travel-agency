package com.daria.travelagency.services;


import com.daria.travelagency.dto.NewTrip;
import com.daria.travelagency.dto.TripView;
import com.daria.travelagency.model.Trip;
import com.daria.travelagency.repositories.TripRepository;
import org.springframework.stereotype.Service;

import java.nio.file.AccessDeniedException;
import java.util.List;


@Service
public class TripService {

    public final TripRepository tripRepository;
    private final SecurityService securityService;


    public TripService(TripRepository tripRepository, SecurityService securityService) {
        this.tripRepository = tripRepository;
        this.securityService = securityService;
    }

    public List<TripView> findTripViews() {

        return tripRepository.findTripViews();
    }

    public List<TripView> findTripViewsByUserId(Long userId) {

        return tripRepository.findTripViewsById(userId);
    }

    public Trip createTrip(NewTrip newTrip) throws AccessDeniedException {
        var trip = new Trip();
        trip.setTitle(newTrip.getTitle());
        trip.setDescription(newTrip.getDescription());
        return tripRepository.save(trip);
    }


    public Trip findTripById(long tripId) {
        return tripRepository.findTripById(tripId);

    }

    public void deleteTrip(long tripId) {
        tripRepository.deleteById(tripId);

    }
}

