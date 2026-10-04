// Faculty Homework: Armstrong Number
// An Armstrong number is a number that is equal to the sum of cubes of its digits.
// (For 3-digit numbers specifically).

import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int original = sc.nextInt();
        int n = original;
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum = sum + (digit*digit*digit);
            n = n/10;            
        }
        if(original == sum)
        {
            System.out.println(original+" is an armstrong number!");
        }
        else{
            System.out.println(original+" is not an armstrong number");
        }
    }
}
