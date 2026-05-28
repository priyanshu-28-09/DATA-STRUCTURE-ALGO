package String;

public class R8_SecondFrea {
     public static void main(String[] args) {

        String str = "programming";

        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int first = 0, second = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > first) {
                second = first;
                first = freq[i];
            } else if (freq[i] > second && freq[i] != first) {
                second = freq[i];
            }
        }

        char result = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] == second) {
                result = (char) i;
                break;
            }
        }

        System.out.println(result);
    }
}
