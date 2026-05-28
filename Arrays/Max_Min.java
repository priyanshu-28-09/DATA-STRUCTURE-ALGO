 package Arrays;

public class Max_Min {
    public static void main(String[] args){
    int[] a = {1,3,5,6,87,8,9,67,6,5,7};
    // int start = 0;
    // int end = a.length-1;
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
     for(int i = 0 ; i<a.length;i++){
           if(max < a[i]){
           max = a[i];
           
           }
          //  System.out.println(max);
            if(min> a[i]){
                min = a[i];
                
            }
          //  System.out.println(max);

     }System.out.println(max);
     System.out.println(min);


     

    }
}

