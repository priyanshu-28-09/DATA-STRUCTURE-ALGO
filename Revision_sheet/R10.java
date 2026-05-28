package Revision_sheet;

public class R10 {
     public static void main(String[] args){
        int [] nums = { 7,5,4,3,6,8,5,3,2,34,6,8,0};
      
        int min = Integer.MAX_VALUE;
        int smin= Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length; i++){
            if(min > nums[i]){
                min = smin;
                smin =nums[i];
            }
        }System.out.println(min);
    }
}
