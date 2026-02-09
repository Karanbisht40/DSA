// max subarray sum by prefix method
public class Max_subarray2 {

    public static void Preefix(int number[]){
        int currsum = 0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0]= number[0];
        //caluclate prefix
        for(int i=1; i<prefix.length; i++){
           prefix[i]= prefix[i-1]+ number[i];
        }

        for(int i =0; i<number.length; i++){
            int start = i;
            for(int j= i ; j<number.length; j++){
                int end = j;
                   
                // ternary operator
                currsum = start == 0? prefix[end] : prefix[end]- prefix[start-1];
               if(maxSum<currsum){
                maxSum= currsum;
               }
            }
        }
        System.out.println("max sum is "+ maxSum);
    }
    public static void main(String[] args) {
         int number[]= { 1,-2,6,-1,3};
         Preefix(number);
    }
}
