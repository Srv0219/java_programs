package com.java.srv.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlphaNumericNumber {
    public static void main(String[] args) {
        String s ="I 123am 4an5 6789automation2-34engineer56";
        String st1  = s.replaceAll("\\D" , " ").trim();
        System.out.println(st1);
        String  []st =st1.split(" ");

        int sum=0;
        for (int i=0;i< st.length;i++){
            /*if(st[i].equals(""))
            {
                continue;
            }else*/
            {
                sum = sum + Integer.parseInt(st[i]);

            }

            //arr[i]=Integer.parseInt(st[i]);
           //add=add+arr[i];
        }
        System.out.println(sum);
    }
}
