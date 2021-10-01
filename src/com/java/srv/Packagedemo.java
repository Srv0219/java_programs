package com.java.srv;

import com.java.srv.practice.Scannerdemo;

public class Packagedemo {
    int name=127;
    public static void main(String[] args) {
        Packagedemo p =new Packagedemo();
        Scannerdemo s = new Scannerdemo();
        System.out.println(p.name);

    }
}
