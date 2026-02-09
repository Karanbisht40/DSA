

public class Palindromic {

    public static void palind(int n){
        for(int i=1; i<=n; i++){

            // spcaes
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //number des
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            //number asec
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palind(3);
        
    }
}
