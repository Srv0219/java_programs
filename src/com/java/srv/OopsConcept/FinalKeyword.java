package com.java.srv.OopsConcept;

public class FinalKeyword {


     public static void familyName(String name,final String title){
            //title = "sharma";
         System.out.println(name+ " "+title);

     }

    public static void main(String[] args) {
        String name="Sourav";
        final String title ="Adak";

        familyName(name,title);

    }
}

