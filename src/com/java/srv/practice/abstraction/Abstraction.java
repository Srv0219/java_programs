package com.java.srv.practice.abstraction;

public class Abstraction {
    public static void main(String[] args) {
//
//        PhoneSamsung p =new PhoneSamsung();
//        p.songs();
//        p.games();
        PhoneNokia p1 =new PhoneNokia();
        p1.songs();
        p1.games();
        p1.camera();
        p1.message();
        p1.call();
        p1.sensor();


    }
}

abstract class phone{
    public void call(){
        System.out.println("calling..");
    }
    abstract public void songs();
    abstract public void games();

}

abstract class tablet extends phone{
    public void sensor(){
        System.out.println("senseing..");
    }
    abstract public void camera();
    abstract public void message();

}

class PhoneSamsung extends tablet{
     public void songs(){ System.out.println("Songs Playing.."); }
     public void games(){ System.out.println("Games Running.."); }
     public void camera(){
         System.out.println("camera Running..");
     }
     public void message(){
         System.out.println("message Running..");
     }
}

class PhoneNokia extends PhoneSamsung{
    public void songs(){
        System.out.println("Songs Playing Music..");
    }
    public void games(){
        System.out.println("Games Running Nice..");
    }
    public void camera(){
        System.out.println("camera Running..");
    }
    public void message(){
        System.out.println("message Running..");
    }
}