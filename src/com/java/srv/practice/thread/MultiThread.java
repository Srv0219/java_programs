package com.java.srv.practice.thread;

public class MultiThread {
    public static void main(String[] args) {
     Multi m= new Multi();
     m.start();
    }
}
 class Multi extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
}
