package com.java.srv.practice.generic;

public class Main {
    public static void main(String[] args) {
        //Single generic Generic<T>
        Generic<Integer> mainobj1 = new Generic<>(10);
        System.out.println(mainobj1.getObj());

        Generic<Boolean> mainobj2 = new Generic<>(Boolean.TRUE);
        System.out.println(mainobj2.getObj());

        //Double generic Generic<T,V>
        GenericTwo<Integer,String> g2= new GenericTwo<>(1,"Sourav");
        g2.print();

        //Generic method
        MethodGeneric methodGeneric = new MethodGeneric();
        methodGeneric.genericDisplay(11);
        methodGeneric.genericDisplay("Sourav Adak");
        methodGeneric.genericDisplay(1.0);
        methodGeneric.genericDisplay(true);
        methodGeneric.genericDisplay('a');

    }
}
