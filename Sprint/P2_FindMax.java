// Program #2: Find Max in an int[] array
// Given a hardcoded int array, find and print the maximum value.
// Example: {3, 7, 2, 9, 1, 5} → Output: 9
//
// Run with: java P2_FindMax.java

// YOUR CODE BELOW:

//P2 cold 26th sep

class P2_FindMax {
    public static void main(String[] args){
        int[] arr = {3,7,2,9,1,5};
        int max = arr[0];
        for(int i=0; i<=arr.length-1;i++)
        {
            if(arr[i]>=max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}