// Program #8: Print All Prime Numbers from 1 to 100
// A prime number is only divisible by 1 and itself.
// 2 is the smallest prime. 1 is NOT prime.
//
// Expected output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
//
// You need: a nested loop (outer loop for each number, inner loop to check divisibility)
// and a boolean flag.
//
// No googling hints this time — you already know loops, if/else, and boolean flags from P4.
//
// Run with: java P8_Primes.java

// YOUR CODE BELOW:
import java.util.*;

class P8_Primes{
    public static void main(String[] args)
    {
        int count =0;
        int number =2;
        
        while(count<25)
        {
            if(isPrime(number))
            {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
            
        }
        return true;
        
    }
}
