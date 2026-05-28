package String;

public class R7_ToggleCase {
    public static void main(String[] args) {

        String str = "HeLLo";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z')        
                res += (char)(c + 32);       
            else if (c >= 'a' && c <= 'z')   
                res += (char)(c - 32);       
            else
                res += c;           
        }

        System.out.println(res);
    }
}
