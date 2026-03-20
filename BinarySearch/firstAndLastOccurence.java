package BinarySearch;

//using upper bound and lower bound
public class firstAndLastOccurence {
    
    //lower bound
    public int lowerBound(int arr[], int x){
        int n = arr.length;
        int low =0;
        int high = n-1;
        int ans =-1;

    while(low<=high){
        int mid = low + (high-low)/2;

        if(arr[mid]>= x){
            ans = mid;
            high = mid -1;
        }else{
            low = mid +1;
        }
    }
    return ans;
    }
          // uper bound
    public int UpperBound(int arr[] , int x){
        int  n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = low+ (high-low)/2;

            if(arr[mid]> x){
                ans = mid;
                high = mid -1;
            } else{
                low = mid +1;
            }
        }
        return ans;
    }
}
//  int lb = lowerBound(arr, x);
//            if(lb ==n || arr[lb] != x)
//             return (-1, -1);
//            return{lb, UpperBound(arr, x)-1};


//using binary search 

class Solution {
public int firstOcc(int nums[], int target){
    int n = nums.length;
    int low = 0;
    int high = n-1;
    int first = -1;

    while(low<= high){
         int mid = low + (high-low)/2;

         if(nums[mid]== target){
            first  = mid;
            high = mid-1; //First occurence chye to piche aayge
         }else if(nums[mid] < target){
            low = mid +1;
         } else{
            high = mid -1;
         }
    }
    return first;
}

public int lastOcc(int nums[], int target){
    int n = nums.length;
    int low = 0;
     int high = n-1;
     int last = -1;

     while(low<= high){

        int mid = low+ (high -low)/2;

        if(nums[mid]== target){
            last = mid;
            low = mid +1; // last occurence cyye to aage jyge
        }else if(nums[mid] < target){
            low = mid+1;
     } else{
        high = mid-1;
     }
}
     return last;
}
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target);
        if(first== -1) return new int[]{-1,-1};
        int last = lastOcc(nums, target);
        return new int[]{first , last};
    }
}