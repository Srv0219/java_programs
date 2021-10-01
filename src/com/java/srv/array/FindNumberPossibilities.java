package com.java.srv.array;

import java.util.ArrayList;

public class FindNumberPossibilities {
    public static void main(String[] args) {
        int val =60;
        int[] arr ={10,20,30,40};

        findNumber(arr,val);
    }

    private static void findNumber(int[] arr, int val) {
        int str=0;

        for(int i=0;i< arr.length;i++){
            ArrayList<Integer>    ar = new ArrayList<>();
                str = 0;
                for(int j = 0 ; j<arr.length ; j++){
                     str = str+arr[j];
                     ar.add(arr[j]);
                    if(str == val){
                        System.out.println(ar);
                    }

                }
              /*  str=str+arr[i];
            System.out.println(arr[i]);
                if (str==val){
                    System.out.println("ans "+str);
                    break;*/
                }


        }
    }

