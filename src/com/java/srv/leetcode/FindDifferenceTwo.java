package com.java.srv.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FindDifferenceTwo {
    public static void main(String[] args) {
        String s = "ae";
        String t = "aea";

        System.out.println(findTheDifference(s, t));
    }

    private static char findTheDifference(String s, String t) {
        char ch=0;
        Queue<Character> queue = new LinkedList<>();
        for (int i=0;i<s.length();i++){
            queue.add(s.charAt(i));
        }
        for (int i=0;i<t.length();i++){
            if (queue.size()==0){
                ch= (char) (ch+t.charAt(i));
            }
            else if (queue.peek()!=t.charAt(i)){
                ch= (char) (ch+ queue.poll());
            }
            else {
                queue.poll();
            }

        }
        if (!queue.isEmpty()){
            ch= (char) (ch+ queue.poll());
        }

        return ch;
    }
}
