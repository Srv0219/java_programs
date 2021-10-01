package com.java.srv.OopsConcept;

public class OverridingBankIntrestRate {
    public static void main(String[] args) {
        System.out.println(sbiBank.sbiRateOfIntrest(10000,7,8));


    }
}
class bank{

    public static int rateOfIntrest( int p, int t,int r){
        int si=0;
        si=(p*t*r)/100;
        return si;
    }
}

class sbiBank extends bank{
    public static int sbiRateOfIntrest(int p, int t, int r){
        return rateOfIntrest(p,t,r);
    }
}
class hdfcBank extends bank{
    public static int hdfcRateOfIntrest( int p, int t,int r){

        return rateOfIntrest(10000,7,6);
    }
}
class denaBank extends bank{

    public static int denaRateOfIntrest( int p, int t,int r){
        return rateOfIntrest(10000,7,5);
    }
}

