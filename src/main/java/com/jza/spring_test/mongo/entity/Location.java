package com.jza.spring_test.mongo.entity;

public class Location {
    private String place;
    private String year;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Location(String place, String year) {

        this.place = place;
        this.year = year;
    }
}
