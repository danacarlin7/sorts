 */
package evennum;
import java.util.Scanner;
/**
 *
 * @author DanaCarlin
 */
public class EvenNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int number;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter an Integer greater than 1:");
     number = scan.nextInt();
    
// TODO code application logic here
        if (number <2){
            System.out.println("Error. Input value must be greater than 1");
          
        }
   int sum = 0; 
   for (int current =2; current<=number; current+=2)
       sum += current;
    System.out.println("The total of all even numbers between 2 and " + number + "inclusive is " + sum );
    }
}