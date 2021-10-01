package com.java.srv.dfs;

public class NoOfIsland {
    public static void main(String[] args) {
        int[][] arr = {  {1, 1, 0, 0, 0},
                         {0, 1, 0, 0, 1},
                         {1, 0, 0, 1, 1},
                         {0, 0, 0, 0, 0},
                         {1, 0, 1, 0, 1} };

        System.out.println(countIsland(arr));
    }

    private static int countIsland(int[][] arr) {
        boolean[][]visited=new boolean[arr.length][arr[0].length];
        int count=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if (arr[i][j]==1 && visited[i][j]==false){

                    dfs(arr,i,j,visited);
                    count++;
                }

            }
        }
        return count;
    }

    private static void dfs(int[][] m, int i, int j, boolean[][] visited) {

       if( i<0||j<0||i>=m.length||j>=m[0].length||m[i][j]==0||visited[i][j]==true){
           return;
       }
       visited[i][j]=true;

             dfs(m,i-1,j,visited);
             dfs(m,i,j-1,visited);
             dfs(m,i+1,j,visited);
             dfs(m,i,j+1,visited);
//             dfs(m,i+1,j+1,visited);
//             dfs(m,i-1 ,j-1,visited);




//       public static boolean isValid(int [][] m ,int i , int j ){
//
//        return i<0||j<0||i>= m.length||j>=m[0].length|| (m[i][j]==1);
       }
    }

//    00 01 02 03
//    10 11 12 13
//    20 21 22 23

// { 0,0,1,1,1,1 },
//         { 0,0,1,1,1,1 },
//         { 1,1,1,1,1,0 },
//         { 0,1,1,1,1,0 },
//         { 1,1,0,0,1,0 } };