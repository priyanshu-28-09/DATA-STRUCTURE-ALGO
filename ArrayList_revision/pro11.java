package ArrayList_revision;

import java.util.ArrayList;

public class pro11 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
                list.add(nums[i]);
        }
        int[] nums1 = {1,2,3,4,5,6};
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i =0; i<nums1.length; i++){
                list1.add(nums1[i]);
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        int p1 = list.size()-1;
        int p2 = list1.size()-1;
        int carry = 0;

        while(p1 >=0 || p2 >=0){
            int ele1 = p1 >= 0 ? list.get(p1): 0;
            int ele2 = p2 >= 0 ? list1.get(p2): 0;


            int sum = ele1 +ele2 +carry;
            int digit = sum%10;
            carry = sum/10;
            list2.add(0,digit);
             p1--;
             p2--;
        }
        
        if(carry > 0){
            list2.add(0, carry);
        }
        System.out.println(list2);
    }
}
