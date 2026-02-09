import java.util.*;

public class SecondLargest {

    public static int Second_largest(int arr[]) {

        int largest = arr[0];
        int sc_largest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                sc_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sc_largest && arr[i] != largest) {
                sc_largest = arr[i];
            }
        }
        return sc_largest;
    } 
    public static int Second_smallest(int arr[]) {
        int smallest = arr[0];
        int sc_smallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sc_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < sc_smallest && arr[i] != smallest) {
                sc_smallest = arr[i];
            }
        }
        return sc_smallest;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        System.out.println("Second Largest element in the array is: " + Second_largest(arr));
        System.out.println("Second Smallest element in the array is: " + Second_smallest(arr));
    }

}