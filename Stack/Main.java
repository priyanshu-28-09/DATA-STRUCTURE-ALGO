import java.util.*;

public class Main{
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c== '{' || c== '['){
                stack.push(c);
            }else if(c ==')'){
                if(stack.isEmpty()|| stack.pop() != '('){
                    return false;
                }
            }else if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            }else if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breckets");
        String s = sc.nextLine();

       if (isValid(s)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
        sc.close();
    }
}