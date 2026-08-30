class Solution {

    // Ye recursive function different combinations find karega
    private void findCombinations(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds) {
        // Agar target 0 ho gaya, iska matlab valid combination mil gaya
        if (target == 0) {
            // Current combination ki copy answer list mein add karo
            ans.add(new ArrayList<>(ds));
            return;
        }

        // idx se lekar array ke end tak har element ko try karenge
        for (int i = idx; i < arr.length; i++) {

            // Same level par duplicate element ko skip karenge
            // Taaki same combination baar-baar na aaye
            if (i > idx && arr[i] == arr[i - 1])
                continue;

            // Array sorted hai, isliye agar current element
            // target se bada hai to aage ke elements bhi bade honge
            // Isliye loop ko yahin stop kar do
            if (arr[i] > target)
                break;

            // Current element ko combination mein add karo
            ds.add(arr[i]);

            // Ab next index se recursion call karo
            // i + 1 ka matlab hai current element ko dobara use nahi kar sakte
            findCombinations(i + 1,arr,target - arr[i],ans,ds);

            // Backtracking:
            // Last added element ko remove karo
            // aur next possible combination try karo
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        // Saare valid combinations store karne ke liye list
        List<List<Integer>> ans = new ArrayList<>();

        // Array ko sort kar rahe hain
        // Isse duplicate elements identify karna easy hota hai
        // aur arr[i] > target hone par hum break kar sakte hain
        Arrays.sort(candidates);

        // Index 0 se combinations banana start karo
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        // Saare valid combinations return karo
        return ans;
    }
}