import java.util.Arrays;
//for non desending order
public class CheckArrayIsSorted {
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,4};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Is the array sorted? " + isSorted(arr));
    }
}