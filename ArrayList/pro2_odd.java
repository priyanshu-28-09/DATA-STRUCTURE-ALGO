package ArrayList;

import java.util.ArrayList;

public class pro2_odd {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(14);
        arr.add(15);
        arr.add(13);
      
        int count =0;
        for(int num : arr){
            if(num %2!=0){
                count++;
                System.err.println(num);
            }
        }
        System.out.println("odd  number : " +count);

    }
}
