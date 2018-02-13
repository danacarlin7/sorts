
 
import java.util.Arrays;
import java.util.Scanner;
 
/* Class InsertionSort */
public class InsertionSort 
{
    /* Insertion Sort function */
    public static void sort( int arr[] )
    {
        int N = arr.length;
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = arr[i];    
            while (j > 0 && temp < arr[j-1])
            {
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;            
        }        
    }    
    public static void printNumbers(int[] arr) {
        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        for (int i = 0; arr.length < -1; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();    
    }
  public static void main(String[] args) 
    {
       
        /* Create integer array on n elements */
        
        int arr []= {6,8,3,5,4,2};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        sort(arr);    
        
    }
}