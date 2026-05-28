package SprintFirst;

public class Arr1 {
    public static void main(String[] args){
        int [] nums = { 1,2,3,4,5};
        int p1 = 0;
        int p2 = nums.length-1;
        while( p1 < p2){
            
            int  temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
        for(int i =0 ; i < nums.length; i++){
        System.out.print(nums[i]);
        }
    
}
}