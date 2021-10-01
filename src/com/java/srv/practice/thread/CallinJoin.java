package com.java.srv.practice.thread;

public class CallinJoin {
    public static void main(String[] args) throws InterruptedException {
        calling1 c1 = new calling1();
        calling2 c2 = new calling2();
        calling2 c3 = new calling2();
        c1.start();
        System.out.println(c1.getName());
        System.out.println(c1.getPriority());
        System.out.println(c1.getStackTrace());
        System.out.println(c1.getState());
        System.out.println(c1.getId());
        System.out.println(c1.getContextClassLoader());
        System.out.println(c1.getThreadGroup());
        System.out.println(c1.isDaemon());


        c1.join();
        c2.start();
        System.out.println(c2.getName());
        System.out.println(c2.getPriority());
        c3.start();
        System.out.println(c3.getName());
        System.out.println(c3.getPriority());


    }
}
class callingJoin1 extends Thread{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("Calling1 - "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

class callingJoin2 extends Thread{
    public void run(){
        for (int i=20;i>0;i--){
            System.out.println("Calling2 - "+i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}