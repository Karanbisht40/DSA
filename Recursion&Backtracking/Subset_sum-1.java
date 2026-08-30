class Solution {

    void func(int idx, int sum, int[] arr, int N, ArrayList<Integer> sumsubset) {

        // Base case
        if (idx == N) {
            sumsubset.add(sum);
            return;
        }

        // Pick the element
        func(idx + 1, sum + arr[idx], arr, N, sumsubset);

        // Don't pick the element
        func(idx + 1, sum, arr, N, sumsubset);
    }

    public ArrayList<Integer> subsetSums(int[] arr) {

        ArrayList<Integer> sumsubset = new ArrayList<>();

        func(0, 0, arr, arr.length, sumsubset);

        Collections.sort(sumsubset);

        return sumsubset;
    }
}