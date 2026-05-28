package Arrays;
import java.util.Arrays; // Import the Arrays utility class

class LeetcodeII {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int l1 = nums.length;
        int[] nums2 = new int[l1]; // This will store the final counts

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            int ele1 = nums[i];
            int count = 0; // Initialize count for the current element

            // Compare the current element to every other element
            for (int j = 0; j < nums.length; j++) {
                int ele2 = nums[j];
                // Only increment the count if the other element is strictly smaller
                if (ele1 > ele2) {
                    count++;
                }
            }
            // Store the final count in the result array at the corresponding index
            nums2[i] = count;
        }

        // Print the resulting array using the Arrays utility method
        System.out.println(Arrays.toString(nums2));
    }
}
