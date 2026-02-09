

public class Floyd {

    public static void FloydCalucalte(int n){
        //outer
        int count =1;
          for(int i = 1; i<=n; i++){
            // inner 
            for(int j =1; j<=i; j++){
                     System.out.print(count + " ");
                     count++;
            }
            System.out.println();
          }
    }
    public static void main(String[] args) {
          FloydCalucalte(5);   
    }
}
