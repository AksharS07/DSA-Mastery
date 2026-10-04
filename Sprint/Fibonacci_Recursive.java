// Faculty Homework: Fibonacci Series (Recursive)
// Print the Nth Fibonacci number, OR print the series up to N using recursion.
// Let's do a method that returns the Nth Fibonacci number.
//
// Pattern: 
// fib(0) = 0
// fib(1) = 1
// fib(n) = fib(n-1) + fib(n-2)
//
// Think about:
// 1. What is the BASE CASE? (When should the recursion stop?)
// 2. What is the RECURSIVE CALL?
//
// Run with: java Fibonacci_Recursive.java

import java.util.*;

class Fibonacci_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }


    // YOUR CODE BELOW:
    // Write the static recursive method fib(int n)

   static int fib(int n){
    if(n<=1)
    {
        return n;
    }
    return fib(n-1)+ fib(n-2);
   }
}