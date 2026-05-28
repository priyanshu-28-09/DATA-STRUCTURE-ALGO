package Recursion;

public class pro1_rev {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
