// pair of an array

public class PairInArray {
     
    public static void printPair(int number[]){
        // total number of pair
        int tb= 0;
        for(int i =0; i<number.length; i++){
            int curr = number[i];

            for(int j = i+1; j<number.length; j++){
                System.out.print("(" + curr + ","+ number[j] + ")");
                tb++;
            }
            System.out.println();
        }
                   System.out.println(" total number of pair "+ tb);

    }
    public static void main(String[] args) {
         int number[]= {2,4,6,7,8,1,0,48};
         printPair(number);
         

    }

}
