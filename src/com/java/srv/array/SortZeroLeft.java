package com.java.srv.array;

public class SortZeroLeft {
    public static void main(String[] args) {
        int[] arr ={1,0,2,0,4,0,3,0,5,6,7,0,8,9};
        sortZero(arr);

        int[] arr2 =sortZero(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

    private static int [] sortZero(int[] arr) {
        boolean[] visit =new boolean[arr.length];
        int k=0;
        int[] str =new int[arr.length];
        int temp=0;
        for (int i=0;i< arr.length;i++) {
            if (0<arr[i]) {
                visit[i] = true;
                str[k] = arr[i];
                k++;
            }
        }
            for (int j=0;j< arr.length;j++){
                if (visit[j]==false&&0 == arr[j]){
                    visit[j]=true;
                    str[k]=arr[j];
                    k++;
                }
        }
//            for (int l=0;l< str.length;l++){
//                for (int m=l+1;m< str.length;m++) {
//                    if (str[l] > str[m]) {
//                        temp = str[l];
//                        str[l] = str[m];
//                        str[m]=temp;
//
//                    }
//                }
//            }
            return str;
    }
}
