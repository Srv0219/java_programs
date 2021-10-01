package com.java.srv.array;

import java.util.*;

public class EmployeeUnderEmployee {

    static Map<String, ArrayList<String>> result = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args) {
        HashMap<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("A", "C");
        dataSet.put("B", "C");
        dataSet.put("C", "F");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("F", "F");

        populateResult(dataSet);
        System.out.println("result = " + result);
        printResult(result,"F");

    }


    private static void populateResult(HashMap<String, String> dataSet) {

        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();


        for (Map.Entry<String, String> entry : dataSet.entrySet()) {
            String emp = entry.getKey();
            String mngr = entry.getValue();
            if (!emp.equals(mngr)) // excluding emp-emp entry
            {

                List<String> li = hm.get(mngr);
                if (li == null) {
                    li = new ArrayList<String>();
                    hm.put(mngr, li);
                }
                li.add(emp);
            }
        }
        System.out.println(hm);
        for (String mngr : dataSet.keySet())
           result  = populateResultUtil(mngr, hm);
    }



    private static HashMap<String, ArrayList<String>> populateResultUtil(String mngr, Map<String, List<String>> mngrEmpMap) {
        ArrayList<String> count = new ArrayList<>();

        if (!mngrEmpMap.containsKey(mngr)) {

            result.put(mngr, count);
           /// return 0;
        }
        else if (result.containsKey(mngr)) {
            count = result.get(mngr);
        }
        else {
            List<String> directReportEmpList = mngrEmpMap.get(mngr);
            //count = directReportEmpList.size();
            for (String directReportEmp : directReportEmpList)
                //count += populateResultUtil(directReportEmp, mngrEmpMap);
             count.add(directReportEmp);
              result.put(mngr, count);
        }
       return (HashMap<String, ArrayList<String>>) result;

    }


    private static void printResult(Map<String, ArrayList<String>> result, String input ) {

        HashMap<String , Boolean> hs = new HashMap<String, Boolean>();
        LinkedList<String> queue = new LinkedList<>();
        hs.put(input , true);
        queue.add(input);
       // System.out.println(input);

        while (queue.size() != 0) {
            String val = queue.poll();
            System.out.println(val);

            for (int i = 0; i < result.get(val).size(); i++) {
                if(hs.get(result.get(val).get(i))== null) {

                    hs.put(result.get(val).get(i),true);
                    queue.add(result.get(val).get(i));
                }

            }
        }


    }}

