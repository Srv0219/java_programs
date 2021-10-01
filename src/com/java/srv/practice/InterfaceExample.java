package com.java.srv.practice;

import java.util.Stack;

public class InterfaceExample {
    public static void main(String[] args) {
        Cars volvo = new Volvo();
        Cars bmw = new Bmw();
        Cars audi = new Audi();
        volvo.Carspeed(100,2);
        bmw.Carspeed(300,2);
        audi.Carspeed(1000,2);


    }
}

interface Cars{
    void Carspeed(int distance,int time);

}

class Volvo implements Cars{

    public void Carspeed(int distance,int time) {
        int speed=distance/time;
        System.out.println(speed);
    }
}

class Bmw implements Cars{

    public void Carspeed(int distance,int time) {
        int speed=distance/time;
        System.out.println(speed);
    }
}

class Audi implements Cars{

    public void Carspeed(int distance,int time) {
        int speed=distance/time;
        System.out.println(speed);
    }
}
