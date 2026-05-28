package Arrays;

public class Sum_of_2array {
    public static void main(String[] args){
        int[] num1 = {1,3,4,4,5};
        int[] num2 = {9,8,7,6};
         int [] sum = new int[num1.length + num2.length];
          int total = 0;
         for(int i  = 0 ; i<num1.length; i++){
            sum[i] =  num1[i];
         }for(int i = 0; i<num2.length; i++){
            sum[i + num2.length] = num2[i];
         }for(int i = 0; i<sum.length-1; i++){
            System.out.print(sum[i]+ " ");
             total = total+sum[i];
         }System.out.println();
         System.out.print(total);
    }
}
