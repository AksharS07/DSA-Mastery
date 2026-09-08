# Day 27: Fixed Sliding Window (Max Sum Subarray)
**Date:** 2026-09-08
**Start Time:** *9:27 PM*
**End Time:** *10:06 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** Yesterday you struggled with Java array return syntax. Let's drill it.
Write a method `public int[] getExtremes(int min, int max)` that takes two integers and simply returns them as a new integer array (with `min` at index 0, and `max` at index 1). Do it in ONE line of code using the inline array return syntax!

**Your Code:**
```java
class Solution {
    public int[] getExtremes(int min, int max) {
        return new int[] {min,max};
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
**This week's Monday class topic: Calendar Odd Days & Vedic Squaring.**

**Q1 (Calendar):** If today is Tuesday, what day of the week will it be after 45 days? 
*(Hint: Divide by 7 to find the odd days!)*
**Your Working:**
```text
so when we divide 45 by 7 we get the remainder as 3 so 3 odd days imply after 45 days its friday
```

**Q2 (Vedic Squaring - Base 200):** What is `194²`? 
*(Hint: Base 200. It's below the base, so subtract the deviation. Don't forget the ×2 multiplier for the LHS!)*
**Your Working:**
```text
so
200-194=6
6 square is 36(rhs)
194-6=188*2=376(lhs)
so the final answer is 37636
```

---

## 3. DSA: Sliding Window (Fixed Window) [00:40 - 01:25]

### The Concept
Imagine a window of size `k=3` sliding across an array.
`[1, 2, 3, 4, 5]`
Window 1: `[1, 2, 3]` -> Sum = 6
Window 2: `[2, 3, 4]` -> Sum = 9

**The Naive Way:** Recalculate the whole window from scratch every time.
**The Sliding Window Way:** To move the window right, just ADD the new element entering the window, and SUBTRACT the old element leaving the window! It's that simple. 

### Problem: Max Sum Subarray of size K
Given an array of integers `nums` and an integer `k`, find the maximum sum of any contiguous subarray of size `k`.

**Example:**
Input: `nums = [2, 1, 5, 1, 3, 2]`, `k = 3`
Output: `9`
Explanation: Subarray with maximum sum is `[5, 1, 3]`.

**Steps to code:**
1. Calculate the sum of the FIRST window (the first `k` elements using a basic `for` loop).
2. Set `int maxSum = currentSum;`.
3. Loop from `i = k` to the end of the array.
4. Inside the loop, slide the window: `currentSum = currentSum + nums[i] - nums[i - k];`.
5. Update `maxSum` using `Math.max(maxSum, currentSum);`.
6. Return `maxSum`.

**Your Code:**
```java
class Solution {
    public int maxSum(int[] nums, int k)
    {
        int currentSum =0;
        for(int i=0;i<k;i++)
        {
        currentSum = currentSum+nums[i];
        }
        int maxSum = currentSum;
        for(int i=k;i<nums.length;i++)
        {
            currentSum = currentSum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum,currentSum);
        } 
        return maxSum;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Initially messed up the array return syntax (`return int[]{min[0], max[1]}`). Fixed it to the correct `return new int[]{min, max};`.
- **Aptitude:** Nailed the Calendar problem. Had a minor subtraction error on the Vedic squaring (194-6 is 188, not 187) but the method was flawlessly applied.
- **DSA:** You grasped the Sliding Window logic immediately. The only issue was Java variable scoping — you tried to declare `maxSum` inside the first loop and then use it in the second loop. Once you moved the declaration between the loops, the code was textbook perfect.

**Final Verdict:** Sliding Window pattern unlocked! Excellent work today.

