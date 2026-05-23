class Solution {
   //lower bound concept
    public int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int RowWithmaxnoOf1(int[][] matrix, int n, int m) {

        int cn_max = 0;
        int idx = -1;

        for (int i = 0; i < n; i++) {

            int cnt_ones = m - lowerBound(matrix[i], m, 1);

            if (cnt_ones > cn_max) {
                cn_max = cnt_ones;
                idx = i;
            }
        }

        return idx;
    }
}