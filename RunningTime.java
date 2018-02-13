import java.io.*;
import java.util.*;

public class RunningTime {

   
        
    public static void insertionSort2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
         int count = 0;   
        for (int i = 1; i < ar.length; i++) {
            int n = ar[i];
            int pos = i;
            while (pos > 0 && ar[pos-1] > n) {
                ar[pos] = ar[--pos];
            }
            ar[pos] = n;
            //System.out.println(Arrays.toString(ar));
            
            count++;
        }
        System.out.println(count);
    }

     
      
    public static void main(String[] args) {
        System.out.println("How big do you want array to be?");
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
           System.out.println("Enter a number");
            ar[i]=in.nextInt(); 
       }
       insertionSort2(ar);   
       //printArray(ar);
                    
    }    
    /*private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }*/
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
