package Arrays;

import java.util.*;

public class Duplicate_remove {
    public static void main(String[] args){
        
        //remove 
        // int [] n2 = new int[nums.length - count];
        //     n2[0] = nums[0];
        int[] nums ={1,2,2,3,3,4,5,6,6};     
        int m = 1;
        for(int i = 1; i<nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[m] = nums[i];
                m++;
            }
            
        }
        for(int i= 0; i<m; i++){
            System.out.print(" " + nums[i]+ " ");
        }
        
        // int[] nums ={1,2,2,3,3,4,5,6,6};     
        //     int count =0;
        
        //      for(int i = 1 ; i<nums.length; i++){
            //          int prev = nums[i-1];
            //          int curr = nums[i];
            //         if(prev == curr ){
                //             count++;
                //         }
                //         }
                //         //System.out.print(nums[i]);
                
                //         int m=0;
                //         int[] ans = new int[nums.length - count];
                //         for(int  i = 1 ; i<ans.length; i++){
                    //             int prev = nums[i-1];
                    //          int curr = nums[i];
                    //         if(prev != curr ){
                        //             ans[m]=nums[i];
                        //             m++;
                        //         }
                        //         System.out.print(" " + ans[i] + " ");
                        //         }
                    }
                }
                
                
                
                
                
                
                
                //     Scanner sc= new Scanner(System.in);
                //     System.out.println("Enter size:");
                // int size = sc.nextInt();
                
                // int[] nums = new int[size];
                
                // System.out.println("Enter elements:");
                // for(int i = 0; i<size; i++){
                    
                //       nums[i] = sc.nextInt();
                // }
                // System.out.println();
                