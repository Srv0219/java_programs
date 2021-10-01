package com.java.srv.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupWord {
    public static void main(String[] args) {
        String[] words = {"may", "student", "students", "dog", "studentssess", "god", "cat", "act",
                "tab", "bat", "flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle"};
        groupWord(words);
    }

    private static void groupWord(String[] words) {
        HashMap<String, ArrayList<String> > hs = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            char[] charsA = words[i].toCharArray();
            Arrays.sort(charsA);
            String sortedString = new String(charsA);

            if(hs.get(sortedString)== null){
                al = new ArrayList<>();
                al.add(words[i]);
                hs.put( sortedString,al );
            }else
                al.add(words[i]);
                hs.put( sortedString,al);

           // System.out.println(words[i] + " " + sortedString);
            //}

        }
        System.out.println(hs);

      // String[] key = hs.keySet().toArray(new String[hs.size()]);
//        for (int i = 0; i < key.length; i++) {
//          for (int j = i+1; j<key.length; j++) {
//               if (key[i].equals(key[j])) {
//                    System.out.println(hs.get(i)+" "+hs.get(j));
//               }
//            }
//        }
    }
}

