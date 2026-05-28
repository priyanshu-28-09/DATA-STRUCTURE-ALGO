package Arrays;
import java.util.*;
public class Remove_element {
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
           
//System.out.print(nums[i]+" ");
        }

        // remove
        System.out.println(" Enter the target : ");
         int target = sc.nextInt();
         int n =size;
        //int[]  num2 = new int[nums.length-1];
        for(int i =0 ; i<nums.length; i++){
            if(nums[i] == target){
                for(int j =i; j<n-1;j++){
                nums[j] =  nums[j+1];
                }
               n--;
                i--; 
            } 
            }
            System.out.println("Array after removing target:");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        }
    }

