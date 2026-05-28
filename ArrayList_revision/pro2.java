package ArrayList_revision;
import java.util.*;
public class pro2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] nums = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                list.add(i);
                count++;
            }
        }
        System.out.println(list + " " + count);
    }
}
