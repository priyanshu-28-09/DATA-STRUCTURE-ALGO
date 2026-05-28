package Revision_sheet;

public class R5 {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int n = nums.length+1;
        int sum = (n*(n+1))/2;
         int curr_sum = 0;
            for(int i = 0; i<nums.length; i++){
                curr_sum += nums[i];
            }
            int miss =  sum - curr_sum;
            System.out.println(" this is the missing value " + miss);
            
    
    }
}
