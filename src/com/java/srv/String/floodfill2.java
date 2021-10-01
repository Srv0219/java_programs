package com.java.srv.String;

public class floodfill2 {
    public static void main(String[] args) {
        int[][] arr ={{0,1,0,0,0,0,0},
                {0,1,0,1,1,1,0},
                {0,0,0,0,0,0,0},
                {1,0,1,1,0,1,1},
                {1,0,1,1,0,1,1},
                {1,0,0,0,0,0,0}};
        int sr=0;
        int sc=0;

         boolean[][] visit = new boolean[arr.length][arr[0].length];
        floodfill(arr,sr,sc,"",visit);
    }

    private static void floodfill(int[][] arr, int sr, int sc, String s, boolean[][] visit) {
    if (sr<0 ||sc<0 ||sr== arr.length||sc==arr[0].length||arr[sr][sc]==1||visit[sr][sc]==true){
        return;
    }
    if (sr== arr.length-1 && sc== arr[0].length-1){
        System.out.println(s);
        return;
    }
        visit[sr][sc]=true;
        floodfill(arr,sr-1,sc,s+"t",visit);
        floodfill(arr,sr,sc-1,s+"l",visit);
        floodfill(arr,sr+1,sc,s+"d",visit);
        floodfill(arr,sr,sc+1,s+"r",visit);
        visit[sr][sc]=false;
    }
}
