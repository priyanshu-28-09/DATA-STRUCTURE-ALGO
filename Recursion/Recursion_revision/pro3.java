// package Recursion.Recursion.java;

public class pro3 {
    public static void main(String[] args) {
          int ans =fact(5);
        System.out.println(ans);
    }
    public static int fact(int n ){
        if(n==0){
        
        return 1;
        }
        int prev = fact(n-1);
        return n*prev;
        
    }
}
