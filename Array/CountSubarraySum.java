import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum {
    public int countSubarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: there's one way to have a sum of 0 (using no elements)

        for (int num : nums) {
            sum += num;

            // Check if there is a prefix sum that we can subtract to get k
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            // Update the count of the current prefix sum
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // ✅ Main Method
    public static void main(String[] args) {
        CountSubarraySum solution = new CountSubarraySum();

        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 2;
        int result = solution.countSubarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }

}