// package Recursion.Recursion.java;

public class pro8 {
    public static void main(String[] args) {
        int base = 5;
        int exp = 3;
        System.out.println(power(base, exp));
    }
    public static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }
        int prev = power(base, exp-1);
        return base*prev;
    }
}
