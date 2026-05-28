package String;

public class R13_decom {
    public static void main(String[] args) {

        String str = "a3b2c";

        if (str.length() <= 1) {
            System.out.println(str);
            return;
        }

        String ans = "";

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (curr >= '0' && curr <= '9') {

                int freq = curr - '0';
                int idx = i + 1;

                // handle multi-digit number
                while (idx < str.length() &&
                       str.charAt(idx) >= '0' &&
                       str.charAt(idx) <= '9') {

                    freq = freq * 10 + (str.charAt(idx) - '0');
                    idx++;
                }

                while (freq > 0) {
                    ans += prev;
                    freq--;
                }

                i = idx - 1;   // move index forward
            }
            else {
                ans += prev;
            }
        }

        char last = str.charAt(str.length() - 1);
        if (last < '0' || last > '9') {
            ans += last;
        }

        System.out.println(ans);
    }
}

