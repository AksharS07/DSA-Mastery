# Day 33: Week 4 Checkpoint
**Date:** 2026-09-16
**Start Time:** *10:55 PM*
**End Time:** *11:59 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** String Manipulation Checkpoint.
Write a method `public String getMiddle(String s)` that returns the string WITHOUT its first and last characters.
*(Hint: Use `s.substring(startIndex, endIndex)`. Remember that the start index is inclusive, but the end index is exclusive!)*

**Your Code:**
```java
class Solution {
    public String getMiddle(String s) {
        return s.substring(1,s.length()-1);
    }
}
```

---

## 2. Aptitude Checkpoint [00:10 - 00:40]

**Q1 (Time & Work - LCM Method):**
X can do a job in 20 days. Y can do the same job in 30 days. They start working together. How many days will it take them to complete the whole job?
*(Hint: Find total work units via LCM. Find daily efficiencies. Divide).*

**Your Working:**
```text
so...
TW=e*t
LCM of 20 and 30 is 5*2*2*3=60
so efficiency of
x=60/20=3
y=60/30=2
so total efficiency is 5
so time = 60/5=12 days
```

**Q2 (Vedic Squaring - Base 100):**
What is `109²`?
*(Hint: It is above the base. Add deviation to number for LHS. Square deviation for RHS).*

**Your Working:**
```text
109-100=9
9 square is 81 (rhs)
109+9=118 (lhs)
so the final answer is 11881
```

---

## 3. DSA Checkpoint: Sliding Window [00:40 - 01:25]

### Problem: Max Sum Subarray of size K (Fixed Window)
Given an array `nums` and integer `k`, find the maximum sum of any contiguous subarray of size `k`.
*(This is the very first Sliding Window problem you did on Day 27. Let's see if the logic stuck! Watch your variable scoping!).*

**Steps to code:**
1. Calculate the sum of the first `k` elements (using a `for` loop) and store it in `int currentSum`.
2. Set `int maxSum = currentSum;` (outside the loops!).
3. Loop from `i = k` to the end of the array.
4. Inside the loop, ADD the new element (`nums[i]`) and SUBTRACT the old element (`nums[i-k]`) from `currentSum`.
5. Update `maxSum` using `Math.max`.
6. Return `maxSum` at the very end.

**Your Code:**
```java
class Solution {
    public int maxSum(int[] nums, int k) {
        int currentSum = 0;
        for(int i=0;i<k;i++)
        {
            currentSum = currentSum + nums[i];
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
- **SRS:** Perfect execution of `.substring(1, s.length()-1)`.
- **Aptitude Q1:** Flawless LCM method. Found total work as 60, efficiencies as 3 and 2. 60 / 5 = 12 days. 
- **Aptitude Q2:** Flawless Vedic math base 100 method. `11881` is correct.
- **DSA:** You successfully wrote the Fixed Sliding Window pattern with zero scoping bugs. You correctly initialized `maxSum` outside the loop, added the new element `nums[i]`, and subtracted the old element `nums[i-k]`. 

**Final Verdict:** Week 4 Checkpoint passed with flying colors! You have officially mastered the basics of Sliding Windows.
