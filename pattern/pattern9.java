import java.util.*;
public class pattern9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 2*n-1;
       for(int row = 1; row <= n; row++){ // cursor
            // for sp
            for(int sp = 0; sp <=(row-1); sp++){
                System.out.print(" ");
            }
            
                //star
              for(int i= nst; i>=1;i-- ){
                System.out.print("*");
            }
            System.out.println();
            nst -=2;
       }

    }

}

