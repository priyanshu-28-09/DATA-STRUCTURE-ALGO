package Arrays;
import java.util.*;
public class productIndex {
    public static void main(String[]args){
        int[] nums = { 1,2,3};
        int[] num2 = new int[nums.length];
        //  int left = 1;
        // for(int i =0 ; i<nums.length; i++){
        //      num2[i] =left;
        //     left*= nums[i];
        // }
        // int right =1;
        // for(int i =nums.length-1; i>=0; i--){
        //     num2[i] = right;
        //     right *= nums[i];
        // }

                            // second approach
        for(int i = 0 ;i<nums.length; i++){
            int product =1 ;
            for(int j = 0 ; j<nums.length; j++){
                if(i !=j){
                    product *= nums[j];
                }
            }
            num2[i] = product;
        }       

        System.out.print(Arrays.toString(num2));
        // System.out.print(Arrays.toString(num2));
    }
}
