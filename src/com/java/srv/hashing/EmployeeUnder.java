package com.java.srv.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeUnder {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("A", "C");
        hm.put("B", "C");
        hm.put("C", "F");
        hm.put("D", "E");
        hm.put("E", "F");
        hm.put("F", "F");
        employeeUnder(hm);
    }

    private static void employeeUnder(HashMap<String, String> hm) {
        HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
        ArrayList<String> al =new ArrayList<>();
        String put;
        for (Map.Entry<String,String> set : hm.entrySet()){
            String emp = set.getKey();
            String mngr = set.getValue();

            if (!emp.equals(mngr)){

                 al.add(emp);
                hm2.put(mngr,al);
            }
        }
    }
}
