// package Recursion.Recursion.java;

public class pro9 {
    public static void main(String[] args) {
        System.out.println(gcd(48,96));
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
