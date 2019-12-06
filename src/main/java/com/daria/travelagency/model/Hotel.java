package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @NotNull
    private String name;
//    private String description;
//    private Rating rating;
//
//    @ManyToOne
//    private City city;
//
//    public Hotel(@NotEmpty @NotNull String name, String description, Rating rating) {
//        this.name = name;
//        this.description = description;
//        this.rating = rating;
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
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Rating getRating() {
//        return rating;
//    }
//
//    public void setRating(Rating rating) {
//        this.rating = rating;
//    }
//
//    public City getCity() {
//        return city;
//    }
//
//    public void setCountry(City country) {
//        this.city = country;
//    }
//
//    @Override
//    public String toString() {
//        return "Hotel{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", rating=" + rating +
//                ", country=" + city +
//                '}';
//    }
}
