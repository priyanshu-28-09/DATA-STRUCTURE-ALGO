// package Recursion.Recursion.java;

public class pro2 {
    public static void main(String[] args) {
        helper(5);
    }
    public static void helper(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        helper(n-1);
    }
}
