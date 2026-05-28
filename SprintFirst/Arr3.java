package SprintFirst;

public class Arr3 {
    public static void main(String[] args){
        int[] nums = { 1,4,7,7,8,9,0,6,5,4,3,4,7};
        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];

            }
             if(min > nums[i]){
                min = nums[i];
             }
        }
        System.out.println("minimum : " + min + " " + "max : " + max);
    }
}
