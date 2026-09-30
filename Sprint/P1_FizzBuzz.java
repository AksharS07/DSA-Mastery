// Program #1: FizzBuzz (1-50)
// Print numbers 1 to 50.
// - Divisible by 3 → print "Fizz"
// - Divisible by 5 → print "Buzz"
// - Divisible by both → print "FizzBuzz"
// - Otherwise → print the number
//
// Round 1: Googling syntax is OK.
// Run with: java P1_FizzBuzz.java

// YOUR CODE BELOW:

class P1_FizzBuzz {
    public static void main(String[] args){
    for(int i=1;i<=50;i++)
    {
        if(i%3==0 && i%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(i%3==0)
        {
            System.out.println("Fizz");
        }
        else if(i%5==0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(i);
        }
    }
    }
}
