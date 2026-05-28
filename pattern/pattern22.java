import java.util.*;
public class pattern22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nst = 1;

        for(int row = 1; row<=n;row++){
            int val = 1;
            for(int i = 1;i<=nst;i++){
                System.out.print(val);
              if(i<row){
                val++;
              }else{
                val--;
              }


            }System.out.println();
            nst+=2;
        }
        sc.close();
    }
}
