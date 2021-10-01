package com.java.srv.String;

import java.util.ArrayList;

public class StairProblrm {
    public static void main(String[] args) {
      //  String st="123";

        ArrayList<String> ans=stairWays(6);
        System.out.println(ans);
    }

    private static ArrayList<String> stairWays(int arr) {
            if(arr==0){
                 ArrayList<String> str =new ArrayList<>();
                 str.add("");
                 return str;
             } else if(arr<0) {
                    ArrayList<String> str =new ArrayList<>();
                    return str;
            }

        ArrayList<String> path1=stairWays(arr-1);
        ArrayList<String> path2=stairWays(arr-2);
        ArrayList<String> path3=stairWays(arr-5);

        ArrayList<String> res =new ArrayList<>();
        for (int i=0;i<path1.size();i++){
            res.add(1+path1.get(i));
        }
        for (int i=0;i<path2.size();i++){
            res.add(2+path1.get(i));
        }
        for (int i=0;i<path3.size();i++){
            res.add(3+path1.get(i));
        }
  return res;
    }
}
