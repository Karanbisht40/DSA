

//revese an array  
public class Reverse {

    public static void reversed(int number[]){
        int first =0; int last= number.length-1;

        while( first < last){
            int temp = number[last];
            number[last]= number[first];
            number[first]= temp;

            first++;
            last--;
        }
    }

    
    public static void main(String[] args) {
        int number[]= {8,45,85,2,5};   

        reversed(number);

        for(int i =0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
