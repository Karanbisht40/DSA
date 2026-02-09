import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reveNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            reveNum = reveNum * 10 + ld;
            n = n / 10;
        }
        if (dup == reveNum) {
            System.out.println("true");
        } else
            System.out.println("false");

    }
}