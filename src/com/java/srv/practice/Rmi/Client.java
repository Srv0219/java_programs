package com.java.srv.practice.Rmi;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args)throws Exception {
        AddI addI = (AddI)Naming.lookup("ADD");
        int n = addI.add(5,4);
        System.out.println("Add is : "+" "+n);
    }
}
