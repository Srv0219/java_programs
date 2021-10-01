package com.java.srv.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String[] arr ={"geeks", "for", "geeks", "for",
                "geeks", "aaa" , "aaa"};

        repeatedArray(arr);
    }

    private static void repeatedArray(String[] arr) {
        int max=Integer.MIN_VALUE;
        HashMap<String,Integer> hs= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hs);
      //  System.out.println(max);
        ArrayList<String> al =new ArrayList<>();
        for (Map.Entry<String,Integer> set:hs.entrySet()){
            if (set.getValue()>max){
                max= set.getValue()-1;

            }

        }
        for (Map.Entry<String,Integer> set:hs.entrySet()){
            if (set.getValue()==max){
                al.add(set.getKey());
            }


        }

        System.out.println(al);
    }

}
