import java.util.*;
public class Mini_tomake {
    public static int minAddToMakeValid(String s){
        if(s.length() == 0){
            return 0;
        }else{
            Stack<Character> st = new Stack<>();

            int count = 0;
            for(int i =0; i< s.length(); i++){
                char ch = s.charAt(i);

                if(ch == '('){
                    st.push(ch);
                }else{
                    if(st.size() > 0 && st.peek() == '('){
                        st.pop();
                    }else{
                        count++;
                    }
                }
            }
            return count + st.size();
        }
    }
        public static void main(String[] agrs){
            Scanner sc = new Scanner(System.in);

            System.out.print("enter");
            String s  = sc.nextLine();
            int result = minAddToMakeValid(s);
            System.out.println("Min add required : " + result);

            sc.close();
        
    }
}
