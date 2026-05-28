package Arrays;
// import java.util.*;
// public class concatenate {
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the size of array 1 : ");

        // int size1= sc.nextInt();
        // int nums[] = new int[size1];
        // for(int i =0 ; i<size1; i++){
        //     nums[i] = sc.nextInt();
        // }System.out.print("this is array 1 : ");
        // for(int i =0; i<size1;i++){
        //     System.out.print(nums[i] + " ");
        // }
        // System.out.println();
        // System.out.print("Enter the size of array 2 : ");
        // int size =sc.nextInt();
        // int nums2[] = new int[size];
        // for(int i = 0; i<size; i++){
        //     nums2[i] = sc.nextInt();
        // }System.out.print("this is array 2 : ");
        // for(int i =0 ; i<size; i++){
        //     System.out.print(nums2[i] + " ");
        // }
        // System.out.println();
         
    // int[] nums = {1,3,4,5,6,6};
    // int [ ] nums2 = { 3,5,6,7,8};





//         int[] sum = new int [nums.length + nums2.length];

//         for(int i = 0; i<nums.length ; i++){
//             sum[i] = nums[i];

//         }for(int i = 0; i<nums2.length; i++){
//             sum[nums.length+ i] = nums2[i];

//         } for(int i = 0; i<sum.length; i++){
            
//             System.out.print(sum[i] +" ");
//         }
//        // sc.close();
         






//     }
// }






// package Arrays;
import java.util.*;
public class concatenate {
    public static void main(String[] args){
        int [] nums = {1,3,4,5};
        
         int [] con = new int[ 2* nums.length];
         for(int i = 0; i<nums.length;i++){
            con[i] = nums[i];
            con[nums.length+i] = nums[i];
         }
         for(int i = 0 ; i<con.length; i++){
            System.out.print(con[i] + " ");
         }
    }
}


// package Arrays;
// import java.util.*;
// public class concatenate {
//     public static void main(String[] args){
//         int [] nums = {1,1,1,1,3,5,1,1,1,1,1,1,1};
//         //int [] nums2 ={ 2,4,6};
//         for(int i =1 ; i<nums.length; i++){
//              if(nums[i] == nums[i-1] ){
                
//     }
// }

 // using 1 loop
//   int l1 = nums.length ;
//   int l2 = nums2.length;
//   int size=  l1+l2; 
//   int[] con = new int [size];
  
//    for(int i = 0; i<size -1 ; i++){
//      int ele = 0;
//      if(i > l1){
//         ele = nums[i];
//      }else{
//         ele = nums2[i-l1];
//      }
//      con[i] = ele;
//    }



//     }
// }