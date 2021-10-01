package com.java.srv.matrix;

public class diamondMatrix {
    public static void main(String[] args) {
        int a= 5;

        diamondPatternShape(a);

    }

    private static void diamondPatternShape(int a) {
        for(int i=a;i>0;i--){
         for (int j=i-1;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=i;k<=a;k++){
                System.out.print("* ");
           }
            System.out.println();
       }
        for(int l =a-1;l>=0;l--){
            for(int m =l;m<a-1;m++){
                System.out.print(" ");

            }
            for(int n =0;n<l;n++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}
