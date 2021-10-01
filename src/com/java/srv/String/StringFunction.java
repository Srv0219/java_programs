package com.java.srv.String;

import java.nio.charset.StandardCharsets;

public class StringFunction {
    public static void main(String[] args) {
        String st ="sourav";
        //charAt
        System.out.println("charAt "+ st.charAt(3));
        //compareTo
        String st1 ="Sourav";
        String st2 =" Test";
        System.out.println("compareTo "+st1.compareTo(st2));
        //concat
        System.out.println("concat "+st1.concat(st2));
        //contains
        System.out.println("contains "+st.contains("rav"));
        //endsWith
        System.out.println("endsWith "+st.endsWith("a"));
        //startsWith
        System.out.println("startsWith "+st.startsWith("s"));
        //equals
        String obj1 = "Sourav";
        String obj2 = "sourav";
        System.out.println("equals "+st1.equals(st));
        System.out.println("equals "+obj1.equals(obj2));
        //equalsIgnoreCase
        System.out.println("equalsIgnoreCase "+obj1.equalsIgnoreCase(obj2));
        //getBytes
        byte [] b=st.getBytes(StandardCharsets.UTF_8);
        for (int i=0;i<st.length();i++){
            System.out.print("getBytes "+b[i]+" ");
        }
        System.out.println();
        //getChars
        char[] ch = new char[st.length()];
        st.getChars(1,3,ch,2);
        System.out.println("getChars "+ch);
        //indexOf
        System.out.println("indexOf "+st.indexOf("ra"));
        System.out.println("indexOf "+st.indexOf("ra",4));//didnt find sub string
        System.out.println("indexOf "+st.indexOf("ra",2));//find substring
        //intern
        String s1= "hello";
        String s4= s1.intern();
        String s2="hello";
        String s3=s1.intern();
        System.out.println("intern "+s1==s2);
        System.out.println("intern "+s2==s3);
        System.out.println("intern "+s1.equals(s4));
        //isEmpty
        String s5="";
        System.out.println("isEmpty "+st.isEmpty());
        System.out.println("isEmpty "+s5.isEmpty());
        //join
        String date = String.join("/","25","06","2018");
        String time = String.join(":", "12","10","10");
        System.out.println(date+" "+time);
        //lastIndexOf
        int index1=st.lastIndexOf('a');//returns last index of 's' char value
        System.out.println("lastIndexOf "+index1);
        int index2=st.lastIndexOf('a',3);//returns last index of 's' char value
        System.out.println("lastIndexOf "+index2);
        int index3=st.lastIndexOf('a',5);//returns last index of 's' char value
        System.out.println("lastIndexOf "+index3);
        //length()
        System.out.println("length "+st.length());//st.length()& array contains arr.length;
        //replace
        String r="Sourav Adak has Adak ";
        System.out.println(r.replace("Adak","Sourav"));
        //replaceAll
        String ra="Sourav Adak Adak ";
        System.out.println(ra.replaceAll("\\s",""));
        //split
        String name ="Sourav zfdbdz";
        String[] srr =name.split("\\s");
        for (int i=0;i<srr.length;i++){
            System.out.println(srr[i]);
        }
        //startsWith
        System.out.println(st.startsWith("s"));
        System.out.println(st.startsWith("v"));
        //substring
        System.out.println(st.substring(3));
        System.out.println(st.substring(3,5));
        //toCharArray
        char[] charr =st.toCharArray();
        for (int i=0;i<charr.length;i++){
            System.out.println(charr[i]);
        }
        //toLowerCase
        String lo="JAVATPOINT HELLO stRIng";
        String s1lower=lo.toLowerCase();
        System.out.println(s1lower);
        //toUpperCase
        String up="    javapoint HELLO stRIng  ";
        String s1upper=lo.toUpperCase();
        System.out.println(s1upper);
        //trim
        System.out.println(s1upper.trim());
        //valueOf
        int value=30;
        String val=String.valueOf(value);
        System.out.println(value+10);
        System.out.println(val+10);
    }
}
