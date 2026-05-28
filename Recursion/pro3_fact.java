package Recursion;

public class pro3_fact {
    public static void main(String[] args) {
       int ans = fact(6 );
       System.out.println(ans);
        
    }
    public static int fact(int n){
        
        if(n==1|| n==0){
            return 1;
        }
       
           int prev = fact(n-1);
            
            return n*prev;
    }
}
