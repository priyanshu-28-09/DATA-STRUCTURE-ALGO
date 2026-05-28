package ArrayList;

import java.util.ArrayList;

public class pro12_barchart {
       public static void main(String[] args) {
        
    
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(3);
         
        int max = 0;
        for(int i = 0; i<arr.size(); i++){
            if(max< arr.get(i)){
                max = arr.get(i);
            }
         }
         for(int r = max ;r>0; r--){
            for(int c =0; c<arr.size(); c++){
                int h =arr.get(c);
                if(r<=h){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
         }
         

       }
    
}
