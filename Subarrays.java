package Arrays;
import java.util.*;

public class Subarrays {
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        
        for( int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j < numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k]+ " ");//print
                    sum += numbers[k];
                }
                System.err.println();
                System.out.println("sum of Subarray : "+sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Number of Subarrays: "+ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
