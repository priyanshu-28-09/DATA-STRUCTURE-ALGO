package Arrays;

import java.util.Scanner;

public class Find_Index {
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter size:");
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        
        System.out.println("Enter elements:");
        for(int i = 0; i<size; i++){
            
              nums[i] = sc.nextInt();
        }
        for(int i = 0 ; i<size; i++){
           
            System.out.print(nums[i]+" ");
        }
         int target = 5;
         for(int i  = 0 ; i<nums.length; i++){
            if (target == nums[i]){
                System.out.print("index value : " + i);
            }
         }
    }
}
