package com.daria.travelagency.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 5, max = 500)
    @NotEmpty
    @NotNull
    private String title;

    @NotEmpty
    @NotNull
    @Size(min = 5, max = 5000)
    private String description;

    @CreationTimestamp
    private LocalDateTime createdOn;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne
    private City departureCity;

    @ManyToOne
    private Airport departureAirport;

    @ManyToOne
    private City arrivalCity;

    @ManyToOne
    private Airport arrivalAirport;

    @OneToOne
    private Hotel hotel;

    private LocalDate startDate;
    private LocalDate endDate;
    private Integer quantityDays;

    private double adultPrice;
    private double childPrice;

    @Column(nullable = false)
    @org.hibernate.annotations.Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isPromoted;


    private Integer adultsQuantity;
    private Integer childrenQuantity;

    public Trip() {
    }

    public Trip(City departureCity, Airport departureAirport, City arrivalCity, Airport arrivalAirport, Hotel hotel, LocalDate startDate, LocalDate endDate, Integer quantityDays, Type type, double adultPrice, double childPrice, boolean isPromoted, Integer adultsQuantity, Integer childrenQuantity) {
        this.departureCity = departureCity;
        this.departureAirport = departureAirport;
        this.arrivalCity = arrivalCity;
        this.arrivalAirport = arrivalAirport;
        this.hotel = hotel;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityDays = quantityDays;
        this.type = type;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.isPromoted = isPromoted;
        this.adultsQuantity = adultsQuantity;
        this.childrenQuantity = childrenQuantity;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public Integer getQuantityDays() {
        return quantityDays;
    }

    public void setQuantityDays(Integer quantityDays) {
        this.quantityDays = quantityDays;
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
        Trip trip = (Trip) o;
        return id == trip.id &&
                Double.compare(trip.adultPrice, adultPrice) == 0 &&
                Double.compare(trip.childPrice, childPrice) == 0 &&
                isPromoted == trip.isPromoted &&
                Objects.equals(title, trip.title) &&
                Objects.equals(description, trip.description) &&
                Objects.equals(createdOn, trip.createdOn) &&
                type == trip.type &&
                Objects.equals(departureCity, trip.departureCity) &&
                Objects.equals(departureAirport, trip.departureAirport) &&
                Objects.equals(arrivalCity, trip.arrivalCity) &&
                Objects.equals(arrivalAirport, trip.arrivalAirport) &&
                Objects.equals(hotel, trip.hotel) &&
                Objects.equals(startDate, trip.startDate) &&
                Objects.equals(endDate, trip.endDate) &&
                Objects.equals(quantityDays, trip.quantityDays) &&
                Objects.equals(adultsQuantity, trip.adultsQuantity) &&
                Objects.equals(childrenQuantity, trip.childrenQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, createdOn, type, departureCity, departureAirport, arrivalCity, arrivalAirport, hotel, startDate, endDate, quantityDays, adultPrice, childPrice, isPromoted, adultsQuantity, childrenQuantity);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdOn=" + createdOn +
                ", type=" + type +
                ", departureCity=" + departureCity +
                ", departureAirport=" + departureAirport +
                ", arrivalCity=" + arrivalCity +
                ", arrivalAirport=" + arrivalAirport +
                ", hotel=" + hotel +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", quantityDays=" + quantityDays +
                ", adultPrice=" + adultPrice +
                ", childPrice=" + childPrice +
                ", isPromoted=" + isPromoted +
                ", adultsQuantity=" + adultsQuantity +
                ", childrenQuantity=" + childrenQuantity +
                '}';
    }
}

