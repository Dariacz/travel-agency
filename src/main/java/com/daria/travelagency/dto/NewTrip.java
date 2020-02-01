package com.daria.travelagency.dto;

import com.daria.travelagency.model.Airport;
import com.daria.travelagency.model.City;
import com.daria.travelagency.model.Hotel;
import com.daria.travelagency.model.Type;

import javax.persistence.Column;
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

    private Long id;


    private City departureCity;
    private Airport departureAirport;
    private City arrivalCity;
    private Airport arrivalAirport;
    private Hotel hotel;
    private String startDate;
    private String endDate;
    private Integer daysQuantity;
    private Type type;
    private double adultPrice;
    private double childPrice;
    private boolean isPromoted;
    private Integer adultsQuantity;
    private Integer childrenQuantity;

    public NewTrip() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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

    public boolean getIsPromoted() {

        return isPromoted;
    }

    public void setIsPromoted(boolean promoted) {
        isPromoted = promoted;
    }


    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    public Integer getAdultsQuantity() {
        return adultsQuantity;
    }

    public void setAdultsQuantity(Integer adultsQuantity) {
        this.adultsQuantity = adultsQuantity;
    }

    public Integer getChildrenQuantity() {
        return childrenQuantity;
    }

    public void setChildrenQuantity(Integer childrenQuantity) {
        this.childrenQuantity = childrenQuantity;
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
                Objects.equals(id, newTrip.id) &&
                Objects.equals(departureCity, newTrip.departureCity) &&
                Objects.equals(departureAirport, newTrip.departureAirport) &&
                Objects.equals(arrivalCity, newTrip.arrivalCity) &&
                Objects.equals(arrivalAirport, newTrip.arrivalAirport) &&
                Objects.equals(hotel, newTrip.hotel) &&
                Objects.equals(startDate, newTrip.startDate) &&
                Objects.equals(endDate, newTrip.endDate) &&
                Objects.equals(daysQuantity, newTrip.daysQuantity) &&
                type == newTrip.type &&
                Objects.equals(adultsQuantity, newTrip.adultsQuantity) &&
                Objects.equals(childrenQuantity, newTrip.childrenQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, id, departureCity, departureAirport, arrivalCity, arrivalAirport, hotel, startDate, endDate, daysQuantity, type, adultPrice, childPrice, isPromoted, adultsQuantity, childrenQuantity);
    }

    @Override
    public String toString() {
        return "NewTrip{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", departureCity=" + departureCity +
                ", departureAirport=" + departureAirport +
                ", arrivalCity=" + arrivalCity +
                ", arrivalAirport=" + arrivalAirport +
                ", hotel=" + hotel +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", daysQuantity=" + daysQuantity +
                ", type=" + type +
                ", adultPrice=" + adultPrice +
                ", childPrice=" + childPrice +
                ", isPromoted=" + isPromoted +
                ", adultsQuantity=" + adultsQuantity +
                ", childrenQuantity=" + childrenQuantity +
                '}';
    }
}


