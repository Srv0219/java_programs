package com.java.srv.practice;

public class HasARelation {
    public static void main(String[] args) {
        Address1 address1 = new Address1();
        address1.setCity("rourkela");
        address1.setState("Odisha");
        RollNo r = new RollNo(1,new Name("Sourav","Adak"),address1);
       //RollNo r1 = new RollNo(2,new Name("Tan","Adak"),new Address("rourkela","orissa"));
       // RollNo r2 = new RollNo(3,new Name("prk","Adak"),new Address("rourkela","orissa"));
       // System.out.println(r.roll+" "+r.name.firstName+" "+r.name.lastName+" "+r.adrss.city+" "+r.adrss.state);
       // System.out.println(r1.roll+" "+r1.name.firstName+" "+r1.name.lastName+" "+r1.adrss.city+" "+r1.adrss.state);
       // System.out.println(r2.roll+" "+r2.name.firstName+" "+r2.name.lastName+" "+r2.adrss.city+" "+r2.adrss.state);
        System.out.println((r.roll+" "+r.name.firstName+" "+r.name.lastName+" "+ address1.getCity()+ address1.getState()));
    }
}
/*class Address{
 String city;
 String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}*/
class Name{
String firstName;
String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
class RollNo{
    int roll;
    Name name;
    Address1 adrss;

    public RollNo(int roll, Name name, Address1 adrss) {
        this.roll = roll;
        this.name = name;
        this.adrss = adrss;
    }
}