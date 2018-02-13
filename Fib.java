
import java.util.HashMap;

class Fib{
//missed some code
    //making this so less recursions 
    ///DYNAMIC PROGRAMMIN
    
   static int counter = 0;
public static int fibonacci (int n){
counter++;
if (n==0) return 0;
if (n ==1) return 1;

return fibonacci(n-1) + fibonacci(n-2);
}
static HashMap<Integer,Integer> fibMap = new HashMap<Integer, Integer>();
static{
fibMap.put(0,0);
fibMap.put(1,1);
}

public static int fibonacciDP(int n){
counter++;
if (n<0)return 0;

if (fibMap.containsKey(n)) return fibMap.get(n);
int fibValue = fibonacciDP(n-2) + fibonacciDP(n-1);
fibMap.put(n, fibValue);
return fibValue;
}
public static void main (String[] args)
{
    int n = 5;
    System.out.println("fib("  +  n +  ") = " + fibonacci(n));
    System.out.println(counter + "recursions" );
    System.out.println( "fibDP " + n + " = " + fibonacciDP(n));
    System.out.println(counter + " recursions");
    
}}

