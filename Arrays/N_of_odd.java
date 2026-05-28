package Arrays;

import java.util.Scanner;

public class N_of_odd {
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
        int count =0;
        for(int  i = 0; i<nums.length; i++ ){
            if(nums[i] % 2 != 0){
                count++;
            }
        }System.out.println(count);
    }
}

