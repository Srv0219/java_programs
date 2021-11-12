package com.java.srv.DynamicProgramming;

public class CountBinaryStrings {
    public static void main(String[] args) {
        int n = 6;
        usingArray(n);
        usingVariable(n);
    }

    private static void usingVariable(int n) {
        int odp0 = 1;
        int odp1 = 1;
        for (int i = 2; i <= n; i++) {

            int ndp0 = odp1;
            int ndp1 = odp0 + odp1;

            odp0 = ndp0;
            odp1 = ndp1;

        }
        System.out.println(odp0 + " " + odp1 + " = " +( odp0 + odp1));
    }

    private static void usingArray(int n) {
        int dp0[] = new int[n + 1];
        int dp1[] = new int[n + 1];

        dp0[1] = 1;
        dp1[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp1[i] = dp1[i - 1] + dp0[i - 1];
            dp0[i] = dp1[i - 1];
        }
        System.out.println(dp0[n] + dp1[n]);
    }
}
