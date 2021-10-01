package com.java.srv.array;

public class minNoInArray {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE ;
        int[] arr ={67,-28,1,3,4,2,6,9,8,-2221,100};
        for (int i = 0;i<arr.length;i++){
            if(min>arr[i]){

                min=arr[i];
            }

            }
        System.out.print(min);
        }

    }
//
