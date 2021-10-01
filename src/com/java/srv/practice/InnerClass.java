package com.java.srv.practice;

public class InnerClass {
    public static void main(String[] args) {
        Outer o =new Outer();
        o.out();

//        Outer.inner o1 =o.new inner();    //if inner class is not static use this object to access inner class
//        o1.in();
        Outer.inner o1 =new Outer.inner();  //if inner class is  static use this object to access inner class
        o1.in();

    }
}
class Outer{
    public void out(){
        System.out.println("outer method");
    }

    static class inner{

        public  void in(){
            System.out.println("inner method");
        }
    }
}