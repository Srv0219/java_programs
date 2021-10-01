package com.java.srv.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupWordsSameSet {
    public static void main(String[] args) {
        String words[] = {"may", "student", "students", "dog",
                "studentssess", "god", "cat", "act",
                "tab", "bat", "flow", "wolf", "lambs",
                "amy", "yam", "balms", "looped",
                "poodle"};
        groupSameWords(words);
    }

    private static void groupSameWords(String[] words) {
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        ArrayList<String> st = new ArrayList<>();
        for (int i=0;i< words.length;i++){
            char[] ch = words[i].toCharArray();
             Arrays.sort(ch);
            ch.toString();
            String com="";
           for (int j =0 ;j< ch.length;j++){
               com=com+ch[j];
           }

             if (hs.get(com)== null){
                 st = new ArrayList<>();
                 st.add(words[i]);
                 hs.put(com,st);
             }
             else {

                 st.add(words[i]);
                  hs.put(com,st);
             }

        }
        for (Map.Entry<String, ArrayList<String>> set : hs.entrySet()){
            System.out.println(set.getKey() + " "+ set.getValue());
        }

    }
}
