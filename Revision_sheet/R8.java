package Revision_sheet;

public class R8 {
    public static void main(String[] args) {
        
         int[] nums ={1,2,2,3,3,4,5,6,6};     
          int m = 1;
    
        for(int i = 1; i<nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[m] = nums[i];
               m++;
                }
            
        }
        for(int i= 0; i<m; i++){
            System.out.print(" " + nums[i]+ " ");
        }
    }
}
