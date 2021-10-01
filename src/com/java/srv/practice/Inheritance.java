package com.java.srv.practice;

public class Inheritance extends Divide {
    static  int a=10;
    static  int b=20;
    public static void main(String[] args) {
        Divide d = new  Divide();
          int s1= d.divCalc(a,b);
        int s2= d.addCalc(a,b);
        int s3= d.multiplyCalc(a,b);
        int s4= d.subCalc(a,b);
        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
    }
}
 class Add {
    public int addCalc(int a, int b) {
        return a + b;
    }
}
 class Multiply extends Add {
    public int multiplyCalc(int a, int b) {
        return a * b;
    }
}
 class Subtract extends Multiply {
    public int subCalc(int a,int b){
        return a-b;
    }
}
 class Divide extends Subtract {
    public int divCalc(int a,int b){
        return a/b;
    }
}
