import java.util.*;
public class pattern18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {

                if (row == n / 2 + 1 || col == n / 2 + 1 || (row == 1 && col >= n / 2 + 1)
                        || (row == n && col <= n / 2 + 1) || (col == 1 && row <= n / 2 + 1)
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