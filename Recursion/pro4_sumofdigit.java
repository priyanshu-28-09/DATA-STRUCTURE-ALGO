package Recursion;

public class pro4_sumofdigit {
    public static void main(String[] args) {
       int ans = sum(53434567 );
       System.out.println(ans);
        
    }
    public static int sum(int n){
        
        if(n>=0 && n<=9){
            return n;
        }
        int remain = n/10;
                int d = n%10;
              
           int Rsum = sum(remain);
           int sum = d+ Rsum;
            
            return sum;
    }

}
