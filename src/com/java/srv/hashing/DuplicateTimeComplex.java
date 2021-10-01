package com.java.srv.hashing;

public class DuplicateTimeComplex {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,3,1,2,3,4};

        System.out.println("Start time" + System.currentTimeMillis());
        duplicateElement(arr);
        System.out.println("End time" + System.currentTimeMillis());

    }

    private static void duplicateElement(int[] arr) {

   /*  HashSet<Integer> hashSet = new HashSet<>();

        for(int i =0 ; i< arr.length; i++){

            if(!hashSet.contains(arr[i] + ", "))
            {
                    System.out.print(arr[i]);

            }
            hashSet.add(arr[i]);
        }
    }*/
        int ans = 0;
        for(int i =0 ; i< arr.length; i++){

            ans = ans ^ arr[i];
            System.out.println(ans);
        }
    }
/*

        int i=0;
        int j=1;
        while(i<arr.length) {
            while (j < arr.length){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                   break;
                }
            j++;
        }


            i++;
            j=i+1;
        }

    }
*/



}
