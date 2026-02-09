

public class HollowRhombus {
    public static void holo(int n){
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //hollow rec
            for(int j =1; j<=n;j++){
                if(i==1|| i==n|| j==1|| j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        holo(5);
     }
}
