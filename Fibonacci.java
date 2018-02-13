public class Fibonacci {
 static int counter = 0;
 
    public static void main(String a[]){

         int fibCount = 10;
         int[] fib = new int[fibCount];
         fib[0] = 0;
         fib[1] = 1;
         for(int i=2; i < fibCount; i++){
             fib[i] = fib[i-1] + fib[i-2];
             counter++;
         }
         System.out.println(counter);
         for(int i=0; i< fibCount; i++){
                 System.out.print(fib[i] + " ");
         }
         
    }
   
}


/* FROM CLASS
public static int fibonacci (int n){
counter++;
if (n==0) return 0;
if (n ==1) return 1;

return fibonacci(n-1) + fibonacci(n-2);

static HashMap<Inteer, Integer> fibMap = new HashMap<Inteer, Integer>;
static {
fibMap.put(0,0);
fibMap.put(1,1);

*/