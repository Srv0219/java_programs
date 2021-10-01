package com.java.srv.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupMultipleOccurance {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4};
        groupOccurance(arr);
    }

    private static void groupOccurance(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == null) {
                hm.put(arr[i], 1);
                al.add(arr[i]);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        for (int i = 0; i < al.size(); i++) {
            int str = 0;
            if (hm.containsKey(al.get(i))) {
                str = hm.get(al.get(i));
                while (str > 0) {
                    al2.add(al.get(i));
                    str--;
                }
            }
        }

        for (int i=0;i< al2.size();i++){
            System.out.print(al2.get(i)+" ");
        }
    }
}

