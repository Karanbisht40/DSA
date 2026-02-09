
import java.util.*;

public class Function {

      public static int factroial(int n){
        int f =1;
        for(int i =1; i<=n; i++){
            f= f*i;
        }
        return f;
      }
      public static int bicoeff(int n, int r){
        int fact_n = factroial(n);
        int fact_r = factroial(r);
        int fact_nmr= factroial(n-r);

        int bicoeff = fact_n/(fact_r*fact_nmr);
        return bicoeff;
      }
    public static void main(String[] args) {
        
         System.out.println(bicoeff(5, 2));
    }
}
