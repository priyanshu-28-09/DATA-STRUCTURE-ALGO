package ArrayList_revision;

import java.util.*;

public class pro1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] nums = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            int ele = list.get(i);
            if (ele % 2 == 0) {
                count++;
            }
        }System.out.println(count);
    }
}
