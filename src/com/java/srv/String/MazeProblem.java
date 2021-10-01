package com.java.srv.String;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
       // String arr="abc";
        int sr=0;
        int sc=0;
        int dr=3;
        int dc=3;



      ArrayList<String> ans=   mazePath(sr,sc,dr,dc);
        System.out.println(ans);
    }

    private static ArrayList<String> mazePath( int sr, int sc, int dr, int dc) {

        if(sr==dr && sc == dc ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hor=new ArrayList<>();
        ArrayList<String> ver=new ArrayList<>();

        if(sr<dr){
             hor = mazePath(sr+1,sc,dr,dc);
        }
        if(sc<dc){
             ver = mazePath(sr,sc+1,dr,dc);
        }

        ArrayList<String> res = new ArrayList<>();

        for(int i = 0 ; i<hor.size(); i++){
            res.add("h"+hor.get(i));
        }
        for(int i = 0 ; i<ver.size(); i++){
            res.add("v"+ver.get(i));
        }


        return res;


    }
}
