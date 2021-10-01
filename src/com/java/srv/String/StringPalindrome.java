package com.java.srv.String;

public class StringPalindrome {
    public static void main(String[] args) {
        String st="Nitin";
       //  String handle=st.toLowerCase();
        //System.out.println(handle);
       String revString="";
       for (int i=st.length()-1;i>=0 ;i--){
          //  char ch = st.charAt(i);
          //revString = revString + st.charAt(i);
          revString = revString.concat(String.valueOf(st.charAt(i)));

       }
        if (st.equalsIgnoreCase(revString)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Plaindrome");
        }
    }

}
