package com.java.srv.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MobileNumberPatternCombination {
    public static void main(String[] args) {

    }
    private static Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

    private List<String> list = new ArrayList<>() ;

    public List<String> letterCombinations(String digits) {
        if (!digits.isEmpty())
            dfs(digits, "");
        return list ;
    }

    private void dfs ( String s, String res ) {
        if ( s.isEmpty() ) {
            list.add(res) ;
            return ;
        }
        String chars = map.get(s.charAt(0)) ;
        for ( char c : chars.toCharArray() ) {
            dfs( s.substring(1) , res+c );
        }
    }
}
