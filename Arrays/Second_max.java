package Arrays;
import java.util.*;
public class Second_max {
    public static void main(String[] args){
    int [] nums= {123,2,3,4,5,5,6,10,67};
    //int max = Integer.MIN_VALUE;
    // int max = -99999;
    //     for(int i = 0; i<nums.length; i++){
    //         if(max< nums[i]){
    //             max = nums[i];
    //         }
    //     }System.out.println(max);



//     Arrays.sort(nums);
//    // for(int i = 0; i<nums.length;i++){
//    // System.out.print(nums[i] +" ");
//     //System.out.println(nums.length-2);
//     System.out.print(nums.length-2);




// int max = Integer.MIN_VALUE;
//     int second_max = Integer.MIN_VALUE;
//    // int third_max = Integer.MIN_VALUE;
//     for(int i = 0; i<nums.length; i++){
//         //int ele = nums[i];
//         if(max < nums[i]){
           
//             max = second_max;
//             second_max  = nums[i];

//     }else if(second_max <nums[i]){
//         second_max = nums[i];
//     }
// }System.out.println(second_max);
//     }
// }

int max = Integer.MIN_VALUE;
    int second_max = Integer.MIN_VALUE;
    int third_max = Integer.MIN_VALUE;
    for(int i = 0; i<nums.length; i++){
        if(max < nums[i]){
        second_max = max;
            max  = nums[i];
    }else if(second_max < nums[i]){
        second_max = third_max;
        second_max = nums[i];
    }else if (third_max < nums[i]){
        third_max = nums[i]; 
    }
}//System.out.println(second_max)
System.out.println(third_max);
    }
}
