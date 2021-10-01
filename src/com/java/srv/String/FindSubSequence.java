package com.java.srv.String;

import java.util.ArrayList;

public class FindSubSequence {
    public static void main(String[] args) {
        String st ="Abc";

        ArrayList<String> ans=subSequence(st);
        System.out.println(ans);
    }

    private static ArrayList<String> subSequence(String st) {
        if (st.length()==0){
            ArrayList<String> arr =new ArrayList<>();
            arr.add("");
            return arr;
        }
       char ch=  st.charAt(0);
        String ros = st.substring(1);
        ArrayList<String> call=subSequence(ros);

      ArrayList<String> mcall= new ArrayList<String>();
      for (int i=0;i< call.size();i++){
          mcall.add(""+call.get(i));
          mcall.add(ch+call.get(i));
      }
     return mcall;
    }
}
