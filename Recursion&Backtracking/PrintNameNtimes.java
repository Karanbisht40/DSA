import java.util.*;

public class PrintNameNtimes {

    public static void printName(String name, int n) {
        if (n <= 0) {
            return;

        }
        System.out.println(name);
        printName(name, n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the number of times to print the name: ");
        int n = sc.nextInt();
        printName(name, n);
    }
}
