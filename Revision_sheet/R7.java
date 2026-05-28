package Revision_sheet;

import java.util.Arrays;

public class R7 {
    public static void main(String[] args) {
       
        int[] a = {1,2,3,4,5};
        int[] b ={1,2,3,9};
        int []c = new int [a.length + b.length];
         for(int i = 0; i<a.length; i++){
            c[i] = a[i];
         }for(int i = 0; i<b.length;i++){
            c[i + a.length] = b[i];
          }for(int i = 0; i<c.length; i++){
                     Arrays.sort(c);
            System.out.print(c[i]+ " ");
         }
    }
}
