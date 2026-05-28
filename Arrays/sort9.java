package Arrays;
import java.util.*;
public class sort9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] nums = new int [size];
        for(int i =0; i<size; i++){
            nums[i] = sc.nextInt();
        }for(int j = 0; j< size; j++){
         //   System.out.println(nums[j]+" ");
            Arrays.sort(nums);
        System.out.print(nums[j] +" ");
        }


        
    }
}
