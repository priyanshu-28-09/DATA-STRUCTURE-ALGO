package String;

import java.util.*;

public class program7 {
    public static void main(String[] args) {
        String str = "Priyanshu Vishwakarma is the best";
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);

    }

}
