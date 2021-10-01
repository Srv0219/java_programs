package com.java.srv.practice.thread;

public class Callingrun {
    public static void main(String[] args) {
        calling1 c1 = new calling1();
        calling2 c2 = new calling2();
//        c1.start();
//        c2.start();

       c1.run();
       c2.run();
    }
}
class calling1 extends Thread{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("Calling1 - "+i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

class calling2 extends Thread{
    public void run(){
        for (int i=20;i>0;i--){
            System.out.println("Calling2 - "+i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}