
package BinarySearch;

public class FindOutHowManyTimeRotated {

    class Solution {
    public int findKRotation(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {

            // ✅ already sorted
            if (nums[low] <= nums[high]) {
                if (nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                break;
            }

            int mid = low + (high - low) / 2;

            // left sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                low = mid + 1;
            } 
            // right sorted
            else {
                if (nums[mid] < ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index; // 🔥 number of rotations
    }
}
}