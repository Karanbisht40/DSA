import java.util.*;
public class FunOver {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 8));
        System.out.println(sum(2.2f, 8.2f, 2.8f));
    }
}
