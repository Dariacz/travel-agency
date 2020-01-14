package com.daria.travelagency.controllers;


import com.daria.travelagency.dto.NewTrip;
import com.daria.travelagency.model.Trip;
import com.daria.travelagency.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.nio.file.AccessDeniedException;



@Controller
public class TripController {


    private TripService tripService;
    private CityService cityService;
    private AirportService airportService;
    private HotelService hotelService;
    private ContinentService continentService;
    private CountryService countryService;

    @Autowired
    public TripController(TripService tripService, CityService cityService, AirportService airportService, HotelService hotelService, ContinentService continentService, CountryService countryService) {
        this.tripService = tripService;
        this.cityService = cityService;
        this.airportService = airportService;
        this.hotelService = hotelService;
        this.continentService = continentService;
        this.countryService = countryService;
    }




//    @GetMapping("/new-trip")
//    public String getNewTrip(Model model) {
//
//        var trip = new NewTrip();
//        model.addAttribute("trip", trip);
//
//        return "new-trip";
//    }

    @GetMapping("/trip/{tripId}")
    public String getTripById(Model model,@PathVariable final long tripId) {
        model.addAttribute("trip", tripService.findTripById(tripId));
        model.addAttribute("tripsbycountryid", tripService.findTripByArrivalCityId(tripId));
        return "trip";
    }





    @PostMapping("/new-trip")
    public String postTrip(@ModelAttribute("trip") @Valid NewTrip trip, BindingResult bindingResult) throws AccessDeniedException {
        if (bindingResult.hasErrors()) {
            return "new-trip";
        } else {
            var persisted = tripService.createTrip(trip);
            return "redirect:/trip/" + persisted.getId();
        }
    }

    @GetMapping("/new-trip")
    public String addNewTrip(Model model) {
        var trip = new NewTrip();
model.addAttribute("trip", trip);
    //    model.addAttribute("newTrip", new NewTrip());
        model.addAttribute("cities", cityService.getAllCities());
        model.addAttribute("airports", airportService.getAllAirports());
        model.addAttribute("hotels", hotelService.getAllHotels());
        return "new-trip";
    }

    @GetMapping("/trips")
    public String showAllTrips(Model model) {

        var trip = new NewTrip();
        model.addAttribute("tripViews", tripService.findTripViews());

        return "trips_list";
    }

    @DeleteMapping("delete/trip/{tripId}")
    private String deleteProduct(Model model,@PathVariable final long tripId){

        tripService.deleteTrip(tripId);
        model.addAttribute("tripViews", tripService.findTripViews());
        return "redirect:/trips_list";
    }




}
