package com.java.srv.practice;

public class SyncronizedBlock {
    public static void main(String[] args) {
sync sc = new sync();
thread1 t1=new thread1(sc);
thread2 t2 =new thread2(sc);
t1.start();
t2.start();
    }
}

class sync{
    void printTable(int n) throws InterruptedException {
       synchronized (this){
           for (int i=0;i<10;i++){
               System.out.println(n*i);
               Thread.sleep(1000);
           }
       }
    }
}

class thread1 extends Thread{
    sync s;

    public thread1(sync s) {
        this.s = s;
    }

    public void run(){
        try {
            s.printTable(10);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
class thread2 extends Thread{
    sync s;

    public thread2(sync s) {
        this.s = s;
    }

    public void run(){
        try {
            s.printTable(20);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}