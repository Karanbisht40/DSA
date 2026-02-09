
// for string type
public class LinearSearch {
    public static int search(String menu[], String key) {

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int marks[] = { 2, 6, 7, 8, 9, 10, 25, 82 };
        // int key = 8;
        String menu[] = { "dosa", "chole", "samosa", "momo" };
        String key = "chole";

        int index = search(menu, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key found at index " + index);
        }
    }
}

// for linear search for int type

// public class LinearSearch {
// // method for linear search
// static int linearSearch(int arr[], int target) {
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == target) {
// return i; // return index if found
// }
// }
// return -1; // not found
// }

// public static void main(String[] args) {
// int nums[] = {10, 20, 30, 40, 50};
// int target = 30;

// int result = linearSearch(nums, target);

// if (result == -1) {
// System.out.println("Element not found");
// } else {
// System.out.println("Element found at index: " + result);
// }
// }
// }