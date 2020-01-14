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

//    public List<TripView> findTripViewsByUserId(Long userId) {
//
//        return tripRepository.findTripViewsById(userId);
//    }

    public Trip createTrip(NewTrip newTrip) throws AccessDeniedException {
        var trip = new Trip();
        trip.setTitle(newTrip.getTitle());
        trip.setDescription(newTrip.getDescription());
        trip.setAdultPrice(newTrip.getAdultPrice());
        trip.setChildPrice(newTrip.getChildPrice());
        trip.setDaysQuantity(newTrip.getDaysQuantity());
        trip.setStartDate(newTrip.getStartDate());
        trip.setEndDate(newTrip.getEndDate());
        trip.setDaysQuantity(newTrip.getDaysQuantity());
        trip.setDepartureAirport(newTrip.getDepartureAirport());
        trip.setDepartureCity(newTrip.getDepartureCity());
        trip.setArrivalAirport(newTrip.getArrivalAirport());
        trip.setArrivalCity(newTrip.getArrivalCity());
        trip.setHotel(newTrip.getHotel());

        return tripRepository.save(trip);
    }


    public Trip findTripById(long tripId) {
        return tripRepository.findTripById(tripId);

    }

    public Trip findTripByArrivalCityId(Long cityId) {
        return tripRepository.findTripByArrivalCityId(cityId);

    }

    public void deleteTrip(long tripId) {
        tripRepository.deleteById(tripId);

    }
}

