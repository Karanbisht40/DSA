import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 45, 5};
        int Largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + Largest);
    }
}
