package Two_D_Array;

public class pro16 {
public static void main(String[] args) {

        int[][] nums = {
            {1, 3, 4},
            {3, 5, 7},
            {5, 7, 9}
        };

        int target = 0;

        boolean res = search(nums, target);
        System.out.println(res);
    }
    public static boolean search(int[][] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = nums[i].length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (nums[i][mid] == target) {
                    return true;
                } 
                else if (nums[i][mid] < target) {
                    left = mid + 1;
                } 
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    
}
