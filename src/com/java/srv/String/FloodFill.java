package com.java.srv.String;

import java.util.ArrayList;

public class FloodFill {
    public static void main(String[] args) {
        int[][] arr ={{0,1,0,0,0,0,0},
                     {0,1,0,1,1,1,0},
                     {0,0,0,0,0,0,0},
                     {1,0,1,1,0,1,1},
                     {1,0,1,1,0,1,1},
                     {1,0,0,0,0,0,0}};
        int sr=0;
        int sc=0;
        int dc= 6;
        int dr= 5;
        ArrayList<String> ans=floodFill(arr,sr,sc,dr,dc);
        System.out.println(ans);

    }

    private static ArrayList<String> floodFill(int[][] arr, int sr, int sc, int dr, int dc) {
if (sr==dr&&sc==dc){
    ArrayList<String> ar=new ArrayList<>();
    ar.add("");
    return ar;
}

        ArrayList<String> hor=new ArrayList<>();
        ArrayList<String> ver=new ArrayList<>();
        if (sr<dr && arr[sr][sc]==0){
            hor=floodFill(arr,sr+1,sc,dr,dc);
        }
        if (sc<dc && arr[sr][sc]==0){
            ver=floodFill(arr,sr,sc+1,dr,dc);
        }


        ArrayList<String> str=new ArrayList<>();
        for (int i=0;i<hor.size();i++){
            str.add("d "+hor.get(i));
        }
        for (int i=0;i<ver.size();i++){
            str.add("r "+ver.get(i));
        }

        return str;

    }
}
