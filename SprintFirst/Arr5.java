package SprintFirst;

public class Arr5 {
    public static void main(String[] args){
        int[] nums = { 1,4,7,7,8,9,0,6,5,4,3,4,7};
        int min =  Integer.MAX_VALUE;
        int Smin = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length; i++){
            if(min > nums[i]){
                Smin = min;
                min = nums[i];

            }
        }
        System.out.println("smin : " + Smin + " " + "min : " + min);
    }

}