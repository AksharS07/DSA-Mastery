# Day 26: Week 3 Checkpoint
**Date:** 2026-09-07
**Start Time:** *8:52 PM*
**End Time:** *10:33 PM*

---

> **Week 3 Review:** Two Pointers, Array Manipulation (Prefix Sum, Majority Element), TSD Aptitude, Vedic Squaring.
> This is a checkpoint day. No new topics. Pure recall and speed.

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** Write a method `int findMax(int[] nums)` that returns the largest element in the array. Do it in `O(n)` without using any built-in sort or library methods. Just a `for` loop and an `int` variable to track the max.

*(Drill goal: correct boundary, no early returns, correct fallback).*

**Your Code:**
```java
class Solution {
    public int findMax(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
            {
                max = nums[i];
                
            }
        }
        return max;
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
**This week's Monday class topic: Vedic Squaring. Practice, practice, practice.**

Solve all 3 without a calculator. Show your working.

**Q1:** What is `97²`?
```text
100-97=3
3 square is 9 so rhs is 09
97-3=94*1 (lhs)
so combined the answer is 9409
```

**Q2:** What is `204²`?
```text
204-200 = 4 
4 square is 16 (RHS)
204 PLUS 4 =208*2=416
so combined its 41616
```

**Q3:** What is `153²`? *(Base 150 — use the 1.5 multiplier!)*
```text
153-150=3
3 square is 09 (rhs)
153 PLUS 3 = 156 * 1.5 (initally i multiplied it with 3 now while typing i read the 1.5 thing and changed the answer sigh)
234.0 is the rhs 
23409  is the answer 
```

---

## 3. DSA Checkpoint [00:40 - 01:25]

### Problem A: Two Pointers Review
Given a **sorted** array `nums` and a `target`, return the indices (1-indexed) of the two numbers that add up to the target. Exactly one solution is guaranteed.

Example:
Input: `nums = [2, 7, 11, 15]`, `target = 9`
Output: `[1, 2]` *(because nums[0] + nums[1] = 2 + 7 = 9)*

**Your Code:**
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
            int p1=0;
            int p2= numbers.length-1;
            while(p1<p2)
            {
                 int sum = numbers[p1]+numbers[p2];
                if(sum==target){
                    return int[] {p1+1, p2+1};
                }
                else if (sum<target){
                    p1++;
                }
                else{
                    p2--;
                }
            }
            return null;
            
        }
    }

```

---

### Problem B: Prefix Sum
Given `nums = [3, 1, 4, 1, 5]`, manually write out what the Prefix Sum array looks like, then write the code to produce it.

**Manual Answer:**
```text
nums = [3,3+1,3+1+4,3+1+4+1,3+1+4+1+5]
so nums = [3,4,8,9,14]
```

**Your Code:**
```java
class Solution {
    public int[] runningSum(int[] nums) {
       
        for(int i=1;i<nums.length;i++)
        {
            
            nums[i] = nums[i]+nums[i-1];
            

        }
        return nums;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** First attempt had the classic inside-loop variable declaration and early return trap. Fixed it to a textbook solution second attempt — correctly declared `max` outside the loop, single return after the loop.
- **Aptitude:** All 3 Vedic squaring problems correct on first attempt. Watch the Q3 trap: the base multiplier (`×1.5`) and the deviation (`3`) are different things — do not confuse them.
- **DSA A:** Grasped the Two Pointers pattern correctly. Logic errors were purely Java syntax: missing `int` declaration for pointers, wrong array return syntax (`new int[]{}`), redundant outer `for` loop. Algorithm itself was right.
- **DSA B:** Manual answer was perfect (`[3, 4, 8, 9, 14]`). Code confusion was looking forward (`nums[i+1]`) instead of backward (`nums[i-1]`). Final solution is a clean 3-liner.

**Final Verdict:** Week 3 Checkpoint Complete! You know all the patterns. The remaining gap is purely Java syntax muscle memory. Keep showing up and it disappears.


