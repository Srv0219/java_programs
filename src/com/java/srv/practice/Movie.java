package com.java.srv.practice;

public class Movie implements Comparable<Movie> {
    public Movie(String name,  double rating , int year) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String name;
    public int year;
    public double rating;


    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.name);
    }
}
