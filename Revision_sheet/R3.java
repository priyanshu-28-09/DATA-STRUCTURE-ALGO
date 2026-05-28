package Revision_sheet;

public class R3 {
    public static void main(String[] args){
        int [] nums = { 2,3,6,8,9};
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(max<nums[i]){
                max= nums[i];
            }
        }
        for(int i = max; i>=1 ; i--){
            int curr_level = i;
            for(int j = 0 ; j<nums.length; j++){
                if (curr_level<= nums[j]){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}