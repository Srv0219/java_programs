package com.java.srv.practice.thread;

public class ThreadSleep {

    public static void main(String[] args) {

    }
}

class sleepException extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
