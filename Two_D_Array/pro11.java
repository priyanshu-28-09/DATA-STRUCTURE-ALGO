package Two_D_Array;

public class pro11 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4},
            {3,5,7},
            {5,7,9}
        };
        for(int j = 0; j<nums[0].length;j++){
        for(int i =0 ; i<nums.length;i++){
            System.out.print(nums[i][j]+ " ");
    }
    System.out.println();
}

    }}