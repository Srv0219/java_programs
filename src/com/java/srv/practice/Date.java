package com.java.srv.practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);
    }
}
