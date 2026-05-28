package ArrayList;

import java.util.ArrayList;

public class pro7_product {
     public static void main(String[] args) {
        
    
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(13);
         
        int product = 1;
        for (int i = 1; i < arr.size(); i += 2) {
            product *= arr.get(i);
        }

        System.out.println("Product of elements : " + product);
    }
}
