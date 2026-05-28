package Arrays;
// import java.util.*;
// public class reverse {
//     public static void main(String[] args){
//         int [] nums = {4,2,6,5};
    
//         //     for(int i =nums.length-1; i>=0 ;i--){

//         // System.out.println(nums[i]);
//         // }



        
//  }
//     }

//import java.util.*;
public class reverse {
    public static void main(String[] args){
        int [] nums = {4,2,6,5,5,7,2};
        

       int start = 0;
       int end = nums.length-1;
       while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
       }
       for(int i=0; i<nums.length;i++){
       
         System.out.print(" " +nums[i]);
       }
           }
    }