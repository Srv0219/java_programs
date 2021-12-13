package com.java.srv.practice.generic;

public class MethodGeneric {
     public  <T> void genericDisplay(T element){
         System.out.println(element.getClass().getName()+ " = "+element);

     }
}
