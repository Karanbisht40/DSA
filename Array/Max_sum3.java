

public class Max_sum3 {
// for mixed number
    public static void kadane(int number[]){
        int cs= 0;
        int ms= Integer.MIN_VALUE;
        for(int i = 1; i<number.length; i++){
            cs = cs+ number[i];
            if(cs<0){
                cs= 0;
            }
            ms =    Math.max(cs, ms);
        }
        
                System.out.println("the max sum is : "+ ms);
    }


    // negative number 
     public static void kadane_negative(int number[]){
        int cs= number[0]; //cs sum start with first elemnt
        int ms= number[0];
        for(int i = 1; i<number.length; i++){
          cs= Math.max(number[i], cs+ number[i]);
        
            ms =    Math.max(cs, ms);
        }
        
                System.out.println("the max sum is : "+ ms);
    }
    public static void main(String[] args) {
       //   int number[]= { -2,-3,4,-1,-2,1,5,-3};
          int number[]= { -2,-3,-1,-2,-3};
          kadane_negative(number);

    }
}
