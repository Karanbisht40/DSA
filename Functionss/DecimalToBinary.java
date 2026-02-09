
public class DecimalToBinary {

    public static void decToBin(int n) {
        int num = n;
        int pow = 0;
        int BinNum = 0;

        while (n > 0) {
            int rem = n % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;
        }
        System.out.println(BinNum);
    }

    public static void Scope() {
        int s = 45;

    }

    public static void main(String[] args) {
        // decToBin(3);
      //  System.out.println(s);
    }
}