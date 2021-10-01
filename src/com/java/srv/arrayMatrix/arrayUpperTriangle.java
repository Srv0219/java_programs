package com.java.srv.arrayMatrix;

public class arrayUpperTriangle {
    public static void main(String[] args) {
        int[][] a ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        arrayUpper(a);
    }

    private static void arrayUpper(int[][] a) {
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i<=j){
                    System.out.print(a[i][j]+"");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
