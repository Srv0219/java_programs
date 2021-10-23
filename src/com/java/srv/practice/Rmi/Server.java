package com.java.srv.practice.Rmi;

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws Exception {
        AddC addC = new AddC();
        Naming.rebind("ADD",addC);
        System.out.println("Server Started");
    }
}
