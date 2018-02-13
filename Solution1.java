import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
void insertionSort(unsorted){
            String key;
            int i,j;
           for (j = 1; j < n; j++) {
        key = unsorted[j];
        i = j - 1;
        while (i >= 0) {
            if (key.compareTo(unsorted[i]) < 0) {
                break;
            }
          unsorted[i + 1] = unsorted[i];
            i--;
        }
        unsorted[i + 1] = key;
        System.out.println(Arrays.toString(unsorted));
    }
    System.out.println(Arrays.toString(unsorted));
}

    public static void main(String[] args) {
        
        System.out.println("How big will array be");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter number");
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        System.out.println(Arrays.toString(unsorted));
       
    }
}
        // your code goes here
   


/*public class NewClass{
    public static void insertionSort(int[] nums){
        for (int i=0; i<nums.length; i++){
           int temp = nums[i];
           int j = i;
         /* check if stuff in left side is greater or
            less than the current element. */

        /*  while(j > 0  && temp < nums[ j -1]) {

           // move the left side element one positiono forward
                nums[ j ] = nums[ j-1];   
                j= j --;

           }
         // move current element to its  correct position.
           nums[ j ] = temp;       
     }  
        
}
    private static void printNumbers(int[] nums) {
          
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] nums = { 3, 2, 10, 4, 23, 12, 30, 0, 1 };
        insertionSort(nums);
  
    }
}    
    
        */

    
