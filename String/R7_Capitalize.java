package String;
public class R7_Capitalize {
    public static void main(String[] args) {

        String str = "  Java is the world ";

        str = str.trim();
        String ans = "";

        char fc = str.charAt(0);
        if (fc >= 'a' && fc <= 'z') {
            fc = (char) (fc - 'a' + 'A');
        }
        ans += fc;

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (pre == ' ' && curr >= 'a' && curr <= 'z') {
                curr = (char) (curr - 'a' + 'A');
            }
            ans += curr;
        }

        System.out.println(ans);   
    }
}
