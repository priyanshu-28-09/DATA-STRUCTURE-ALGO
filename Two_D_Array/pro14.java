package Two_D_Array;

public class pro14 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4},
            {3,5,7},
            {5,7,9}
        };
        
int max = 0;
        int count = 0;
          for(int i =0 ; i<nums.length;i++){
            int sum = 0;
          for(int j = 0; j<nums[0].length;j++){
            sum += nums[i][j]; 
       }
       

if(max < sum){
    max = sum;
}

          }
          System.out.println(max );
    
    }


    

}
