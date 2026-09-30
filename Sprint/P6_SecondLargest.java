// Program #6: Find Second Largest in an Array
// Given a hardcoded int[] array, find and print the second largest element.
//
// Example: int[] arr = {12, 35, 1, 10, 34, 1};
// Output: Second largest is 34
//
// Edge case to think about: what if array has duplicates like {5, 5, 5}?
//
// Hint: You need TWO tracking variables this time.
//
// Run with: java P6_SecondLargest.java

// YOUR CODE BELOW:
import java.util.*;

class P6_SecondLargest{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter "+size+" numbers");
        for(int i=0;i<size;i++)
        {
            numbers[i] = sc.nextInt();
        }
        int max=numbers[0];
        int smax=Integer.MIN_VALUE;
        for(int j=0;j<size;j++)
        {
            if(numbers[j]>max)
            {
                max = numbers[j];
            }
        }
        for(int k=0;k<size;k++)
        {
            if(numbers[k]<max && numbers[k]>smax)
            {
                smax = numbers[k];
            }
        }
        System.out.println("Second biggest number is: "+smax);
    }
}