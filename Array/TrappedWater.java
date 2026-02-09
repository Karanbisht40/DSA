
public class TrappedWater {
  
    public static int caluclate_rain(int height[]){
        int n = height.length;
        //left max boundary
        int leftMax[]= new int[n]; 
        leftMax[0]= height[0];
        for(int i =1; i<n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }
    //right max boundary
    int rightMax[] =new int[height.length];
    rightMax[n-1]= height[n-1]; //last se suru kiya h
    for(int i =n-2; i>=0; i--){
        rightMax[i]= Math.max(height[i], rightMax[i+1]);
    }
    int TrappedWaterLevel =0;
    //loop
    for(int i =0; i<n; i++){
        //min of water level =min(max left,max right)
         int WaterLevel = Math.min(leftMax[i], rightMax[i]);
         //trapped water = waterlevel -height[i]
         TrappedWaterLevel += WaterLevel -height[i];
    }
    return TrappedWaterLevel;
    }
    
    public static void main(String[] args) {
         int height[]= { 4,2,0,6,3,2,5};
        System.out.println(caluclate_rain(height)); 
    }
}
