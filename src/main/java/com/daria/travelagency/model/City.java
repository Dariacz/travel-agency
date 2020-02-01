package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @NotNull
    private String name;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<Airport> airportList;

    @OneToMany(mappedBy = "city")
    private List<Hotel> hotelList;

    @OneToMany(mappedBy = "arrivalCity")
    private List<Trip> arrivalTripList;

    @OneToMany(mappedBy = "departureCity")
    private List<Trip> departureTripList;

    public City() {
    }

    public City(String name, Country country, List<Airport> airportList, List<Hotel> hotelList, List<Trip> arrivalTripList, List<Trip> departureTripList) {
        this.name = name;
        this.country = country;
        this.airportList = airportList;
        this.hotelList = hotelList;
        this.departureTripList = departureTripList;
        this.arrivalTripList = arrivalTripList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Airport> getAirportList() {
        return airportList;
    }

    public void setAirportList(List<Airport> airportList) {
        this.airportList = airportList;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    public List<Trip> getArrivalTripList() {
        return arrivalTripList;
    }

    public void setArrivalTripList(List<Trip> arrivalTripList) {
        this.arrivalTripList = arrivalTripList;
    }

    public List<Trip> getDepartureTripList() {
        return departureTripList;
    }

    public void setDepartureTripList(List<Trip> departureTripList) {
        this.departureTripList = departureTripList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id &&
                Objects.equals(name, city.name) &&
                Objects.equals(country, city.country) &&
                Objects.equals(airportList, city.airportList) &&
                Objects.equals(hotelList, city.hotelList) &&
                Objects.equals(arrivalTripList, city.arrivalTripList) &&
                Objects.equals(departureTripList, city.departureTripList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, airportList, hotelList, arrivalTripList, departureTripList);
    }


}
