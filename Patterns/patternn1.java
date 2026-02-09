public class patternn1 {

    public static void pattern1(int n){
              for(int i=0; i<n ; i++){
            for( int j=0; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

  public static void pattern2(int n){
       for(int i =0; i<4; i++){
            for(int j = 0 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
  }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
            for(int i =1; i<6; i++){
            for(int j = 0 ; j<=4-i+1; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // spae
            for (int j= 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

 public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // spae
            for (int j= 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2*n-( 2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j <i; j++) { 
                System.out.print(" ");
            }

            System.out.println();
        }
    }

public static void pattern11(int n){
    for(int i =1; i<n; i++){
    for(int j=1; j<=i; j++){
        if((i+j)%2==0){
            System.out.print("1");
          }  else{
                System.out.print("0");
            }      
    }

    System.out.println();
    }
}

public static void pattern12(int n){
    int space = 2*(n-1);
    for(int i =1; i<=n; i++){
        //num
        for(int j =1; j<=i; j++){
          System.out.print(j);
        }
        //space
        for(int j =1; j<=space; j++){
             System.out.print(" ");
        }
        //num
        for(int j =i; j>=1; j--){
             System.out.print(j);
        }
        System.out.println();
        space -=2;
    }
}

public static void pattern13(int n){
    int number =1;
    for (int i = 1; i<n; i++){
        for(int j = 1; j<i; j++){
            System.out.print(number +" ");
            number++;
        }
        System.out.println();
    }
}

public static void pattern14(int n ){
    for(int i =1; i<n; i++){
        char c= 'A';
        for(int j =1; j<=i; j++){
        System.out.print(c);
        c++;
        }
        System.out.println();
    }
}

public static void pattern15(int n ){
    for (int i =n; i>1;i--){
        char c = 'A';
        for(int j=1; j<=i; j++){
            System.out.print(c);
            c++;
        }
        System.out.println();
    }
}


public static void pattern16(int n ){
    char c ='A';
    for(int i =1; i<n; i++){
        for(int j =1; j<=i; j++){
            System.out.print(c);
        }
        c++;
        System.out.println();
    }
}

public static void pattern17(int n){
    for(int i=1; i<n; i++){
        //space
        for(int j =1; j<n-i-1; j++){
             System.out.print(" ");
        }
        //chacter
        char c ='A';
        int breakpoint = (2*i+1)/2;
        for(int j=1; j<=2*i+1; j++){
            System.out.print(c);
            if(j<=breakpoint) c++;
            else c--;
            
        }
        //space
        for(int j = 1; j<=n-i-1;j++){
               System.out.print(" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
       pattern17(6);
    }
}
