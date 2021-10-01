package com.java.srv.String;

import java.util.Arrays;

public class SortStringUsingbButeForce {
    public static void main(String[] args) {
        //String st = "uvysivgayuarg";
        String [] arr  = {"Saurav","Saurav" , "Adak" , "Adk", "Test"};
       // char arr[]=st.toCharArray();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i].compareTo(arr[j])>0){
                    String val =arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }
//                arr[i]=arr[i];
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
//aaggirsuuvvyy