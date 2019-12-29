package com.daria.travelagency.dto;

import java.util.Objects;

public class TripView {
    private final long id;
    private final String title;

    public TripView(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripView tripView = (TripView) o;
        return id == tripView.id &&
                Objects.equals(title, tripView.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "TripView{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
