package SprintFirst;
import java.util.*;

public class IF4 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
            int hardness =  sc.nextInt();
            double carbon = sc.nextDouble();
            int st = sc.nextInt();

    boolean condition1 = hardness>50;
    boolean condition2 =carbon<0.7;
    boolean condition3 = st>5600;

if(condition1 &&condition2 && condition3){
                System.out.println(" grade 10");
            }else if (condition1 && condition2){
                    System.out.println(" grade 9");
            }else if(condition2 && condition3){
                System.out.println(" grade 8");
            }else if(condition1 && condition3){
                System.out.println(" grade 7");
            }else if(condition1 || condition2 || condition3){
                System.out.println("grade 6");
            }else{
                System.out.println("grade 5");
            }
        }
    
    
    }