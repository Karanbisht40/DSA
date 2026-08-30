class Solution {

    static int solve(int[] nums, int sum, int target, int idx) {

        // Base case
        if (idx >= nums.length) {
            if (sum == target)
                return 1;
            else
                return 0;
        }

        int currval = nums[idx];

        // Add current value
        int plusans = solve(nums, sum + currval, target, idx + 1);

        // Subtract current value
        int minusans = solve(nums, sum - currval, target, idx + 1);

        // Count all valid ways
        int finalans = plusans + minusans;

        return finalans;
    }

    public int findTargetSumWays(int[] nums, int target) {

        int idx = 0;
        int sum = 0;

        int ans = solve(nums, sum, target, idx);

        return ans;
    }
}