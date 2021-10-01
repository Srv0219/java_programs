package com.java.srv.dfs;

public class addInsideIsland {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};

        System.out.println(countIsland(arr));
    }

    private static int countIsland(int[][] arr) {
        int sum = 0;
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && visited[i][j] == false) {
                    // sum =sum+arr[i][j];
                    dfs(arr, i, j, visited);
                    count++;
                    System.out.println(sum + "-" + i + "" + j);
                }
            }
        }
        return count;
    }
    private static void dfs(int[][] m, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= m.length || j >= m[0].length || m[i][j] == 0 || visited[i][j] == true) {
            return;
        }
        visited[i][j] = true;
        dfs(m, i - 1, j, visited);
        dfs(m, i, j - 1, visited);
        dfs(m, i + 1, j, visited);
        dfs(m, i, j + 1, visited);
//             dfs(m,i+1,j+1,visited);
//             dfs(m,i-1 ,j-1,visited)
//       public static boolean isValid(int [][] m ,int i , int j ){
//
//        return i<0||j<0||i>= m.length||j>=m[0].length|| (m[i][j]==1);
    }
}

