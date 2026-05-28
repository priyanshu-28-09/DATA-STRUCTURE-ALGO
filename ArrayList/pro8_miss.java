package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class pro8_miss {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        int n = 5;
          int arrSum = 0;
        int realSum = n * (n + 1) / 2;
        for(int i =0;i<list.size(); i++){
          arrSum += list.get(i);

        }
        int ans = realSum - arrSum;
        System.out.println(ans);

     }
}