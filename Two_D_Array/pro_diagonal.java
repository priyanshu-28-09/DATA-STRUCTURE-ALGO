package Two_D_Array;

public class pro_diagonal {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 5 },
                { 5, 6, 7, 8, },
                { 8, 9, 10, 11, },
                { 12, 13, 14, 15 },
        };
         int m = nums.length, n = nums[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = nums[row][col];

            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                }
                else if (row == 0) {
                    col++;
                }
                else { 
                    row--; 
                    col++; 
                }
            } else {
                if (row == m - 1) {
                    col++;
                }
                else if (col == 0){ 
                    row++;
                }
                else {
                     row++; 
                     col--;
                     }
            }
        }
        for(int i =0 ; i<result.length;i++){
            System.out.print(result[i]+ " ");
        }

}
}
