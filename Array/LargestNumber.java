

// largest of nyumber
public class LargestNumber {
    public static int numbercal(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("smallest number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 2, 5, 8, 6, 1, 7 };

        System.out.println("largest number is " + numbercal(num));
    }
}
