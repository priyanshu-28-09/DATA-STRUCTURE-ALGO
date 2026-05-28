package ArrayList;

import java.util.ArrayList;

public class pro6_sum {
    public static void main(String[] args) {
        
    
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(13);
         int sum = 0;
        for (int i = 0; i < arr.size(); i += 2) {
            sum += arr.get(i);
        }

        System.out.println("Sum of elements : " + sum);
    }

}
