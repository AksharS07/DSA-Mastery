# Day 31: String Manipulation (Valid Anagram)
**Date:** 2026-09-13
**Start Time:** *4:58 PM*
**End Time:** *5:24 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** String vs Array Syntax. 
Write a method `public char getLastChar(String s)` that returns the very last character of a given string.
*(Hint: Arrays use `.length` (no parentheses). Strings use `.length()` (with parentheses). To get a character from a string, you MUST use `.charAt(index)`, not brackets `[]`!).*

**Your Code:**
```java
class Solution {
    public char getLastChar(String s) {
        char last = s.charAt(s.length()-1);
        return last;
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
**Problem 1 (Calendar - Odd Days):**
Today is Sunday. What day of the week will it be exactly 100 days from now?
*(Hint: Divide 100 by 7. Find the remainder (these are the "odd days"). Count forward from Sunday).*

**Your Working:**
```text
100/7= 14.blah blah
but remainder =2 so its tuesday
```

---

## 3. DSA: String Manipulation [00:40 - 01:25]

### Problem: Valid Anagram (LeetCode 242)
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.
*(An Anagram is a word formed by rearranging the letters of a different word, using all the original letters exactly once).*

**Example:**
Input: `s = "anagram"`, `t = "nagaram"`
Output: `true`

**The Concept:**
How do we know if two strings have the exact same letters in the exact same amounts? We count them!
Since the English alphabet only has 26 lowercase letters, we can use a simple integer array of size 26 as a frequency counter (index 0 is 'a', index 1 is 'b', etc.). 
If we add 1 for every letter in `s`, and subtract 1 for every letter in `t`, the final array should be entirely zeros!

**Steps to code:**
1. First, check if the lengths of `s` and `t` are different. If they are, `return false;`.
2. Create an array of size 26: `int[] count = new int[26];`
3. Loop through the length of the string: `for(int i = 0; i < s.length(); i++)`
4. Inside the loop, extract the character from `s` and add 1 to its bucket. 
   *(Pro-tip: You can convert a char to an array index from 0-25 by subtracting 'a'. Like this: `count[s.charAt(i) - 'a']++;`)*
5. In the same loop, extract the character from `t` and subtract 1 from its bucket: `count[t.charAt(i) - 'a']--;`
6. After that loop finishes, create a second loop to check the `count` array: `for(int i = 0; i < count.length; i++)`
7. If any `count[i] != 0`, it means the strings aren't perfect anagrams. `return false;`.
8. If the loop finishes without returning false, `return true;`.

**Your Code:**
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i<s.length();i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i<count.length;i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Flawless logic. `s.charAt(s.length()-1)` is the exact perfect way to get the last character of a string in Java. You just returned the whole string at the end instead of the `last` variable, but the string mechanics were perfect.
- **Aptitude:** 100/7 gives a remainder of 2. Sunday + 2 = Tuesday. Quick and perfect.
- **DSA:** You successfully wrote the Frequency Counter pattern. By converting characters to ASCII math (`- 'a'`), you mapped a string to an array perfectly. The loops are structurally perfect, and there are no scoping bugs. 

**Final Verdict:** Valid Anagram unlocked. You now know how to count character frequencies without using a heavy HashMap.

