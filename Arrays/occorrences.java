package Arrays;
import java.util.*;
public class occorrences {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
        int [] num = new int[size];
        for(int i =  0;  i<size; i++){
            num[i] = sc.nextInt();
        }
            for(int i = 0 ; i<size; i++){
           
           //System.out.print(num[i]+" "); 
        }
             int target = sc.nextInt();
        //  for(int i = 0 ; i<num.length; i++){
        //     if(target == num[i]){
        //         System.out.println(i);
               
        //     }
        //      break;
        //     }for(int i= num.length-1; i>0; i--){
        //         if(target == num[i]){
        //             System.out.println(i);
        //         }
        //          break;

        //  }


                        // only one loop

      //  int 



     

   // public static int[]FindFirstAndLastIndex (int [] nums , int target){
        int fi = -1;
        int li = -1;
        boolean flag = true;
        for(int i  = 0 ; i<num.length ; i++){
            int ele = num[i];
            if(flag == true && target == ele){
                li = i;
                fi = i;
                flag = false;
            }else if ( target == ele){
                li = i;
            }
        }
        int [] ans = {fi , li};
        
        System.out.println(fi + " " + li);
    } 
}
