
public class Hollow {

    public static void calcuhollo(int totalRow, int totalcoln) {
        for (int i = 1; i <= totalRow; i++) {
            for (int j = 1; j <= totalcoln; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.err.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        calcuhollo(14, 5);
    }
}
