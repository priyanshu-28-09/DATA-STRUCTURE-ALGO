import java.util.*;
public class r2palindeom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkpalin(str));
    }

    public static boolean checkpalin(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            ans += ch;

        }
        if (ans.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}