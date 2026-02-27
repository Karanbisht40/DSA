class CountSubarrayWithXorasK {
    public int subarraysWithXorK(int[] nums, int k) {
      Map<Integer, Integer> freq = new HashMap<>();
      freq.put(0,1);
      int prefixxor= 0;
      int cnt =0;
      for(int i =0; i<nums.length; i++){
        prefixxor = prefixxor ^ nums[i];
        int target = prefixxor ^ k;

        if(freq.containsKey(target)){
            cnt += freq.get(target);
        }
        freq.put(prefixxor, freq.getOrDefault(prefixxor,0)+1);
      }
      return cnt;
    }
}