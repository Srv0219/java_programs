package com.java.srv.functionsRegx;

public class sumOfNumber {
    public static void main(String[] args) {
        String num = "ab1cc23de7";
        sumNumber(num);
    }


    //1+23+7=31
    private static void sumNumber(String num) {
        int sum = 0;

        String[] st = num.split("\\D");
        for (int i = 0; i < st.length; i++) {
            if (st[i].equals("")) {
                continue;
            } else {
                int a = Integer.parseInt(st[i]);
                sum = sum + a;

            }


        }
        System.out.print(sum);
    }
    }

