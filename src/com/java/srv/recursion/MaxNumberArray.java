package com.java.srv.recursion;

public class MaxNumberArray {
    public static void main(String[] args) {
        int[] arr ={1,2,4,2,1,8,7,9,3,6};


        int res=maxRecursion(arr,0);
        System.out.println(res);

    }

    private static int maxRecursion(int[] arr, int i) {
      if(arr.length-1==i) {
          return arr[i];
      }


        int max= maxRecursion(arr, i + 1);

         if(max>arr[i]){
             return max;
         }
         else{
             return arr[i];
         }

      }
    }

