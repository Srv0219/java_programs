package com.java.srv.String;

public class AlphaNumericNo {
    public static void main(String[] args) {
        String s ="by42r94y101f4308u";
        String  []st =s.split("\\D");
       for (int i=0;i< st.length;i++){
           System.out.print( st[i]);

       }
    }

}
