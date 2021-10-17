package com.java.srv.array;

class LongestCommonSubArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 8, 2, 1};
        int B[] = {8, 2, 1, 4, 7};

        int n = A.length;
        int m = B.length;

        System.out.print(FindMaxLength(A, B, n, m));
    }
    static int FindMaxLength(int A[], int B[], int n, int m) {

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= m; j++)
                dp[i][j] = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (A[i] == B[j])
                    dp[j][i] = dp[j + 1][i + 1] + 1;
            }
        }
        int maxm = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                maxm = Math.max(maxm, dp[i][j]);
            }
        }


        return maxm;
    }



}


