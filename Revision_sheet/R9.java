package Revision_sheet;

public class R9 {
    public static void main(String[] args) {
         int[] nums = {1,2,3,6,7,11,8,9,90};
        boolean flag = false;
        for(int  i = 0 ; i<nums.length; i++){
              
              if(nums[i]<nums[i+1]){
                flag = true;
               System.out.println("yes");

            }
        }

    }
}
