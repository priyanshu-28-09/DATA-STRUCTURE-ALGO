package String;
public class Camal_case {
    public static void main(String[] args) {
        String str = "I Love Java";
        String ans = convertToCamal(str);
        System.out.println(ans);
    }

    public static String convertToCamal(String str) {
        if (str.length() == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str.trim());
        boolean isSpaceDeleted = false;

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (i == 0 && ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, (char) (ch - 'A' + 'a'));
            } else if (ch == ' ') {
                sb.deleteCharAt(i);
                i--;
                isSpaceDeleted = true;
            } else if (isSpaceDeleted) {
                if (ch >= 'a' && ch <= 'z') {
                    sb.setCharAt(i, (char) (ch - 'a' + 'A'));
                }
                isSpaceDeleted = false;
            }
        }

        return sb.toString();
    }
}
