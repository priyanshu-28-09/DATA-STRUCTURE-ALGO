// package Recursion.Recursion.java;

public class pro7 {
    public static void main(String[] args) {
        String str = "earaj";
        System.out.println(palin(str));

    }
    public static boolean palin(String str){
        if(str.length() == 0 || str.length() ==1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        String rem = str.substring(1, str.length()-1);
            boolean remRes = palin(rem);
            return remRes;
        

    }
}
