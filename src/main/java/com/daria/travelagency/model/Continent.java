package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @NotNull
    private String name;

    @OneToMany(mappedBy = "continent")

    private List<Country> countries;

    public Continent() {
    }

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
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

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return id == continent.id &&
                Objects.equals(name, continent.name) &&
                Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countries);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
