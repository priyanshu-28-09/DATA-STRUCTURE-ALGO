// package Recursion.Recursion.java;

// import java.nio.channels.Pipe.SourceChannel;

public class pro10 {
    public static void main(String[] args) {
        String str = " abc";
        permu(str,"");
    }
    public static void permu(String str, String ans){
        if(str.length()== 0){
            System.out.println(ans);
            return ;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            String rem = str.substring(0,i)+ str.substring(i+1, str.length());
            permu(rem, ans+ch);
        }
    }
        
    }

