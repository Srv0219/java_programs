package com.java.srv.matrix;

public class pyramidTwo {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        pyramidPattern(a);
    }

    private static void pyramidPattern(int[][] a) {
        for (int i =0;i< a.length;i++){
            for(int j=a.length-i;j>1;j--){
                System.out.print(". ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* " +" ");
            }
            System.out.println();
        }
    }

}
