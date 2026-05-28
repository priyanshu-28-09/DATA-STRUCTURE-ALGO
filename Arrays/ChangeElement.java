package Arrays;
import java.util.*;
public class ChangeElement {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
          System.out.print("Enter the size of array ");
        int size = sc.nextInt();
     

        int nums[] = new int[size];
         System.out.println("Enter the size " +size);

        for(int i = 0 ; i < size; i++){
            System.out.print("Enter the index " +i +" :");
            nums[i] = sc.nextInt();
        }
        System.out.println("Array element are  ");
        for(int i =0; i<size ; i++){
         System.out.println("Enter the index  " +i + " : " + nums[i]);

        }
        sc.close();
    }
}
