package com.java.srv.practice.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UpperBound upperBound = new UpperBound();
        List<Integer> list = Arrays.asList(4,5,6,7,8);
        System.out.println( upperBound.sum(list));
        // TODO Lower Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);

        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

        //Number list
        List<Number> list2= Arrays.asList(4,5,6,7);

        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);

        //Integer List
        List<Integer> list3= Arrays.asList(1,2,3);

        //Double list
        List<Double> list4=Arrays.asList(1.1,2.2,3.3);

        printlist(list3);

        printlist(list4);
    }
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        System.out.println(list);
    }

    private static void printlist(List<?> list)
    {

        System.out.println(list);
    }

}
