package com.java.srv.practice;

public class Constructor {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Teacher t2 = new Teacher(30000.1);
        System.out.println("Teacher id = "+t.id +"\n"+"Name = "+t.name+"\n"+"Salary = "+t2.salary);
    }

}
 class Teacher{
    int id;
    String name;
    Double salary;
   public Teacher() {
       id=10001;
       name="Sobhan Mishra";

    }
    public Teacher(Double s){
       salary = s;
    }

}
