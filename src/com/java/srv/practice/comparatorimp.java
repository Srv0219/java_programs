package com.java.srv.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatorimp {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(305);
        al.add(998);
        al.add(774);
        al.add(236);
        al.add(881);
        Comparator<Integer> com =new comparator1();
        Collections.sort(al,com);
        for (int i: al){
            System.out.println(i);
        }
    }
}

class comparator1 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       if (o1%100>o2%100){ //%10,%100,%1000
           return 1;
       }
       return -1;
    }
}
