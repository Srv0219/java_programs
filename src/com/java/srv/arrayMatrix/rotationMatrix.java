package com.java.srv.arrayMatrix;

public class rotationMatrix {
    public static void main(String[] args) {
        String[][] arr = {{"a", "b", "c", "d", "e"},
                          {"f", "g", "h", "i", "j"},
                          {"u", "v", "m", "n", "o"},
                          {"p", "q", "r", "s", "t"}};


//        {00,01,02,03,04},
//        {10,11,12,13,14"},
//        {20,21,22,23,24},
//        {30,31,32,33,34}
        int row = 4;
        int col = 5;
        rotationMatri(row, col, arr);
    }

    private static void rotationMatri(int row, int col, String[][] arr) {
        int c = 0;
        int r = 0;
        int last_row = row - 1;
        int last_column = col - 1;
        while (r <= last_row && c <= last_column) {
            for (int i = c; i <= last_column; i++) {
                System.out.print(arr[r][i]);

            }
            r++;
            System.out.println();
            for (int i = r; i <= last_row; i++) {
                System.out.print(arr[i][last_column]);

            }
            last_column--;
            System.out.println();
            for (int i = last_column; i >= c; i--) {
                System.out.print(arr[last_row][i]);
            }
            last_row--;
            System.out.println();
            for (int i = last_row; i > c; i--) {
                System.out.print(arr[i][c]);

            }
            c++;
        }
    }
}
