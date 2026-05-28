// package Recursion.Recursion.java;

public class pro1 {
    public static void main(String[] args) {
        helper(5);
    }
    public static void helper(int n){
        if(n<0){
            return;
        }
        helper(n-1);
        System.out.println(n);
    }
}
