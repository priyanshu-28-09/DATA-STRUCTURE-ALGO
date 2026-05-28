package Arrays;
import java.util.*;
public class syntex {
        public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of array 1 : ");

        int size1= sc.nextInt();
        int nums[] = new int[size1];
        for(int i =0 ; i<size1; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("this is array  : ");
        for(int i =0; i<size1;i++){
            System.out.print(nums[i] + " ");
         }
}
}