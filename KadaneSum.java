package Arrays;

import java.util.*;

public class KadaneSum {
    public static void kadane(int numbers[]){
       int currSum = 0;
       int maxSum = Integer.MIN_VALUE;

       for(int i=0; i<numbers.length; i++){
        currSum = currSum + numbers[i];
        if (currSum < 0) {
            currSum = 0;
        }
        maxSum = Math.max(currSum, maxSum);
       }

       System.out.println("The maximum Subarray Sum is: " +maxSum);
    }


//____code using big of n (O(n)) time complexity
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);

    }
    
}
