package SprintFirst;
import java.util.*;
public class Arr7 {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
            System.out.println("Enter size:");
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        
        System.out.println("Enter elements:");
        for(int i = 0; i<size; i++){
            
              nums[i] = sc.nextInt();
        }

        int count = 0; 
        for(int i = 1 ; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
        }
        int [] arr = new int[nums.length - count];

        int m = 0; 
        for(int i  = 1; i<arr.length ; i++){
          if(nums[i-1] != nums[i]){
            arr[m]  = nums[i];
            m++;
            
        }
        System.out.println(arr[i] + " ");
    }
}
}