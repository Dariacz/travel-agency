package com.daria.travelagency.dto;

import com.daria.travelagency.model.Continent;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
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

    @NotNull
    @NotEmpty
    Continent continents;


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

    public Continent getContinents() {
        return continents;
    }

    public void setContinents(Continent continents) {
        this.continents = continents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewTrip newTrip = (NewTrip) o;
        return Objects.equals(title, newTrip.title) &&
                Objects.equals(description, newTrip.description) &&
                Objects.equals(continents, newTrip.continents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, continents);
    }

    @Override
    public String toString() {
        return "NewTrip{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", continents=" + continents +
                '}';
    }
}


