package Two_D_Array;

public class pro17 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,2,3,4,5},
            {5,6,7,8,8},
            {8,9,10,11,12},
        };

        for(int j = 0 ; j<nums[0].length; j++){
                if(j%2 == 0){
                    for(int i = 0; i<nums.length; i++){
                        System.out.print(nums[i][j] + " ");
                    }
                }else{
                    for(int i = nums.length -1; i>=0; i--){
                        System.out.print(nums[i][j] + " ");
                    }
                }System.out.println();
        }
    }
}
