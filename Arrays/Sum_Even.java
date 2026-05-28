package Arrays;

public class Sum_Even {
    public static void main(String[] args){
        int [] nums = {1,3,4,5,65,6,7,7,8,8,989,9,8};
         int sum = 0;
        for(int i = 0;i< nums.length; i++){
            if(i %2==0){
                sum = sum + nums[i];
            }
        }System.out.println(sum);
    }
}
