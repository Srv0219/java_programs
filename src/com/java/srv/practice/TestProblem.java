package com.java.srv.practice;

public class TestProblem {
    public static void main(String[] args) {
        sanctionLoan();
    }

    private static void sanctionLoan() {
        Boolean customerAccount = true;
        Boolean customerLoan = false;
        Boolean custmerDue = true;
        Boolean managementApp = true;


        if (customerAccount == true && custmerDue == false) {

            System.out.println("grantloan");
        }else {
            System.out.println("rejectloan");
        }
        if (customerAccount == true && custmerDue == true &&managementApp==true ){

        }
    }
}
