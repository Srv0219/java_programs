package com.java.srv.functionsRegx;

import java.util.Locale;
import java.util.Scanner;

class Practice {

    public static String LetterCapitalize(String str) {
        String replaceNumeric=str.replaceAll("[^a-zA-Z0-9]", " ");
        String[] arr = replaceNumeric.split(" ");
        String res = "";

        for(int i = 0; i < arr.length; i++)
        {
            String first = arr[i].substring(0,1).toUpperCase();
            String rest = arr[i].substring(1).toLowerCase();
            res = res + first+rest+" ";

            System.out.println(res);
        }


        return res;

    }

    public static void main(String[] args) {
        // keep this function call here

        Scanner s = new Scanner(System.in);
       // String str=s.nextLine();
        String str="cats AND*Dogs-are Awesome";
        LetterCapitalize(str);


    }

}