package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

//@Entity
public class Country {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @NotEmpty
//    @NotNull
//    private String name;
//
//    @Enumerated(EnumType.STRING)
//    private Continent continent;
//
//    @OneToMany
//    private City city;
//
//
//    public Country(@NotEmpty @NotNull String name, Continent continent) {
//        this.name = name;
//        this.continent = continent;
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
//    public Continent getContinent() {
//        return continent;
//    }
//
//    public void setContinent(Continent continent) {
//        this.continent = continent;
//    }
//
//
//
//
//    @Override
//    public String toString() {
//        return "Country{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", continent=" + continent +
//                '}';
//    }
}
