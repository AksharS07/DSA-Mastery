# Day 30: Variable Sliding Window (Minimum Size Subarray Sum)
**Date:** 2026-09-11
**Start Time:** *8:29 PM*
**End Time:** 

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** The Early Return Trap. Write a method `public int findTarget(int[] nums, int target)` that loops through the array. If it finds the target, return the index `i`. If it finishes the entire loop without finding it, return `-1`. 
*(Goal: Put the fallback `return` strictly outside the loop!).*

**Your Code:**
```java
class Solution {
    public int findTarget(int[] nums, int target) {
        
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
**Problem 1 (Time Gap Formula):**
Akshar drives to work at 30 km/hr and reaches 10 minutes late. The next day, he drives at 40 km/hr and reaches 5 minutes early. What is the distance to his work?
*(Hint: Total time gap is 15 minutes. **DO NOT** plug 15 directly into the distance formula! Convert minutes to hours first!).*

**Your Working:**
```text

```

---

## 3. DSA: Variable Sliding Window [00:40 - 01:25]

### Problem: Minimum Size Subarray Sum (LeetCode 209)
Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a contiguous subarray whose sum is greater than or equal to `target`. If there is no such subarray, return `0`.

**Example:**
Input: `target = 7`, `nums = [2,3,1,2,4,3]`
Output: `2` (The subarray `[4,3]` has the minimal length under the problem constraint).

**The Concept:**
Yesterday we used a "rubber band" window to find the *longest* valid string. Today, we use it to find the *shortest* valid sum. 
- Expand the `right` pointer to add elements to your `currentSum`.
- Once `currentSum >= target`, your window is valid! 
- Now, record the size of the window, and try to **shrink** it from the `left` (subtracting `nums[left]`) to see if it can get even shorter while still staying `>= target`.

**Steps to code:**
1. Create `int left = 0;`, `int currentSum = 0;`, and `int minLength = Integer.MAX_VALUE;` (We use MAX_VALUE because we are looking for a minimum, so we must start infinitely large).
2. Loop `int right = 0; right < nums.length; right++`.
3. Inside the loop, add the new element to the sum: `currentSum = currentSum + nums[right];`.
4. Create a `while` loop that runs as long as `currentSum >= target`.
5. **Inside the `while` loop:**
   - Record the window size: `minLength = Math.min(minLength, right - left + 1);`
   - Shrink the window: `currentSum = currentSum - nums[left];`
   - Move the left pointer: `left++;`
6. After the `for` loop finishes, check if `minLength` is still `Integer.MAX_VALUE`. If it is, return `0`. Otherwise, return `minLength`.

**Your Code:**
```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** 
- **Aptitude:** 
- **DSA:** 

**Final Verdict:** 
