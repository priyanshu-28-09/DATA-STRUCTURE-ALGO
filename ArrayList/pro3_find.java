package ArrayList;

import java.util.*;

public class pro3_find {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(13);

          Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        for(int i = 0; i<arr.size(); i++){
            int num = arr.get(i);

            if(num== target){
                System.out.println(i);
            }
        }

    }
}
