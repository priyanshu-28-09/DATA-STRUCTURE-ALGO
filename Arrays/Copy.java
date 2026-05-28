package Arrays;

import java.util.Scanner;

public class Copy {
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


        for(int i =0; i<nums.length;i++){
            int num =nums[i];
            System.out.print(num+ " ");
        }System.out.println();
            for(int j =0 ; j<nums.length;j++){
                System.out.print(nums[j]);
            }
        
    }
}
