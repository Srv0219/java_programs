package com.java.srv.practice;

import java.util.*;

public class ComparatorDisp {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(7983);
        al.add(2856);
        al.add(7808);
        al.add(8745);
        al.add(2472);

        Comparator comp = new SortComp();
        Collections.sort(al,comp);

       Iterator  iterator = al.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

        System.out.println(" -------------------");
        ListIterator listIterator = al.listIterator();
/*
       while (listIterator.hasNext()){
           System.out.println(listIterator.next());
       }*/
        System.out.println(" -------------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}

