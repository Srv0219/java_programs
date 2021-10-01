package com.java.srv.practice;

public class Exceptionw {
    public static void main(String[] args) {

        int a=10;
        int b=10;
        try {
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("COuld not find the result , may be Arthemetic exception" + e);
        }catch (NullPointerException e){
            System.out.println("COuld not find the result , may be Null pointer exception" + e);
        }catch (Exception e){
            System.out.println("COuld not find the result , may be  exception" + e);
        } finally {
            System.out.println("kjjsdhsdkjhsdj");
        }
    }

}
