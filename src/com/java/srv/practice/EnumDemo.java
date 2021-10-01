package com.java.srv.practice;

public class EnumDemo {
    enum Names{
        SOURAV{},ADHISH,HARSH,ANUDEEP,ROHIT      //you can write inside the class
    }
    public static void main(String[] args) {
        // to display enum value
    Names n = Names.ANUDEEP;
        System.out.println(n);

    //to display value using switch case
    switch (n){
        case HARSH:
            System.out.println("Harsh is placed in cyber security");
            break;
        case SOURAV:
            System.out.println("Sourav is Doing enum");
            break;
        case ADHISH:
            System.out.println("Adhish is doing merin stack");
            break;
        case ANUDEEP:
            System.out.println("Anudeep is playing game");
            break;
        case ROHIT:
            System.out.println("Rohit has setup his own business");
            break;
        default:
            System.out.println("Ever one is busy except anudeep");

    }

    //to display all values
        for(Names m:Names.values()){
            System.out.print(m+" ");
        }


    }

}

//enum Names{
//    SOURAV,ADHISH,HARSH,CHINTU,ROHIT      //you can write outside the class
//}
