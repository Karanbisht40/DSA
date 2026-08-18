class Solution {
  
  private void findCombinations(int idx, int[] arr, int target, List<List<Integer>> ans,List<Integer> ds){
     // Base case: we have checked all elements
    if(idx== arr.length){

         // If target becomes 0, we found a valid combination
        if(target==0){
            ans.add(new  ArrayList<>(ds));
        }
        return;
    }
     // Include
    if(arr[idx] <= target){
        ds.add(arr[idx]);
        findCombinations(idx, arr, target - arr[idx], ans, ds);

        // Backtrack: remove the last added element
        ds.remove(ds.size()-1);
    }
     // Exclude
    findCombinations(idx+1, arr, target, ans, ds); 
  }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates,target,ans, new ArrayList<>());
        return ans;
    }
}