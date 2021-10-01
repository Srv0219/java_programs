package com.java.srv.hackerank;

import java.util.ArrayList;
import java.util.HashMap;

public class StringCountNumber {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("a",1);
        hs.put("e",1);
        hs.put("i",1);
        hs.put("m",1);
        hs.put("q",1);
        hs.put("u",1);
        hs.put("y",1);
        hs.put("b",2);
        hs.put("f",2);
        hs.put("j",2);
        hs.put("n",2);
        hs.put("r",2);
        hs.put("v",2);
        hs.put("z",2);
        hs.put("c",3);
        hs.put("g",3);
        hs.put("k",3);
        hs.put("o",3);
        hs.put("s",3);
        hs.put("w",3);
        hs.put("d",4);
        hs.put("h",4);
        hs.put("l",4);
        hs.put("p",4);
        hs.put("t",4);
        hs.put("k",4);
        hs.put("A",1);
        hs.put("B",1);
        hs.put("C",1);
        hs.put("D",1);
        hs.put("E",1);
        hs.put("F",1);
        hs.put("G",1);
        hs.put("H",2);
        hs.put("I",2);
        hs.put("J",2);
        hs.put("N",2);
        hs.put("R",2);
        hs.put("V",2);
        hs.put("Z",2);
        hs.put("C",3);
        hs.put("G",3);
        hs.put("K",3);
        hs.put("O",3);
        hs.put("S",3);
        hs.put("W",3);
        hs.put("D",4);
        hs.put("H",4);
        hs.put("L",4);
        hs.put("P",4);
        hs.put("T",4);
        hs.put("K",4);
        String val = "Sourav";

        stringCount(hs,val);



    }

    private static void stringCount(HashMap<String, Integer> hs, String val) {

      int count=0;
        for (int i=0;i<val.length();i++){

            char cont = val.charAt(i);
            String st = Character.toString(cont);
            if (hs.containsKey(st)){

                count=count+hs.get(st);
            }
        }
        System.out.println(count);
    }
}
