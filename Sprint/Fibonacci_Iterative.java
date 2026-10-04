// Faculty Homework: Fibonacci Series (Iterative)
// Print the first N Fibonacci numbers.
//
// Fibonacci: each number is the sum of the two before it.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//
// Example: N=10 → 0 1 1 2 3 5 8 13 21 34
//
// Think about: what two variables do you need to track?
// How do you "shift" them forward each step?
//
// Run with: java Fibonacci_Iterative.java

// YOUR CODE BELOW:
import java.util.*;
class Fibonacci_Iterative
{
    public static void main(String[] args){
        int first=0;
        int second =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("First "+number+" numbers of the fibonacci series are:");
        for(int i=0;i<number;i++)
        {
            System.out.println(first+ " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}