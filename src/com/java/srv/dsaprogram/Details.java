package com.java.srv.dsaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Details {
    public static void main(String[] args) {
        HashMap<Integer, HashMap<String, ArrayList<String>>> rolladd = new HashMap<Integer, HashMap<String, ArrayList<String>>>();
        HashMap<String, ArrayList<String>> nameadd = new HashMap<>();

        detailInsert(1, "Saurav", "Add1", rolladd, nameadd);
        detailInsert(2, "Saurav1", "Add2", rolladd, nameadd);
        List<HashMap<Integer, HashMap<String, ArrayList<String>>>> hm = detailInsert(1, "Saurav", "Add2", rolladd, nameadd);

        System.out.println(hm);

    }

    private static ArrayList<HashMap<Integer, HashMap<String, ArrayList<String>>>> detailInsert(int roll, String name, String adrss,
                                                                                                HashMap<Integer, HashMap<String, ArrayList<String>>> rolladd, HashMap<String, ArrayList<String>> nameadd) {
        ArrayList<HashMap<Integer, HashMap<String, ArrayList<String>>>> hashMapList = new ArrayList<>();

        //  ArrayList<String> adrssadd = new ArrayList<>();
        ArrayList<String> adrssadd = nameadd.get(name);


        if (rolladd.get(roll) == null) {
            if (nameadd.get(name) == null) {
                if (adrssadd == null) {
                    adrssadd = new ArrayList<>();
                    adrssadd.add(adrss);
                }
                nameadd.put(name, adrssadd);
            }
            rolladd.put(roll, nameadd);

        } else {
            if (rolladd.containsKey(roll)) {
                if (nameadd.containsKey(name)) {
                    adrssadd.add(adrss);
                }
                nameadd.put(name, adrssadd);
            }
            rolladd.put(roll, nameadd);
        }
        hashMapList.add(rolladd);
        return hashMapList;
    }
}
