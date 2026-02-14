import java.util.*;

public class PrimeNum {

    // public static boolean Primenum(int n) {

    // for (int i = 2; i <= n - 1; i++) {
    // if (n % 2 == 0) {

    // return false;
    // }
    // }
    // return true;
    // }

    // optimized form
    public static boolean calcu(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    // for printing the prime value in range
    public static void primeInRange(int n){
        for(int i=2;i<=n; i++){
            if(calcu(i)){ //true
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
      
        primeInRange(100);  //2 to 20
        
    }
}
