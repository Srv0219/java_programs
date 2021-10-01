package com.java.srv.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Prefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        //"dog","racecar","car"
        //"flower","flow","flight"

        longestCommonPrefix(strs);

    }

    public static String longestCommonPrefix(String[] strs) {

        /*HashSet<String> hs = new HashSet<>();
        for (int i =0 ;i< strs.length;i++){
            String conccat="";
            String split=strs[i];
            String strsdup[] = split.split("");
            for (int j=0;j< strsdup.length;j++){
                hs.add(strsdup[j]);
            }
            Iterator<String> it = hs.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
                conccat =conccat+ it.next();
            }
            strs[i]=conccat;
        }
*/


/*        String  comp= strs[0];
        String str = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=1;i< strs.length;i++){
           for (int j=0;j<strs[i].length();j++){
               if (strs[0].charAt(j)==strs[i].charAt(j)){
                   if (hm.get(strs[0].charAt(j))==null){
                       hm.put(strs[0].charAt(j),1);
                   }
                   else {
                       hm.put(strs[0].charAt(j),hm.get(strs[0].charAt(j))+1);
                   }
               }
           }

        }


        for (Map.Entry<Character, Integer> set : hm.entrySet()) {
            if (set.getValue() == strs.length-1 ) {
                str = str + set.getKey();
            }
        }
        System.out.println(str);
        return str;*/

        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        return prefix;
    }
}
