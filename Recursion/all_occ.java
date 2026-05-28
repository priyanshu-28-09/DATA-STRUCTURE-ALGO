package Recursion;

public class all_occ {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,2,5,2,4};
       
       occ(nums,2,0);
        
    }
    public static void occ(int[] nums, int target,int idx){
        
        if(idx == nums.length){
            return;
        }
        if(target == nums[idx]){
            System.out.println(idx + " ");
        }
        occ(nums,target,idx+1);
       
    }
}
