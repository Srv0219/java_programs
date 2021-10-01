package com.java.srv.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abcde";
    permutationWays(str ,"");
       //System.out.println(result);
    }

    private static void permutationWays(String str ,String ans) {

        if(str.length()==0){
           /* ArrayList<String> stor= new ArrayList<>();
            stor.add("");
            return stor;*/
            System.out.println(ans);
            return;
        }


       // ArrayList<String> com=new ArrayList<>();
        for(int i = 0 ; i< str.length() ; i++){
            char st = str.charAt(i);
            String res= str.substring(0,i)+str.substring(i+1);
             permutationWays(res,ans+st);

        }
      /*  ArrayList<String> com1= new ArrayList<>();
        for (int i=0;i<com.size();i++){
                com1.add(com.get(i));
        }*/
       /* return com1*/;

    }
}
