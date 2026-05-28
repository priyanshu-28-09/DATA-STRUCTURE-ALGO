package Arrays;

public class mini {
        public static void main(String[] args){
      
       int[] arr = { 1,2,3,4,5};
          int mini=Integer.MAX_VALUE;
       for(int i  = 0; i< arr.length; i++){
            if(mini > arr[i]){
               mini= arr[i];
            }
        }

        System.out.println(mini);
       }
    
}
