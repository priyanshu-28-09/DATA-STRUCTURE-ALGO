import java.util.*;
public class pattern13 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst =1;
        int nsp = n-1;
        for(int row =1; row<=2*n-1; row++){
           
            for(int sp=1; sp<=nsp;sp++){
                System.out.print(" ");
            }for(int st =1;st<=nst;st++){
                System.out.print("*");
            } System.out.println(); 
            if( row <n){
                nsp--;
                nst++;
            }else{
                nsp++;
                nst--;
            }
            
        } sc.close();
    }
}

