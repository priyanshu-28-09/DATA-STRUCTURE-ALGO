import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
       int n =5;
        int ft = 0;
        int st =1;
        for(int i =0; i<=n;i++){
             System.out.println(ft);
            int tt = ft+st;
            ft =st;
            st = tt;
            }
        }
    }

