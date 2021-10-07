package com.java.srv.practice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

      /*  Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };*/

        //lamda expression
        Consumer<Integer> consumer = i -> System.out.println(i);

       /* li.forEach(consumer);
        li.forEach(System.out::println);*/

        //li.forEach(i -> doubleIt(i));
        li.forEach(ForEach::doubleIt);
    }

    public static void doubleIt(int i) {
        StringBuilder stringBuilder =new StringBuilder("Hello");

        System.out.println(stringBuilder.append(i*2));
    }
}
