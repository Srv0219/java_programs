package com.java.srv.practice.wildcard;

import java.util.List;

public class UpperBound {
    public double sum(List<? extends Number> list){
       double sum=0.0;
       for (Number i : list){
           sum=sum+i.doubleValue();
       }
       return sum;
    }
}
