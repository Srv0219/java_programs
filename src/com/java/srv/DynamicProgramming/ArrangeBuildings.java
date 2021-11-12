package com.java.srv.DynamicProgramming;

public class ArrangeBuildings {
    public static void main(String[] args) {
        int n=6;
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
}
