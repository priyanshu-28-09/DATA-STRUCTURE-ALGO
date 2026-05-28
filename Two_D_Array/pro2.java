package Two_D_Array;
import java.util.*;
public class pro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int [][] nums = new int[3][3];
                for(int i = 0 ;i<nums.length;i++){
                    for(int j =0 ; j<nums[i].length;j++){
                          System.out.print("Enter element at array[" + i + "][" + j + "]: ");
                nums[i][j] = scanner.nextInt(); 

                    }
                }
    }
}
