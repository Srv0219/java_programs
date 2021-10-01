package com.java.srv.functionsRegx;

public class mobileNumberValidation {
    public static void main(String[] args) {

        String mobNumber = "+91 (044)-(1111111)";

        numberValidation(mobNumber);
    }

    private static void numberValidation( String mobNumber) {
        Boolean match = mobNumber.matches("\\+?\\d{0,2}\\s\\(\\d{0,3}\\)\\-?\\(\\d{0,7}\\)");

        if(match == true){
            System.out.print("Correct Mobileno");
        }
        else {
            System.out.print("in-Correct Mobileno");
        }
    }

}
