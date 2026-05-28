package Arrays;
import java.util.*;

public class sort_arr {
    public static void main(String[] args){
      //  Scanner sc= new Scanner(System.in);
      //       System.out.println("Enter size:");
      //   int size = sc.nextInt();
        
      //   int[] nums = new int[size];
        
      //   System.out.println("Enter elements:");
      //   for(int i = 0; i<size; i++){
            
      //         nums[i] = sc.nextInt();
      //   }
      //   for(int i = 0 ; i<size; i++){
           
      //    //   System.out.print(nums[i]+" ");
      //   }
         int [] nums ={1,2,5,6,7,8,9};
          boolean  flag = true;
        for(int  i =1; i<nums.length ; i++){
          if(nums[i-1] > nums[i]){
            flag =  false;
          }
         }
          if(flag ==  true){
            System.out.print(" yes this is assending array");
          }else{
System.out.print(" no array");
          }
       }
    
      }
