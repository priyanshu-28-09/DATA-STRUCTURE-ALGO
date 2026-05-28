package Two_D_Array;

public class pro12 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4},
            {3,5,7},
            {5,7,9}
        };
        int target = 7;
          for(int i =0 ; i<nums.length;i++){
          for(int j = 0; j<nums[0].length;j++){
      
            if (target == nums[i][j]){
                System.out.println("{"+ i +  " , " + j + "}");
            }
    }
    System.out.println();
}

    }} 

