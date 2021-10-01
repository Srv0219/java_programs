package com.java.srv.arrayMatrix;

public class maxNumberArray {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[][] a ={{1,2,3,4},
                {5,6,7,8},
                {9,177,11,12},
                {13,14,15,23}};
       int maximum = arrayMaxNumber(a,max);
        System.out.print(maximum+" ");
       boolean flag =  isEvenNum(maximum);
        System.out.print(flag);
    }

    private static boolean isEvenNum(int maximum) {

        return maximum % 2 == 0;
    }

    private static int arrayMaxNumber(int[][] a, int max) {
        int num;
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if (max<a[i][j]){
                    max=a[i][j];
                }

            }

        }
        //System.out.println(max);
        return max;
    }

}
