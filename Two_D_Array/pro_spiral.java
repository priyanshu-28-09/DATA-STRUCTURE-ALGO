package Two_D_Array;

public class pro_spiral {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 5 },
                { 5, 6, 7, 8, },
                { 8, 9, 10, 11, },
                { 12, 13, 14, 15 },
        };
        int colmin = 0;
        int colmax = nums[0].length - 1;
        int rowmin = 0;
        int rowmax = nums.length - 1;
        int count = 0;
        int totalelement = nums[0].length * nums.length;

        while (count < totalelement) {
            for (int c = colmin; c <= colmax && count < totalelement; c++) {
                count++;
                System.out.print(nums[rowmin][c] + " ");
            }
            for (int r = rowmin + 1; r <= rowmax && count < totalelement; r++) {
                count++;
                System.out.print(nums[r][colmax] + " ");
            }
            for (int c = colmax - 1; c >= colmin && count < totalelement; c--) {
                count++;
                System.out.print(nums[rowmax][c] + " ");
            }
            for (int r = rowmax - 1; r >= rowmin && count < totalelement; r--) {
                count++;
                System.out.print(nums[r][colmin] + " ");
            }
        }
        colmin++;
        colmax--;
        rowmin++;
        rowmax--;

    }
}
