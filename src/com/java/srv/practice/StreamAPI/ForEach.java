package com.java.srv.practice.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("s", "d", "d", "f", "s");

      /*  Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };*/

        //lamda expression
        Consumer<String> consumer = i -> System.out.println(i);

        li.forEach(consumer);
    }
}
