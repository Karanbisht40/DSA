import java.util.Arrays;

class Solution {

    public static int countStudent(int[] arr, int pages) {
        int student = 1;
        int pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {

            // If current book can be added
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {

                // Allocate to next student
                student++;
                pagesStudent = arr[i];
            }
        }
        return student;

        //function\
    }

    public int findPages(int[] nums, int m) {

        // Edge case
        if (m > nums.length) {
            return -1;
        }

        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int student = countStudent(nums, mid);

            if (student > m) {

                // Need more pages
                low = mid + 1;

            } else {

                // Try smaller answer
                high = mid - 1;
            }
        }

        return low;
    }
}