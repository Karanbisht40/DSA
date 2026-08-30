class Solution {
    public void func(int idx, int sum, int n, int k,ArrayList<Integer> ans,List<List<Integer>>ansVec){
        if(sum ==n && k ==0){
            ansVec.add(new ArrayList<>(ans));
            return;
        }
    
        if (sum > n || k == 0) {
            return;
        }
        for(int i =idx; i<=9; i++){
            ans.add(i);
            func(i + 1, sum + i, n, k - 1, ans, ansVec);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
         List<List<Integer>> ansVec = new ArrayList<>(); 
        func(1,0, n,k, ans,ansVec);
        return ansVec;
    }
}