// printing sub array
public class PrintSubarray {

public static void print(int number[]){
    // staring index
    for(int i = 0; i<number.length; i++){
        int start = i;
        //end index
        for(int j = i; j<number.length; j++){
            int end = j;
            //printing
            for(int k =i; k<j; k++){
               System.out.print(number[k]+ " ");
            }
          System.out.println();
         
        }
       System.out.println();
    }
        
}
    public static void main(String[] args) {
         int number[]= { 1,2,3,4};
       print(number);

    }
}
