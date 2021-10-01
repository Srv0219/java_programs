package com.java.srv.practice.thread;

public class DemonThread {
    public static void main(String[] args) {
        demon1 d1= new demon1();
        demon2 d2 = new demon2();

        d1.setDaemon(true);
        d1.start();
        d2.start();

    }
}

class demon1 extends Thread{
    public void run(){
       for (int i=0;i<5;i++){
           System.out.println("demon1"+i);
       }
    }
}

class demon2 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("demon2"+i);
        }
    }
}
