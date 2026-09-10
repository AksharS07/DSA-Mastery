# Day 28: Sliding Window (Contains Duplicate II)
**Date:** 2026-09-09
**Start Time:** *7:31 PM*
**End Time:** *8:46 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** Variable Scoping Drill. Write a method `int sumArray(int[] nums)` that returns the total sum of the array.
*(Goal: Declare the sum variable OUTSIDE the loop, accumulate INSIDE the loop, return OUTSIDE the loop).*

**Your Code:**
```java
class Solution {
    public int sumArray(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        return sum;
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
*(Note: We recycle topics intentionally via Spaced Repetition so your brain doesn't freeze under interview pressure. But since you want a push, let's hit a Profit/Loss trap).*

**Problem 1 (Profit & Loss - The 100% Rule):**
Akshar sells his mechanical keyboard for ₹4,800, making a 20% profit on his original cost. 
If he had wanted to make a 30% profit instead, what should he have sold it for?
*(Hint: Do NOT calculate 20% of 4,800. The Cost Price is ALWAYS 100%. If he made 20% profit, then ₹4,800 is exactly 120% of the Cost Price).*

**Your Working:**
```text
So 120% is 4800 
10% = 4800/12=400
so 130% = 4800+400=5200?
```

---

## 3. DSA: Fixed Sliding Window [00:40 - 01:25]

### Problem: Contains Duplicate II (LeetCode 219)
Given an integer array `nums` and an integer `k`, return `true` if there are two **distinct indices** `i` and `j` in the array such that `nums[i] == nums[j]` and `Math.abs(i - j) <= k`.

**Plain English:** Are there two identical numbers that are at most `k` distance apart?

**Example:**
Input: `nums = [1, 2, 3, 1]`, `k = 3`
Output: `true` (The two `1`s are at index 0 and 3. Distance is `3 - 0 = 3`, which is `<= 3`).

**The Sliding Window + HashSet approach:**
We want a sliding window of size `k`. To instantly check if a number is already in our window, we use a `HashSet`. If the window gets larger than `k`, we simply remove the oldest element from the set!

**Steps to code:**
1. Create a `HashSet<Integer> window = new HashSet<>();`.
2. Loop through the array using `for (int i = 0; i < nums.length; i++)`.
3. Inside the loop, check if the window is too big: `if (i > k) { window.remove(nums[i - k - 1]); }` (This drops the element that just slid out of the window).
4. Now check if the current number is already in the window using `window.contains()`. If it is, `return true;`.
5. If it isn't, add the current number to the window using `window.add()`.
6. If the entire loop finishes without returning true, `return false;`.

**Your Code:**
```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>k)
            {
                window.remove(nums[i-k-1]);
            }
            if(window.contains(nums[i]))
            {
                return true;
            }
            else
            {
                window.add(nums[i]);
            }
        }
        return false;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Missed the variable scoping rule on the first attempt (shoved it between the `for` and the `{`), but corrected it perfectly. `int sum = 0;` must always go *before* the loop.
- **Aptitude:** Brilliant logic here. Instead of calculating 100% first, you found 10% (400) and just added it to the 120% (4800) to jump straight to 130% (5200). That's high-level test-taking intuition.
- **DSA:** Nailed the sliding window logic (remove oldest, check duplicate, add newest). Tripped up on Java syntax for arrays (`nums[]`) vs methods (`window.contains()`). Remember: Arrays always use square brackets `[]`, methods always use parentheses `()`.

**Final Verdict:** Sliding Window + HashSet unlocked. You now know how to track a moving window of elements using a Set. Excellent work.

