class Solution {
    
    static boolean solve(int[] arr, int sum, int k, int idx){
        
        if(idx >= arr.length){
            if(sum ==k)
              return true;
            else
               return false;
        }
        
        int currval= arr[idx];
        
        boolean excludeans = solve(arr, sum, k, idx+1);
        boolean includeans = solve(arr, sum, k+ currval, idx+1);
        
        boolean finalans = excludeans || includeans ;
        return finalans;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
    int idx =0;
    int sum =0;
     boolean ans  =  solve(arr, sum , k, idx);
     return ans;
        
    }
}