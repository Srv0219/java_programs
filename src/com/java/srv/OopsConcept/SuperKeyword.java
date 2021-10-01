package com.java.srv.OopsConcept;

public class SuperKeyword {

    public static void main(String[] args) {
        audi a = new audi();
        System.out.println(a.audiSpeed(200,2));
    }

}

class Cars{

    public  int speed(int distance,int time){
        int speed=distance/time;
        return speed;
    }
}

class bmw extends Cars{
    public  int bmwSpeed(int distance,int time){
       return speed(distance, time);
    }
}

class audi extends Cars{
    public  int audiSpeed(int distance,int time){
        System.out.println(super.speed(400,3));
        return speed(distance, time);
    }

}
