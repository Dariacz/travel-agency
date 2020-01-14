package com.daria.travelagency.dto;

import com.daria.travelagency.model.Airport;
import com.daria.travelagency.model.City;
import com.daria.travelagency.model.Hotel;
import com.daria.travelagency.model.Type;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;


public class NewTrip {


    @NotNull
    @NotEmpty
    @Size(min = 5, max = 500)
    private String title;

    @NotNull
    @NotEmpty
    @Size(min = 5, max = 5000)
    private String description;

    private City departureCity;
    private Airport departureAirport;
    private City arrivalCity;
    private Airport arrivalAirport;
    private Hotel hotel;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer daysQuantity;
    private Type type;
    private double adultPrice;
    private double childPrice;
    private boolean isPromoted;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(City departureCity) {
        this.departureCity = departureCity;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(City arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(Integer daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public double getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(double childPrice) {
        this.childPrice = childPrice;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewTrip newTrip = (NewTrip) o;
        return Double.compare(newTrip.adultPrice, adultPrice) == 0 &&
                Double.compare(newTrip.childPrice, childPrice) == 0 &&
                isPromoted == newTrip.isPromoted &&
                Objects.equals(title, newTrip.title) &&
                Objects.equals(description, newTrip.description) &&
                Objects.equals(departureCity, newTrip.departureCity) &&
                Objects.equals(departureAirport, newTrip.departureAirport) &&
                Objects.equals(arrivalCity, newTrip.arrivalCity) &&
                Objects.equals(arrivalAirport, newTrip.arrivalAirport) &&
                Objects.equals(hotel, newTrip.hotel) &&
                Objects.equals(startDate, newTrip.startDate) &&
                Objects.equals(endDate, newTrip.endDate) &&
                Objects.equals(daysQuantity, newTrip.daysQuantity) &&
                type == newTrip.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, departureCity, departureAirport, arrivalCity, arrivalAirport, hotel, startDate, endDate, daysQuantity, type, adultPrice, childPrice, isPromoted);
    }

    @Override
    public String toString() {
        return "NewTrip{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", departureCity=" + departureCity +
                ", departureAirport=" + departureAirport +
                ", arrivalCity=" + arrivalCity +
                ", arrivalAirport=" + arrivalAirport +
                ", hotel=" + hotel +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", daysQuantity=" + daysQuantity +
                ", type=" + type +
                ", adultPrice=" + adultPrice +
                ", childPrice=" + childPrice +
                ", isPromoted=" + isPromoted +
                '}';
    }
}


