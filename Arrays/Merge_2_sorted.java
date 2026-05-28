package Arrays;
import java.util.*;
public class Merge_2_sorted {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b ={1,2,3,9};
        int []c = new int [a.length + b.length];
         for(int i = 0; i<a.length; i++){
            c[i] = a[i];
         }for(int i = 0; i<b.length;i++){
            c[i + a.length] = b[i];
          }for(int i = 0; i<c.length; i++){
            //  if(c[i] <c[i+1]){
               




           Arrays.sort(c);
            System.out.print(c[i]+ " ");
         }
    }
}
