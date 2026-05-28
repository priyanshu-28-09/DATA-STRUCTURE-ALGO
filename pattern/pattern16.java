import java.util.*;
public class pattern16 {
   public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

     for(int row = 1; row<=n; row++){
        int diff= n-1;
        int print = row;
        for(int st = 1; st<=row; st++){
            System.out.print(" " +print +" ");
            print = print+ diff;
            diff--;
        }
        System.out.println();
     }
   } 
}
