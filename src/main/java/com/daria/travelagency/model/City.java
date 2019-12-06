package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class City {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

    @NotEmpty
    @NotNull
    private String name;
//
//    @ManyToOne
//    private Country country;
//
////    @OneToMany
////    private Trips trips;
//
//    public City(@NotEmpty @NotNull String name) {
//        this.name = name;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
//    }
//
////    public Trips getTrips() {
////        return trips;
////    }
////
////    public void setTrips(Trips trips) {
////        this.trips = trips;
////    }
//
//    @Override
//    public String toString() {
//        return "City{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", country=" + country +
//                '}';
//    }
}
