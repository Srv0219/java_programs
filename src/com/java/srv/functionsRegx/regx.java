package com.java.srv.functionsRegx;

public class regx {

    public static void main(String[] args) {
        String a = "jshd1asjk2ha3kas45)_(()__@$%%%";
        regexhandler(a,"tets");
    }

    private static void regexhandler(String ssss, String aa) {
        System.out.print(aa);
        String[] st = ssss.split("\\s");
        for (int i = 0; i < st.length; i++) {
            System.out.print(st[i].trim() + ",");
        }
    }
    /*private static void regexhandler() {

        //int b = Integer.parseInt(a);
        //System.out.println(Integer.parseInt(a));
        String [] st = a.split("\\s");
        for(int i = 0 ; i<st.length; i++){
            System.out.print(st[i].trim() + ",");
    }*/
}
