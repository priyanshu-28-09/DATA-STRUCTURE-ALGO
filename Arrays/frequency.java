package Arrays;
import java.util.*;
public class frequency {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.print("size of array   ");
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i = 0; i< size ; i++){
            nums[i] =sc.nextInt();
            
        }
        System.out.println(" print array  ");
        for(int i = 0; i<size ; i++){
            System.out.print(nums[i]+ " ");
        }


        
        int count =0;
        System.out.println(" Enter target");
        int target = sc.nextInt();
        for(int i =0; i<nums.length;i++){
            if(target == nums[i]){
                count++;
            }
        }System.out.println(count);
        sc.close();
    }
}
