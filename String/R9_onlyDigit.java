package String;

public class R9_onlyDigit {
     public static void main(String[] args){
        System.out.println(check("12345"));
    }
       static boolean check(String str){

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

   

}
