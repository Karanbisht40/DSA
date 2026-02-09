

public class BinarySearch {

     public static int Search(int number[], int key){
        int start = 0 , end = number.length-1;

        while (start<= end) {
              int mid = (start+ end)/2;

              //camparison
              if(number[mid]==key){
                return mid;
              }
              if(number[mid]< key){
                start= mid;  // right
              } else{  //left 
                   end =mid-1;
              }
        }
        return -1;
     }
     public static void main(String[] args) {
        int number[]= {2,8,23,25,29,30,47};
        int key= 8;
        System.out.println("index of key is : " + Search(number, key));
     }    
}
