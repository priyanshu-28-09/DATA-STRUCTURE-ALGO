package ArrayList;

import java.util.*;

public class pro4 {
    public static void main(String[] args){
     ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(13);

 boolean isSorted = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("ArrayList is sorted in ascending order.");
        else
            System.out.println("ArrayList is NOT sorted.");
    }
}
    
