

public class program5 {
    public static void main(String[] args) {
        String str = "Priyanshu Vishwakarma is the bestwsssdsdad";
        int count = 0;
        int result = 0;
        String countstr = "";
        String maxstr ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                countstr +=ch;
                count++;
            } else {
                // result = Math.max(result, wordcount);
                if (result <= count) {

                    result = count;
                    maxstr =countstr; 
                }
                count =0;
                countstr = "";
            }
            // result = Math.max(result, wordcount);
            if (result <= count) {
                result = count;
                maxstr =countstr; 
            }
        }
        System.out.println(result + " " + maxstr);

    }
}
