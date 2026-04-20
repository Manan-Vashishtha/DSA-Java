package Arrays;
import java.util.*;

//_______________Maximum Sum of Subarray__________________
public class MaxSubarraySum {
    public static void maxSubarraySum(int numbers[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i <numbers.length; i++){
            int start = i;
            for(int j=i; j <numbers.length; j++){
                int end = j;
                curr = 0;
                for(int k = start; k <= end; k++){
                    //subarray sum
                    curr += numbers[k];
                }
                System.out.println(curr);
                if(curr > maxSum){
                    maxSum = curr;
                }
            }
        }
        System.out.println("the maximum sum of subarray is: "+maxSum);
    }
    

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);

    }
}
