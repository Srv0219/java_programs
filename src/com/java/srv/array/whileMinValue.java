package com.java.srv.array;

public class whileMinValue {
    public static void main(String[] args) {
        float min = Integer.MAX_VALUE;
         float[] arr = {123.3f,45.4f,837.5f,43334.3f};
         int i =0;
        while (i<arr.length){

            if (min>arr[i]){

                min = arr[i];
            }
            i++;
        }
        System.out.print(min);
    }
}
