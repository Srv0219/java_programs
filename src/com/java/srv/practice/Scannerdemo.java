package com.java.srv.practice;

import java.util.Scanner;

public class Scannerdemo {
    static String name ;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Name = "+name);
        sc.close();
    }
}
