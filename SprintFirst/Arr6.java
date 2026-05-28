package SprintFirst;
import java.util.*;
public class Arr6 {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
            System.out.println("Enter size:");
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        
        System.out.println("Enter elements:");
        for(int i = 0; i<size; i++){
            
              nums[i] = sc.nextInt();
        }
        
        boolean flag = true;
        for(int i = 1; i<nums.length ; i++){
            if(nums[i-1] > nums[i]){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("yes");
        }else if (flag == false){
            System.out.println("no");
        }
}
}
