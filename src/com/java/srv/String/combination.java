package com.java.srv.String;

public class combination {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int cb=0;
        int tb= arr.length;
        int ssf=0;
        int ts=2;
        String tsf="";
        combinationProb(arr,cb,tb,ssf,ts,tsf);
    }

    private static void combinationProb(int[] arr,  int cb, int tb, int ssf, int ts, String tsf) {
        if (cb==tb){
            if(ssf== ts){
                System.out.println(tsf);
            }
            return;
        }
        combinationProb(arr,cb+1,tb,ssf+1,ts,tsf+"i");
        combinationProb(arr,cb+1,tb,ssf,ts,tsf+"-");

    }
}
