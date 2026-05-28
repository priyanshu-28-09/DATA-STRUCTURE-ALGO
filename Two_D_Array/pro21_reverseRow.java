package Two_D_Array;

import java.util.Arrays;

public class pro21_reverseRow {
     public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 4 },
                { 7, 8, 9 },
                { 12, 13, 14 },
        };
        
        reverseRow(matrix); 
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void reverseRow(int[][] matrix) {

            for (int i = 0; i < matrix.length; i++) {
                int[] arr = matrix[i];

                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                    int k = arr[start];
                    arr[start] = arr[end];
                    arr[end] = k;
                    start++;
                    end--;
                }
            }
        }
}
