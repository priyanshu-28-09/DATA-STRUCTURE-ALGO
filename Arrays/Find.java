package Arrays;
import java.util.*;
public class Find {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            
              nums[i] = sc.nextInt();
        }
        for(int i = 0 ; i<size; i++){
           
            System.out.print(nums[i]+" ");
        }
        System.out.println("Enter Target");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i =0; i<nums.length; i++){
            if(target == nums[i]);
            flag = true;
        }           
        if(flag == true){
            System.out.println(" achive");
        }else{
            System.out.println("not achive");
        }
    }
}
