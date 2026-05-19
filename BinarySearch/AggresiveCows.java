class Solution {

    public boolean canPlace(int[] nums, int k, int d){
        int cnt = 1;
         int lastpos = nums[0];
         for(int i =1; i<nums.length; i++){
            if(nums[i]- lastpos >= d){
                cnt++;
                lastpos = nums[i];
            }
            if(cnt>= k) return true;
         }
         return false;
    }
    public int aggressiveCows(int[] nums, int k) {
           Arrays.sort(nums);

           int low = 1;
            int high = nums[nums.length-1]-nums[0];
            int ans = 0;

            while(low<= high){
                int mid = low+ (high-low)/2;

                if(canPlace(nums, k, mid)){
                    ans = mid;
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            return ans;
    }
}
