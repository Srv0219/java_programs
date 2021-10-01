package com.java.srv.hashing;

import java.lang.reflect.Array;
import java.util.*;

public class LongestConsecutiveSubArray {
    public static void main(String[] args) {
       int[] arr = {1, 9, 3, 10, 4,15, 20, 2,11,12,13,14};
       longestSubarray(arr);
    }

    private static void longestSubarray(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer>  al;
        int count=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
          hs.add(arr[i]);
        }
       // System.out.println(hs);

        for (int i=0;i<arr[i];i++){
            if (!hs.contains(arr[i]-1)){
                int j = arr[i];
                al=new ArrayList<Integer>();
                while (hs.contains(j)) {

                    al.add(j);
                    j++;
                    count++;
                }
                hm.put(count,al);
             //  System.out.println(hm);
                count=0;
              //  System.out.println();
            }
        }

        for (Map.Entry<Integer,ArrayList<Integer>> set: hm.entrySet()){
            if (set.getKey()>max){
                max=set.getKey();
            }
        }
        for (Map.Entry<Integer,ArrayList<Integer>> set: hm.entrySet()){
            if (set.getKey()==max){
                System.out.println(set.getKey()+" "+set.getValue());
            }
        }

    }
}
