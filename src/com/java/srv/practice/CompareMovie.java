package com.java.srv.practice;


import java.util.ArrayList;
import java.util.Collections;

public class CompareMovie  {

    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        for(Movie m : list){
            System.out.println(m.name +" , " + m.rating + " , "+ m.year);
        }
    }


}
