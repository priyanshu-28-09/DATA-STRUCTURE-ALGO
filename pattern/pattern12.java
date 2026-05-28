import java.util.*;
public class pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        for(int row = 1; row<=(2*n-1); row++){
             for(int st =1; st<=nst;st++){
                System.out.print(" * ");
             }System.out.println();    
                if(row<n){
                   
                    nst++;
                    
                }else{
                    
                    nst--;
                
             }
        }
    }
}
