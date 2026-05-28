package Two_D_Array;

public class pro15 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4},
            {3,0,1},
            {5,7,9}
        };
        
int min = 9999;
        int count = 0;
          for(int i =0 ; i<nums.length;i++){
            int sum = 0;
          for(int j = 0; j<nums[0].length;j++){
            sum += nums[i][j]; 
       }
       

if(min > sum){
    min = sum;
}

          }
          System.out.println(min );
    
    }


    


}
