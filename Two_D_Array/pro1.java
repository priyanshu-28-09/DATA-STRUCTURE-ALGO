package Two_D_Array;

public class pro1 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4,5,},
            {3,5,6,7,7},
            {5,6,7,8,9}
        };
int sum =0;
        for(int i =0 ; i<nums.length;i++){
             
            for(int j = 0; j<nums[i].length;j++){
                sum += nums[i][j];
                
            }
           
            System.out.println();
        }
         System.out.print(sum);
    }
}
