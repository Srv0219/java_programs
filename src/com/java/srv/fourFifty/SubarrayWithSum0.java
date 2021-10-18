package com.java.srv.fourFifty;

import java.util.HashSet;

public class SubarrayWithSum0 {
    public static void main(String[] args) {
        int arr[]={4 ,2 ,-3 ,1 ,6,8,-4,3,1};

        subarrauSumZero(arr);
    }

    private static boolean subarrauSumZero(int[] arr) {
        HashSet<Integer> ans = new HashSet<>();
        int sum = 0;
        for (int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0 || arr[i]==0 || ans.contains(sum))
            {
              result(i,arr);
            }
            ans.add(sum);
        }
        return false;
    }

    private static void result(int i, int[] arr) {
        int sum=0;

        for (int j=i;j>=0;j--){
            System.out.print(arr[j]+" ");

            sum+=arr[j];
            if (sum==0){
                System.out.println();
                break;
            }
        }
    }
}
