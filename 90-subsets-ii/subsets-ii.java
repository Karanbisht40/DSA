class Solution {

    void findSubset(int idx, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        // Store current subset
        ans.add(new ArrayList<>(ds));
        for (int i = idx; i < nums.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            ds.add(nums[i]);
            findSubset(i + 1, nums, ds, ans);
            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}