package com.java.srv.practice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        String name = sc.nextLine();
        System.out.println("Roll : ");
        int  roll = sc.nextInt();
        System.out.println("Fees : ");
        double  fees = sc.nextDouble();

        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Fees : "+fees);

    }
}
