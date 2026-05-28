import java.util.*;
public class salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary <=10000){
            int total = salary+salary*20/100 + salary*80/100;
            System.out.println("gross salary is " +total);
        }
        else if(salary <=20000){
            int totalfor2 = salary+salary*25/100 + salary*90/100;
            System.out.println("gross salary is " +totalfor2);
        }
        else if(salary <=20000){
            int totalfor3 = salary+salary*30/100 + salary*95/100;
            System.out.println("gross salary is " +totalfor3);
        }
    }
}
