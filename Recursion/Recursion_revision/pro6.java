// package Recursion.Recursion.java;

public class pro6 {
    public static void main(String[] args) {
        String str = "ray of light";
        System.out.println(helper(str));
    }
    public static String helper(String str){
        if(str.length() == 0 || str.length() ==1){
            return str;
        }
       String rem = str.substring(0,str.length()-1);
       String remRev = helper(rem);
       char lc  = str.charAt(str.length()-1);
       return lc+ remRev;
    }
}
