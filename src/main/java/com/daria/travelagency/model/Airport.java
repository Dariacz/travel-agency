package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @NotNull
    private String name;

    @ManyToOne
    private City city;
    @OneToMany(mappedBy = "departureAirport")
    private List<Trip> departureTripList;
    @OneToMany(mappedBy = "arrivalAirport")
    private List<Trip> arrivalTripList;

    public Airport() {
    }

    public Airport(String name, City city, List<Trip> departureTripList, List<Trip> arrivalTripList) {
        this.name = name;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Trip> getDepartureTripList() {
        return departureTripList;
    }

    public void setDepartureTripList(List<Trip> departureTripList) {
        this.departureTripList = departureTripList;
    }

    public List<Trip> getArrivalTripList() {
        return arrivalTripList;
    }

    public void setArrivalTripList(List<Trip> arrivalTripList) {
        this.arrivalTripList = arrivalTripList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return id == airport.id &&
                Objects.equals(name, airport.name) &&
                Objects.equals(city, airport.city) &&
                Objects.equals(departureTripList, airport.departureTripList) &&
                Objects.equals(arrivalTripList, airport.arrivalTripList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, departureTripList, arrivalTripList);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", departureTripList=" + departureTripList +
                ", arrivalTripList=" + arrivalTripList +
                '}';
    }
}
