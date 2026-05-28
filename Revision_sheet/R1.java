package Revision_sheet;
import java.util.*;
public class R1 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
         for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {

                if (row == n/2+1   || (row == 1) ||(row==n)
                        || (col == 1 && row <= n / 2 + 1)
                        || (col == n && row >= n / 2 + 1)) {
                    System.out.print(" " + "*" + " ");
                } else {
                    System.out.print(" " + " " + " ");
                }
            }
            System.out.println();
        }

    }
}

