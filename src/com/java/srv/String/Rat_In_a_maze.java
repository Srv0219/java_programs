package com.java.srv.String;

import java.util.ArrayList;

public class Rat_In_a_maze {
    public static void main(String[] args) {

        int[][] arr = {{1, 0, 0, 0},
                       {1, 1, 0, 1},
                       {0, 1, 0, 0},
                       {1, 1, 1, 1}};
        int sr = 0;
        int sc = 0;
        int dr = arr.length - 1;
        int dc = arr.length - 1;
        ratInMaze(arr, sr, sc, dr, dc);
    }

    private static void ratInMaze(int[][] arr, int sr, int sc, int dr, int dc) {
        //   boolean visited[][]=new boolean[arr.length][arr[0].length];

        ArrayList<String> ress = dfsPath(arr, sr, sc, dr, dc);
        System.out.println(ress);

    }

    private static ArrayList<String> dfsPath(int[][] arr, int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> str = new ArrayList<>();
            str.add("");
            return str;
        }
        else if (sr >= dr || sc >= dc || sr < 0 || sc < 0 || arr[sr][sc] == 0) {

           // ArrayList<String> str = new ArrayList<>();
            //return str;
        }
            ArrayList<String> hor = new ArrayList<>();
            ArrayList<String> ver = new ArrayList<>();

//        visited[i][j]=true;
            if (sr < dr && arr[sr][sc] == 1) {
                hor = dfsPath(arr, sr + 1, sc, dr, dc);
            }
            if (sc < dc && arr[sr][sc] == 1) {
                ver = dfsPath(arr, sr, sc + 1, dr, dc);
            }

            ArrayList<String> res = new ArrayList<>();

            for (int l = 0; l < hor.size(); l++) {
                res.add("h" + hor.get(l));
            }
            for (int m = 0; m < ver.size(); m++) {
                res.add("v" + ver.get(m));
            }
            return res;
        }
    }


//00 01 02
//10 11 12
//20 21 22