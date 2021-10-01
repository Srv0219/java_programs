package com.java.srv.practice.abstraction;

public class AbstractExample {
    public static void main(String[] args) {
    Bank sbi = new Sbi();
        Bank pnb = new Pnb();
        Bank icici = new Icici();

        sbi.rateOfIntrest();
        pnb.rateOfIntrest();
        icici.rateOfIntrest();
    }
}

abstract class Bank{
    final int p=0;
    final int t=0;
    final int r=0;
    abstract void rateOfIntrest();

}

 class Sbi extends Bank{

    @Override
    void rateOfIntrest() {

      int p=1000;
      int t=2;
      int r=7;

        int si=(p*t*r)/100;
        System.out.println(si);
    }
}

class Pnb extends Bank{

    @Override
    void rateOfIntrest() {

        int p=21000;
        int t=1;
        int r=6;

        int si=(p*t*r)/100;
        System.out.println(si);
    }
}

class Icici extends Bank{

    @Override
    void rateOfIntrest() {

        int p=30000;
        int t=3;
        int r=8;

        int si=(p*t*r)/100;
        System.out.println(si);
    }
}