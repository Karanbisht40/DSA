import java.util.*;

class Mergesort {
    // Function to merge two halves
    public void merge(int[] arr, int low, int mid, int high) {
        // Create temp array
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        // Merge both sorted parts
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

    // Recursive merge sort
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        // Find mid index
        int mid = (low + high) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }
}Facebook.  Karan@4041
Insta.      Kapkote#4041
Uniqu.  Nevergiveup@
 G mail.  Karansinghbisht#4041
Army karanbisht4041@
331
7417900387
812698812
letitbe9528 
Gpay 0000
Ippb 8080
 Hp assi. Nevergiveup@4041
Karansinghbisht4041@
Karanbisht@4041. Microsoft 
Karanbisht@7351 - gmail
Kara@404 - Angel one
Karansinghbisht#4041
Link.  Nevergiveup#4041
Karanbisht4041
Pass.  Karanbisht#4041

Mithun rash
   User name sbi -  Karanbisht4041
SBI - Karan@sbi123
Nsp.  Karanbisht#4041
LinkedIn - Karanbisht#4041
Cisco - Karan#4041@
Git hub - Karanbisht#4041
AICTE - Karanbisht#4041
Leet - Karanbisht#4041
SQL - Karanbishtsql
Clg mail - Karanbisht#4041
Ac- 061610007351
CI -6036278772
Pass 9999
Wipro Karanbisht#4041
Overleaf Karanoverleaf#4041l

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 4, 1 };
        LengthOfLL sol = new LengthOfLL();
        sol.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
