package Arrays;
import java.util.*;
public class sort_2array {
    public static void main(String[] args){
        int [] nums = {1,3,4,5};
        int [] nums2 = {1,2,6};
         int [] sum = new int[ nums.length + nums2.length];
         int l1 = nums.length;
         int l2 = nums2.length;

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
         // short 
        while(p3< sum.length){
            int ele1 = p1 <l1 ? nums[p1] : Integer.MAX_VALUE;
            int ele2 = p2 <l2 ? nums[p2] : Integer.MAX_VALUE;
            if (ele1 <ele2){
                sum[p3] = ele1;
                p1++;
            }else{
                sum[p3] = ele2;
                p2++;
            }
            p3++;
        }System.out.println(Arrays.toString(sum));
        
        
    }
}


    //     for(int i = 0; i<sum.length; i++){
    //         for(int j = 0; j<nums.length; j++){
    //             for(int k = 0; k<nums2.length; k++){
    //         if(f >s){
    //             sum[i] = nums2[j];
    //             f++;
    //         }else {
    //             sum[i] = nums[k];
    //             s++;
    //         }
    //     }
    // }System.out.print(sum[i] + " ");

    //     } 
