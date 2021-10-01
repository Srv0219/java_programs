package com.java.srv.functionsRegx;

public class mobileValidation {

    public static void main(String[] args) {
        String mobNum = "+91 9620517919";
        mobiNumValidator(mobNum);

    }

    private static void mobiNumValidator(String mobNum) {

    boolean match =  mobNum.matches("\\+?\\d{2}\\s?\\d{0,10}");

    if(match==false){
        System.out.print("Mobile number not valid");
    }else
    {
        System.out.print("Mobile  number valid");

    }
    }


}
