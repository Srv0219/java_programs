package com.java.srv.practice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFunction {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
       /* int result = 0;
        for (int i : list) {
            result=result+i;
        }*/

        // System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));

        /*Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * 2;
            }
        };

         BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {
                return i + j;
            }
        };
        */

        Function<Integer, Integer> f = (i) -> i * 2;
        BinaryOperator<Integer> b = (i, j) -> i + j;


        //Stream s = list.stream();
       // Stream s1 = list.stream().map(f);
        Integer s2 = list.stream().map(f).reduce(0, b);
        System.out.println(s2);

    }
}
