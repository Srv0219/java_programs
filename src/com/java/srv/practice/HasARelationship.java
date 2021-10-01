package com.java.srv.practice;

public class HasARelationship {
    public static void main(String[] args) {
        Carspeed cs = new bmw();
        cs.speed(1000,7);
    }
}

interface  Carspeed{
    void speed(double distance,double time);
}

interface CarFunction{
    void speed(double distance,double time);
}

class bmw implements Carspeed,CarFunction{

    @Override
    public void speed(double distance, double time) {
        double speed=distance/time;
        System.out.println(speed);
    }
}