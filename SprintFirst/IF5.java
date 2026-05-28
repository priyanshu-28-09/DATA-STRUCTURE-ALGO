package SprintFirst;
  import java.util.*;
public class IF5 {
    
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
        int num2 = sc.nextInt();
       System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        double result;

        if(op == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if(op == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if(op == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if(op == '/') {
            if(num2 != 0)
                System.out.println("Result: " + (num1 / num2));
            else
                System.out.println("Error: Division by zero!");
        } else if(op == '%') {
            if(num2 != 0)
                System.out.println("Result: " + (num1 % num2));
            else
                System.out.println("Error: Division by zero!");
        } else {
            System.out.println("Invalid operator!");
        }
    }
}