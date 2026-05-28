package Arrays;

public class Sum_of_arrayDigit {
    public static void main(String [] args){
    int [] num = { 1,3,4,5,7};
    int [] num1 = { 1,9,8,7,6};
     int i = num.length-1;
      int n =0 ;
      int m =0;
      while(i >= 0){
        int digit = num[i] %10;
         n = digit;
      } 
      int j = num1.length-1;
      while(j >= 0){
        int digit = num[j] %10;
         m = digit;

    }
    int sum = m +n;
}
}