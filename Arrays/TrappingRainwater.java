package Arrays;
import java.util.*;

public class TrappingRainwater {
    public static int trappingRainwater(int height[]){
        int n = height.length;
        //Calculate Left maximum bound -Array

        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //Calculate Right maximum bound -Array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
            //WaterLevel = min(Left maximum bound, Right maximum bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = (waterlevel - height)*width(1)
            trappedWater += waterLevel-height[i];

        }
        return trappedWater;
    }


    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRainwater(height));

    }
    
}
