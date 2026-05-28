package SprintFirst;

public class Arr8 {
    public static void main(String[] args){
        int[] nums = {1,2,4,5,6};
        int n = nums.length+1;
        int sum = (n*(n+1))/2;
         int curr_sum = 0;
            for(int i = 0; i<nums.length; i++){
                sum += nums[i];
            }
            int miss =  curr_sum - sum;
            System.out.println(" this is the missing value " + miss);
            
    }
}
