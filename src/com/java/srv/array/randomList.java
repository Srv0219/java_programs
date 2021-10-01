package com.java.srv.array;

public class randomList {
    public static void main(String[] args) {
        int val = 300;
        specialNo(val);
    }

    private static void specialNo(int val) {
        int min = 0;
        int value = 0;
        for (Integer i = 0; i < val; i++) {

            if (i < 10) {
                System.out.println(i);
            } else {
                String str = i.toString();
                String[] st = str.split("(?<=.)");
                for (int j = 0; j < st.length; j++) {

                    min = Integer.parseInt(st[j]) - min;
                    value = value * 10 + Integer.parseInt(st[j].trim());
                }
                if (Math.abs(min) == 1) {
                    System.out.println(value);
                } else {
                    value = 0;
                    min = 0;
                    continue;
                }
                value = 0;
                min = 0;
            }


        }
    }
}
