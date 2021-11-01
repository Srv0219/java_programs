package com.java.srv.fourFifty.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffleString {
    public static void main(String[] args) {
        String str1 = "Red";
        String str2 = "Orange";
        String str3 = "Blue";

        String str4 = str1 + str2 + str3;
        List<String> li = new ArrayList<>();
        for (int i = 0; i < str4.length(); i++) {
            li.add(String.valueOf(str4.charAt(i)));
        }
        Collections.shuffle(li);
        str4 = "";
        for (String i : li) {
            str4 = str4 + i;
        }
        System.out.println(str4);
    }
}
