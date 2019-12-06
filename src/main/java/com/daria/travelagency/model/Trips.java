package com.daria.travelagency.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Trips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @NotNull
    private String name;
//
//    @ManyToOne
//    private City city;
//
//
//    @ManyToOne
//    //private City to;
//    private Date beginDate;
//    private Date endDate;
//    private int quantityDays;
//    private Type type;
//    private double price;
//    private int freePlace;
//
//    public Trips(@NotEmpty @NotNull String name, Date beginDate, Date endDate, int quantityDays, Type type, double price) {
//        this.name = name;
////        this.from = from;
////        this.to = to;
//        this.beginDate = beginDate;
//        this.endDate = endDate;
//        this.quantityDays = quantityDays;
//        this.type = type;
//        this.price = price;
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
////    public City getFrom() {
////        return from;
////    }
////
////    public void setFrom(City from) {
////        this.from = from;
////    }
////
////    public City getTo() {
////        return to;
////    }
////
////    public void setTo(City to) {
////        this.to = to;
////    }
//
//    public Date getBeginDate() {
//        return beginDate;
//    }
//
//    public void setBeginDate(Date beginDate) {
//        this.beginDate = beginDate;
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }
//
//    public int getQuantityDays() {
//        return quantityDays;
//    }
//
//    public void setQuantityDays(int quantityDays) {
//        this.quantityDays = quantityDays;
//    }
//
//    public Type getType() {
//        return type;
//    }
//
//    public void setType(Type type) {
//        this.type = type;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getFreePlace() {
//        return freePlace;
//    }
//
//    public void setFreePlace(int freePlace) {
//        this.freePlace = freePlace;
//    }
//
//    @Override
//    public String toString() {
//        return "Trips{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
////                ", from=" + from +
////                ", to=" + to +
//                ", beginDate=" + beginDate +
//                ", endDate=" + endDate +
//                ", quantityDays=" + quantityDays +
//                ", type=" + type +
//                ", price=" + price +
//                ", freePlace=" + freePlace +
//                '}';
//    }
}
