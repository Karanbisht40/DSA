import java.util.Arrays;

public class Rotatebyright {

    public static void rotateRightBrute(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is larger than n
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        rotateRightBrute(arr, k);
        System.out.println("Array after right rotation by " + k + " positions: " + Arrays.toString(arr));
    }

}
