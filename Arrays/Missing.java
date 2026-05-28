package Arrays;

import java.util.*;

public class Missing {
//public static void main(String[] args){
//     int [] nums = {1,2,3,4,1,3};
//   int count = 0;
//     for(int i = 0; i<nums.length; i++){
//         // int count = 1;
//         for(int j =0; j<nums.length; j++){
//             if(nums[i] == nums[j]){
//                 count ++;
//                 //System.out.print(nums[i] + " ");
               
//             }
//         }
//     if(count==1){
//     System.out.print(nums[i] + " ");
//         }
//     }
// }
// }





///}
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
           Arrays.sort(nums);
            System.out.print(nums[i]+" ");
        }
        System.out.println();



int n = nums.length+1;
        int sum = (n*(n+1))/2;
         int curr_sum = 0;
            for(int i = 0; i<nums.length; i++){
                sum += nums[i];
            }
            int miss =  curr_sum - sum;
            System.out.println(" this is the missing value " + miss);
            
    }
}
