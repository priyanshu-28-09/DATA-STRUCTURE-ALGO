import java.util.*;
public class pattern14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          int nst =1;
        int nsp = n-1;
        for(int row =1; row<=n; row++){
           
            for(int sp=1; sp<=nsp;sp++){
                System.out.print(" ");
            }for(int st =1;st<=nst;st++){
                System.out.print("*");
            } System.out.println(); 
          //  if(row<n){
            if( row <=n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
            
        } sc.close();
    }
}

