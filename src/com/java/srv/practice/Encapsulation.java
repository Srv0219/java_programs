package com.java.srv.practice;

public class Encapsulation {
    public static void main(String[] args) {
        Student st =new Student();
        st.setName("Sourav Adak");
        st.setRoll(70);

        System.out.println(st.getName() +" " + st.getRoll());

    }
}
class Student{
    private int roll;
    private String name;

    public int getRoll(){
         return roll;
    }
    public void setRoll(int r){
        roll =r;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
}