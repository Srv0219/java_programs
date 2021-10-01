package com.java.srv.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberLetterCombination {


    public static void main(String[] args) {
        String digits = "234";
        ArrayList<String> al2 = (ArrayList<String>) letterCombinations(digits);
        for (int i = 0; i < al2.size(); i++) {
            System.out.println(al2.get(i));
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()){
            return res;
        }

        helper(res, digits, "", 0);
        return res;
    }

    private static void helper(List<String> res, String digits, String path, int i) {
        String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        System.out.println(i);
        if (i == digits.length()) {
            res.add(path);
            return;
        }
        int digit = digits.charAt(i) - '0';
        for (int j = 0; j < str[digit].length(); j++) {
            Character ch = str[digit].charAt(j);
            helper(res, digits, path + ch, i + 1);
        }
    }
}

/*
        hs.put(1, "");
        hs.put(2, "abc");
        hs.put(3, "def");
        hs.put(4, "ghi");
        hs.put(5, "jkl");
        hs.put(6, "mno");
        hs.put(7, "pqrs");
        hs.put(8, "tuv");
        hs.put(9, "wxyz");
        hs.put(0, "");

 */