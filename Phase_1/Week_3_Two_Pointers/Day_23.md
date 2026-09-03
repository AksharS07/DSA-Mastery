# Day 23: Array Manipulation (Prefix Sum basics)
**Date:** 2026-09-03
**Start Time:** *11:16 PM*
**End Time:** *11:40 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** 
1. Initialize a `HashMap` mapping Integer to Integer called `frequencyMap`.
2. Check if the map contains the key `5`. If it does not, add the key `5` with a value of `1`.
3. If it already contains the key `5`, update its value by adding `1` to the existing value.
*(Try to do this using a classic if-else block, and then try using `.getOrDefault()` if you remember it!).*

**Your Code:**
```java

import java.util.*;
class Main{
    public static void main(String[] args){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        boolean target = frequencyMap.containsKey(5);
        if(!target)
        {
            frequencyMap.put(5,1);
        }
        else
        {
             int count = frequencyMap.get(5);
            count= count+1;
            frequencyMap.put(5,count);
        }
    }
}


```

---

## 2. Aptitude Block [00:10 - 00:40]
**Task:** 
Akshar sells an item for ₹1,200, making a profit of 20%. What was the cost price of the item? (Solve without a calculator).

**Your Solution & Working:**
```text


```

---

## 3. DSA Patterns [00:40 - 01:25]
**Problem:** 
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the sum of all the elements of `nums` up to index `i` (inclusive). This is known as the **Prefix Sum** array.

You must solve it in `O(n)` time without using nested loops.

Example:
Input: `nums = [1, 2, 3, 4]`
Output: `[1, 3, 6, 10]`
*(Explanation: [1, 1+2, 1+2+3, 1+2+3+4])*

**Your Code:**
```java
class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
        {
            nums[i] = nums[i] + nums[i-1];
           
        }
         return nums;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Logic was perfect for handling missing elements, but struggled with `boolean` types and variable scoping (`frequencyMap` vs `frequency`).
- **Aptitude:** Fell for the classic 100% rule trap. Profit is always calculated on Cost Price, not Selling Price. Added rule to `Quants_Formulas.md`.
- **DSA:** Easily grasped the `O(n)` logic for Prefix Sum. Tripped up on `.size()` vs `.length` (the classic ArrayList vs Array mixup) and returning early inside a loop.

**Final Verdict:** Day 23 Complete! You crushed a speed run. 

