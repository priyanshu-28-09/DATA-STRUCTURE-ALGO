package Two_D_Array;

public class pro13 {

    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4},
            {3,5,7},
            {5,7,9}
        };
        int sum = 0;
        int count = 0;
          for(int i =0 ; i<nums.length;i++){
          for(int j = 0; j<nums[0].length;j++){
      sum += nums[i][j];
      count ++;
            
    }
    System.out.println();
}
  double avg = sum /count;
  System.out.println(avg);

    }
} 



