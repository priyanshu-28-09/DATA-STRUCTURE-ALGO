package Two_D_Array;

public class pro5 {
    
        public static void main(String[] args) {
        int [][] nums = {
            {1,3,4,5},
            {3,5,6,7},
            {5,6,7,9}
        };
int min=99;
        for(int i =0 ; i<nums.length;i++){
             
            for(int j = 0; j<nums[i].length;j++){
                   if(min>nums[i][j]){
                    min = nums[i][j];
                   }
                
            }
        }
         System.out.print(min);
    }
}


