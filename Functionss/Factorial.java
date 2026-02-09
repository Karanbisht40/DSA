
// public class Factorial {

//     public static int factorialcalculate(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static void main(String[] args) {
//         System.out.println(factorialcalculate(3));
//     }
// }

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("enter the number");
         num = sc.nextInt();

         if(isEven(num)){
            System.out.println("the number is even");
         } else{
            System.out.println("the number is odd");
         }
    }
     public static boolean isEven(int number){
        if(number %2==0){
           return true;
        } else{
            return false;
        }
     }
}