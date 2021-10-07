package com.java.srv.practice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

       /* System.out.println(li.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0,(c,e)->c+e));*/

      /*  Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 5 == 0;
            }
        };*/

        //  Predicate<Integer> p = (i) -> i % 5 == 0;


       /* System.out.println(li.stream()
                .filter(i -> i % 5 == 0)
                .map(i -> i * 2)
                .reduce(0, (c, e) -> c + e));*/

        /*System.out.println(li.stream()
                .filter(i -> i % 5 == 0)
                .map(i -> i * 2)
                .findFirst()
                .orElse(0)); */
        System.out.println(li.stream()
                .filter(StreamFilter::isDivisible)
                .map(StreamFilter::mapDouble)
                .findFirst()
                .orElse(0));
    }

    public static boolean isDivisible(int i) {
        System.out.println("is div" + i);
        return i % 5 == 0;
    }

    public static int mapDouble(int i) {
        System.out.println("is mapDouble" + i);
        return i * 2;
    }
}

//FunctionalInterface