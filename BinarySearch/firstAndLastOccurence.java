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