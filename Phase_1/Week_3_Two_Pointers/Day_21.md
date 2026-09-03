# Day 21: Two Pointers (Reverse Array / Palindrome)
**Date:** 2026-09-01
**Start Time:*11:03 PM* 
**End Time:** *11:50 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** 
1. Initialize an `ArrayList` of Strings called `words`.
2. Add the words "Alpha", "Beta", and "Gamma" to it.
3. Replace the word at index 1 ("Beta") with "Delta" using the appropriate in-place method (do not use `remove` and `add`).
4. Extract the last element from the list, convert it to all lowercase, and verify if it equals "gamma" using the correct String comparison method.
5. If it matches, print "Match found!".

**Your Code:**
```java
     
     import java.util.*;
     class Main{
        public static void main(String[] args){
            ArrayList<String> words = new ArrayList<>();
            words.add("Alpha");
            words.add("Beta");
            words.add("Gamma");
            words.set(1,"Delta");
            String target = words.get(words.size()-1);
            target = target.toLowerCase();
            if(target.equals("gamma"))
            {
                System.out.println("Match Found");
            }              
            }
        }
     




```

---

## 2. Aptitude Block [00:10 - 00:40]
**Task:** Akshar travels from his home to college at a speed of 30 km/hr. He returns from college to his home along the exact same route at a speed of 20 km/hr. What is his average speed for the entire round trip? (Solve without a calculator).

**Your Solution & Working:**
```text

Average speed of the TRIP = (2*20*30)/(20+30)=1200/50=24KM/hr



```

---

## 3. DSA Patterns [00:40 - 01:25]
**Problem:** Write a function that reverses a string. The input string is given as an array of characters `s`. You must do this by modifying the input array **in-place** with `O(1)` extra memory using the Two Pointers technique.

Example:
Input: `s = ['a', 'k', 's', 'h', 'a', 'r']`
Output: `['r', 'a', 'h', 's', 'k', 'a']`

**Your Code:**
```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        char temp;
        while(left<right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
            }
        
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Solid logic, but tripped up slightly on `put` vs `set` and array length vs string length syntax. Also forgot String immutability at first. Keep reviewing the Cheat Sheet—it's cementing those rules!
- **Aptitude:** Flawless. Did not fall for the intuitive trap and perfectly applied the Average Speed formula for a round trip.
- **DSA:** Great job! The core Two Pointers swap logic was entirely correct on the first try. Removed the unnecessary Palindrome baggage and finalized a perfect `O(1)` in-place reversal.

**Final Verdict:** Day 21 is a success! You pushed through the frustration and secured the muscle memory for the classic Two Pointers pattern.
