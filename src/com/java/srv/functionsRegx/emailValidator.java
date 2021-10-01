package com.java.srv.functionsRegx;

public class emailValidator {
    public static void main(String[] args) {
        String email = "adak.sourav2@gmail.com";

        emailValid(email);


    }
    private static void emailValid(String email) {
        //boolean match =  email.matches("\\+?\\d{2}\\s?\\d{0,10}");
        boolean match = email.matches("[a-zA-Z0-9._-]+@\\D{2,}\\.?\\D{2,}");

        if (match == true){

            System.out.print("Correct email");
        }
        else {
            System.out.print("Email pattern not matched");
        }

    }




}
// ?
// +
// x{n}
// x{n,}
// x{n,m}
//