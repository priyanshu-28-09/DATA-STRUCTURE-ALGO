package Two_D_Array;

import java.util.Arrays;

public class pro22_transpose {
    public static void main(String[] args) {
         int[][] matrix = {
                { 1, 2, 4 },
                { 7, 8, 9 },
                { 12, 13, 14 },
        };
        transpose(matrix);
         System.out.println(Arrays.deepToString(matrix));
        
    }
    public static void transpose(int[][] matrix) {

            for (int r = 0; r < matrix.length; r++) {
                for (int c = r; c < matrix.length; c++) {
                    int k = matrix[r][c];
                    matrix[r][c] = matrix[c][r];
                    matrix[c][r] = k;
                }
            }
}
}