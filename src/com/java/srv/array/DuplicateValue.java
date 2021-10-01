package com.java.srv.array;

public class DuplicateValue {
    public static void main(String[] args) {

        int[] arr ={1,2,3,1,2,3,1,2,3,4};
        boolean [] v = new boolean[arr.length];
        System.out.println("Start time  " + System.currentTimeMillis());

        duplicateArr(arr ,v);
        System.out.println("Start time  " + System.currentTimeMillis());

    }

    private static void duplicateArr(int[] arr , boolean [] v) {
       /*int val= arr.length;
       int str=0; ;
       while (val>0) {
           for (int i = 0; i < arr.length; i++) {
               if (val == arr[i]) {
                  str=arr[i];
               }

           }
           val--;
           System.out.println(str);
       }*/

        for(int i = 0 ; i< arr.length ; i++)
        {
            for(int j =i+1 ; j<arr.length ; j++){

                if(arr[i] == arr[j])
                {
                    if(v[i] == false) {
                        System.out.println(arr[i]);
                        v[i] =true;

                    }
                    v[j] = true;
                }

            }
        }
    }

}
