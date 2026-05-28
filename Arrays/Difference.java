package Arrays;

public class Difference {
    public static void main(String[] args){
    int[] a = {1,2,3,4,3,4,5,666,7,7};
    // int start = 0;
    // int end = a.length-1;
    
    int max = Integer.MIN_VALUE;

     for(int i = 0 ; i<a.length;i++){
           if(max < a[i]){
           max = a[i];

     }
}
       System.out.println(max);
    int min = Integer.MAX_VALUE;
        for(int i = 0; i<a.length; i++){
            if(min> a[i]){
                min = a[i];
            }
        }System.out.println(min);


        int diff = max-min;
        System.out.println("Diffenece : " + diff);
    }
}
