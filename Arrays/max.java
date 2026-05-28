package Arrays;
import java.util.*;
public class max {
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
        
        int max = Integer.MIN_VALUE;
         for(int i =0; i<nums.length;i++){
            if(max < nums[i]){
                 max = nums[i];
            }
         }System.out.println(max);
         sc.close();
        }
    }

