class Solution {

    void func(int idx, int[] nums, List<Integer> ds, List<List<Integer>> ans) {

        // Base case
        if (idx == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Pick
        ds.add(nums[idx]);
        func(idx + 1, nums, ds, ans);

        // Backtrack
        ds.remove(ds.size() - 1);

        // Don't pick
        func(idx + 1, nums, ds, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        func(0, nums, ds, ans);

        return ans;
    }
}