// Program #7: Check if Two Strings are Anagrams
// Two strings are anagrams if they contain the exact same characters
// in the exact same frequency, just rearranged.
//
// Example: "listen" and "silent" → Anagrams ✓
//          "hello" and "world"  → Not Anagrams ✗
//
// Two valid approaches (pick one):
//   Approach 1: Convert both to char[], sort them, compare
//   Approach 2: Count character frequencies with HashMap
//
// Hints for Round 1 (google if stuck):
//   - String to char array: .toCharArray()
//   - Sort a char array: Arrays.sort()
//   - Compare two char arrays: Arrays.equals()
//
// Run with: java P7_AnagramCheck.java

// YOUR CODE BELOW:

import java.util.*;

class P7_AnagramCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String first = sc.nextLine();
        System.out.println("Enter the second string");
        String second = sc.nextLine();
        first = first.toLowerCase();
        second = second.toLowerCase();
        char[] Farr = first.toCharArray();
        char[] Sarr = second.toCharArray();
        Arrays.sort(Farr);
        Arrays.sort(Sarr);
        if(Arrays.equals(Farr,Sarr))
        {
            System.out.println("It is an anagram");
        }
        else
        {
            System.out.println("It is not an anagram");
        }
    }
}