package com.daria.travelagency.services;


import com.daria.travelagency.dto.NewTrip;
import com.daria.travelagency.dto.TripView;
import com.daria.travelagency.model.Trip;
import com.daria.travelagency.repositories.CityRepository;
import com.daria.travelagency.repositories.TripRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class TripService {

    public final TripRepository tripRepository;
    private final SecurityService securityService;
    private final CityService cityService;
    private final AirportService airportService;
    private final HotelService hotelService;
    private final CityRepository cityRepository;


    public TripService(TripRepository tripRepository, SecurityService securityService, CityService cityService, AirportService airportService, HotelService hotelService, CityRepository cityRepository) {
        this.tripRepository = tripRepository;
        this.securityService = securityService;
        this.cityService = cityService;
        this.airportService = airportService;
        this.hotelService = hotelService;
        this.cityRepository = cityRepository;
    }

    public List<TripView> findTripViews() {

        return tripRepository.findTripViews();
    }


    public Trip createTrip(NewTrip newTrip) {

        var trip = new Trip();

        trip.setTitle(newTrip.getTitle());
        trip.setDescription(newTrip.getDescription());
        trip.setAdultPrice(newTrip.getAdultPrice());
        trip.setChildPrice(newTrip.getChildPrice());
        trip.setDaysQuantity(newTrip.getDaysQuantity());
        trip.setStartDate(LocalDate.parse(newTrip.getStartDate(), DateTimeFormatter.ofPattern("yyyy-MM-d")));
        trip.setEndDate(LocalDate.parse(newTrip.getEndDate(), DateTimeFormatter.ofPattern("yyyy-MM-d")));
        trip.setDepartureAirport(newTrip.getDepartureAirport());
        trip.setDepartureCity(newTrip.getDepartureCity());
        trip.setArrivalAirport(newTrip.getArrivalAirport());
        trip.setArrivalCity(newTrip.getArrivalCity());
        trip.setIsPromoted(newTrip.getIsPromoted());
        trip.setHotel(newTrip.getHotel());
        trip.setType(newTrip.getType());
        trip.setAdultsQuantity(newTrip.getAdultsQuantity());
        trip.setChildrenQuantity(newTrip.getChildrenQuantity());

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

