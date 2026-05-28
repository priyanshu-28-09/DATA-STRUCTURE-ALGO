package SprintFirst;
import java.util.*;
public class Arr2 {
    public static void main(String[] args){
        int[] nums = { 1,2,3,4,5};
        int[] nums2 = {6,7,8,9};
        int [] merge = new int[nums.length + nums2.length];
        

        for(int i = 0 ; i<nums.length; i++){
            merge[i] = nums[i];
        }
    for(int i = 0 ; i<nums2.length; i++){
            merge[nums.length + i] = nums2[i];
        }
         for(int i = 0; i<merge.length ; i++){
            System.out.print(merge[i]+ " ");
         }
}
}