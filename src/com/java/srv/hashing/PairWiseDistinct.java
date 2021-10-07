package com.java.srv.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWiseDistinct {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        Arrays.sort(arr);

        distinct(arr);
    }

    private static void distinct(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int length=0;
            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
            } else {
                while (length!= arr.length){
                    length++;
                    if (hm.get(length)==null){
                        hm.put(length,1);
                        int val=arr[i]-length;
                        if (val>0){
                            count=count+val;
                        }else{
                            val=val-val;
                            count=count+val;
                        }

                        break;
                    }

                }

            }
        }

    }
}
