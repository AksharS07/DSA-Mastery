# Day 29: Variable Sliding Window
**Date:** 2026-09-10
**Start Time:** *6:39 PM*
**End Time:** *7:08 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** Yesterday we introduced the `HashSet`. Let's make sure the syntax stuck.
Write a method `public boolean hasFirstNumber(int[] nums, int target)` that creates a `HashSet<Integer>`, adds the very first element of `nums` to it, and then returns whether the `target` is in the set.
*(Goal: Drill the `new HashSet<>()`, `.add()`, and `.contains()` syntax from memory).*

**Your Code:**
```java
class Solution {
    public boolean hasFirstNumber(int[] nums, int target) {
        HashSet<Integer> hash = new HashSet<>();
        if(int i=0; i<nums.length;i++){
        hash.add(nums[0]);
        if(hash.contains(target))
        {
            return true;
        }
        }
        return false;
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
*(Note on your new teacher: See my chat message for what this guy is actually teaching you. It's HR prep!)*

**Problem 1 (Average Speed Trap):**
Akshar drives to his college at 40 km/hr. He realizes he forgot his laptop and immediately drives back home at 60 km/hr. What is his average speed for the whole round trip?
*(Hint: Do NOT say 50. Use the specific average speed formula from your Quants formulas).*

**Your Working:**
```text
(2*40*60)/40+60
4800/100
48km/hr
```

---

## 3. DSA: Variable Sliding Window [00:40 - 01:25]

### Problem: Longest Substring Without Repeating Characters (LeetCode 3)
Given a string `s`, find the length of the **longest substring** without repeating characters.

**Example:**
Input: `s = "abcabcbb"`
Output: `3` (The answer is "abc", with the length of 3).

**The Concept:**
Unlike yesterday where the window was fixed at size `k`, today the window is a **rubber band** that stretches and shrinks.
- A `right` pointer moves forward, adding characters to the window and stretching it.
- If the `right` pointer hits a duplicate character, the `left` pointer moves forward (shrinking the window) until the duplicate is kicked out.
- We track the maximum size the window ever reaches.

**Steps to code:**
1. Create a `HashSet<Character> window = new HashSet<>();`.
2. Create `int left = 0;` and `int maxLength = 0;`.
3. Create a `for` loop where `int right = 0; right < s.length(); right++`.
4. Inside the loop, check for duplicates using a `while` loop: `while (window.contains(s.charAt(right)))`. 
5. Inside that `while` loop, shrink the window from the left: `window.remove(s.charAt(left)); left++;`.
6. Once the duplicate is gone, add the new character: `window.add(s.charAt(right));`.
7. Update the max length: `maxLength = Math.max(maxLength, right - left + 1);`.
8. Return `maxLength`.

**Your Code:**
```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++)
        {
            while(window.contains(s.charAt(right)))
            {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
        
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Wrote `if` instead of `for` initially, and used a loop when only a single check (`nums[0]`) was needed. However, the `HashSet` syntax (`new`, `.add`, `.contains`) was flawlessly memorized.
- **Aptitude:** Absolutely perfect application of the Average Speed harmonic mean formula (`2xy / (x+y)`). The math was clean and correct.
- **DSA:** Successfully implemented the core Variable Sliding Window logic (the `while` loop that shrinks the window until the duplicate is gone). Tripped over Java scoping again by putting the `return` statement *inside* the `for` loop (the early return trap).

**Final Verdict:** Variable Sliding Window unlocked! The algorithm logic is solidifying, but Java scope boundaries (where to put returns and declarations relative to brackets) still need reps.

