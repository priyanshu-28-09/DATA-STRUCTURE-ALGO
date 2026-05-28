import java.util.*;
public class pattern11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
       for(int row = 1; row <= (2*n-1); row++){ // cursor
        for(int i=1; i<n;i++){
                if(row>n){
                System.out.print("*");
                nst ++;
                }else if(i<n){
                    System.out.print("*");
                    nst --;

                }
            }System.out.println ();
           
       } 

    }

}
