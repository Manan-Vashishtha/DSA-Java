package Sorting;

import java.util.Arrays;
import java.util.Collections;
public class Inbuilt {
    
    //used only for print arrays 
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]= {5, 4, 3, 2, 1};//we use (Integer) because it can be perform on Integer object
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));//another technique to print arrays
        System.out.println();
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);

    }
}
