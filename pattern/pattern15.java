import java.util.*;
public class pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int tn = 1;
        for(int row = 1; row<=n;row++){
            for(int i = 1;i<=row;i++){
                System.out.print("    "+i);
               //tn+=1;
            }System.out.println();
        }
        sc.close();
    }
}
