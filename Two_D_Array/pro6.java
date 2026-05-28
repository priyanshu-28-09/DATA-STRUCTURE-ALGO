package Two_D_Array;

public class pro6 {
    public static void main(String[] args) {
        int [][] nums = {
            {1,3,4,5},
            {3,5,6,7},
            {5,6,7,9}
        };
        int [][] nums2 = {
            {1,3,3,5},
            {3,5,6,7},
            {5,6,7,9}
        };
         boolean flag = false;
        for(int i =0 ; i<nums.length;i++){
             for(int j = 0; j<nums[i].length;j++){
                  // System.out.println(nums[i][j]);
                
            
       for(int k =0 ; k<nums2.length;k++){
             for(int l = 0; l<nums2[i].length;l++){
                  // System.out.println(nums2[i][j]);
                
                  if(nums[i][j] == nums[k][l]){
                    flag = true;
                  }
            }
        }
    }
}


if(flag == true){
    System.out.println("yes It is ");
}else{
    System.out.println("no ");
}

        }
         
    }


