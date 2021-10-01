package com.java.srv.functionsRegx;

public class split {
    public static void main(String[] args) {
        String a = "jshd1asjk2ha3kas45)_(()__@$%%%";

        //int b = Integer.parseInt(a);
        //System.out.println(Integer.parseInt(a));
        String [] st = a.split("\\D");
       for(int i = 0 ; i<st.length; i++){
           System.out.print(st[i].trim() + ",");
       }

    }
}

//D It only display number
//d It display only character and remove number
//W It remove special character
//w It display only special character
//s It remove space
