// package Recursion.Recursion.java;

public class pro4 {
    public static void main(String[] args) {
       System.out.println(helper(10));
    }
    public static int helper(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int prepre = helper(n-2);
        int pre = helper(n-1);
        return prepre+pre;
    }
}
