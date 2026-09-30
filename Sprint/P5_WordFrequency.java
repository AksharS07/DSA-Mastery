// Program #5: Word Frequency with HashMap
// Given a hardcoded String sentence (e.g. "the cat sat on the mat the cat"),
// count how many times each word appears and print the result.
//
// Expected output (order may vary):
//   the → 3
//   cat → 2
//   sat → 1
//   on → 1
//   mat → 1
//
// Hints for Round 1 (google these if stuck):
//   - How to split a String into words: String.split()
//   - How to declare a HashMap: HashMap<String, Integer>
//   - How to update a count: .getOrDefault()
//   - How to iterate over a HashMap: Map.Entry / entrySet()
//
// Run with: java P5_WordFrequency.java

// YOUR CODE BELOW:

import java.util.*;

class P5_WordFrequency{
    public static void main(String[] args){
        HashMap<String, Integer> frequency = new HashMap<>();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        for(String word : words){
            frequency.put(word , frequency.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> entry : frequency.entrySet())
            {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}