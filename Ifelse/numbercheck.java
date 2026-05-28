import java.util.*;
public class numbercheck {
        public static void main(String [] args){
                       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        // VOTING
            
            if(n > 0){
                System.out.print("positive");
            }else if ( n < 0){
                System.out.println("nagative");
            }else{
                System.out.println("zero -> 0");
            }
    }
    
}

