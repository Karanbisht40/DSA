import java.util.Scanner;

public class Practice {


      // number pyramid
    public static void calc(int n){
        for(int i =1; i<=n; i++){
            // space
            for(int j= 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            //star 
            for(int j= 1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        calc(5);
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int n = 5;
        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= n - i + 1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("  ");
        // }

        // char ch = 'A';
        // int n = 4;
        // for(int i =1; i<=n; i++){
        // for(int j = 1; j<=i; j++){
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

    }
}
