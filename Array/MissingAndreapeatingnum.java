
//bettrer sol--
// public class MissingAndreapeatingnum {
  
//     public int[] findMissingRepeatingNumbers(int[] nums) {
//           int n = nums.length;
//     int[] hash = new int[n+1];
//     for(int i =0; i<nums.length; i++){
//         hash[nums[i]]++;
//     }
//     int repeating =-1; int missing= -1;
//     for(int i =0; i<=n; i++){
//         if(hash[i]==2){
//             repeating =i;
//         }else if(hash[i]==0){
//             missing =i;
//         }
//         if(missing != -1 && repeating !=-1){
//             break;
//         }
//     }
//     return new int[]{repeating, missing};

//     }
// }
import java.util.*;
public class MissingAndreapeatingnum {

    public int[] findMissingRepeating(int[] nums){
     long n = nums.length;
     long sn = (n*(n+1)/2);
     long s2n = (n*(n-1)*(2*n+1))/6;
     long s =0;
     long s2= 0;
          for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * (long) nums[i];
        
          // Compute the difference values
        long val1 = S - SN; // X - Y

        // S2 - S2n = X^2 - Y^2
        long val2 = S2 - S2N;

        // Calculate X + Y
        val2 = val2 / val1;

        // Calculate X and Y
        long x = (val1 + val2) / 2; // repeating
        long y = x - val1;          // missing

        return new int[]{(int) x, (int) y};
          }
    }
}


