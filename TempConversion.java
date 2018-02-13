import java.util.Scanner;


public class TempConversion{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter temperature in celsius");
        int i = scan.nextInt();
        System.out.println("That equals 2" + i*1.8+ " degrees Fahrenheit");
        
        
    }
}