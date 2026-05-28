package Recursion;

public class pro5Reverce {
    public static void main(String[] args) {
        rev("String");
        
    }

    public static String rev(String str){
      if(str.length() == 1 || str.length() ==0){
        return str;
      }
     
      String ans = rev(str.substring(0,1) + str.charAt(1));
      return ans;
      
    }
}
