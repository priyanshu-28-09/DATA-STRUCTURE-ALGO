package Revision_sheet;

public class R4 {
    public static void main(String[] args) {
        int [] nums= {9,8,7,6,5};
        int [] nums2 = {9,8,7,6,5};
        int l1 = nums.length;
        int l2 = nums2.length;
        int resLength = l1 > l2 ? l1 : l2;
        int [] res = new int[resLength];
        
        int p1 = l1-1;
        int p2 = l2-1;
        int p3 = res.length-1;

        int carry = 0;
        while(p3>=0){
            int ele1 = p1>=0? nums[p1] : 0;
            int ele2 = p2>=0? nums[p2] : 0;
            int sum = ele1+ ele2+carry;
            int digit = sum %10;
            res[p3] = digit;
            carry = sum/10;
            p1--;
            p2--;
            p3--;
        } if(carry ==  1){
            int res2;
        }

    }
}
