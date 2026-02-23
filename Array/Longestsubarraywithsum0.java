public class Longestsubarraywithsum0 {
    class Solution {
    public int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
    int maxi =0;
    int sum= 0;
    for(int i =0; i<arr.length; i++){
        sum += arr[i];

        if(sum==0){
            maxi = i+1;
        }else{
            if(map.containsKey(sum)){
                maxi = Math.max(maxi, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }

    }
        return maxi;
    }
}

}
