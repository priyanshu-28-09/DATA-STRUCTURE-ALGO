import java.util.*;
public class DigitSum {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int sumofdigit =0;
     while(n !=0){
        int digit = n%10;
        sumofdigit +=digit;
        n /=10;
     }System.out.println(sumofdigit);
    

    }
   } 
