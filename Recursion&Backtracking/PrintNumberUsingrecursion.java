import java.util.*;
// This program prints numbers from n to 1 using recursion
public class PrintNumberUsingrecursion {
    public static void printNumber(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }
    public static void main(String[] args) {
        printNumber(5);

    }
    
}
