package com.java.srv.practice.thread;

public class ThreadInterface {
    public static void main(String[] args) {
       name n = new name();
       Thread t = new Thread(n);
       t.start();

    }

}
class name implements Runnable{

    @Override
    public void run() {
        System.out.println("threads running");
    }
}