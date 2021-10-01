package com.java.srv.arrayMatrix;

public class PrintLastFirst {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};

       int[] a = printNumberLastFirst(arr);
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static int[] printNumberLastFirst(int[] arr) {
        int a= arr.length;
        int[] str = new int[a];
        int first=0;
        int last=arr.length-1;
        int i=0;
        boolean b=true;

        while (first<last){

            if (b==true){

                 str[i]=arr[first++];
                 ++i;


            }
            else{
                str[i++]=arr[last--];

            }

            b=!b;

        }
return str;

        }

    }

