# Day 20: Two Pointers (Target Sum - Sorted)
**Date:** 2026-08-31
**Start Time:** 14:17
**End Time:** 14:47

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** 
1. Initialize a `HashMap` mapping String to Integer.
2. Add the key "Target" with value 100.
3. Check if "Target" exists without using a loop.
4. If it exists, retrieve the value.

**Your Code:**
```java

import java.util.*;
class Main{
    public static void main(String[] args){
        HashMap<String, Integer> values = new HashMap<>();
        values.put("Target",100);
        boolean result = values.containsKey("Target");
        if(result){
            System.out.println(values.get("Target"));
        }
    }
}

```

---

## 2. Aptitude Block [00:10 - 00:40]
**Task:** A person travels from City A to City B at a speed of 40 km/hr and arrives 10 minutes late. If they travel at 50 km/hr, they arrive 5 minutes early. What is the distance between City A and City B? (Solve without a calculator).

**Your Solution & Working:**
```text
 40 * 50 = 2000
 50-40 = 10 
 2000/10=200
 Time difference 15 mins?
 15/60 = 0.25hr
 0.25*200 = 50KM is the distance between city a and b?

```

---

## 3. DSA Patterns [00:40 - 01:25]
**Problem:** Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific `target` number. Return the indices of the two numbers.

**Your Code:**
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            
            int sum = numbers[left]+ numbers[right];

            if(sum==target)
            {
                return new int[]{left + 1,right + 1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1, -1}; // Fallback return
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** Solid. You only tripped on `values.get(0)` vs `values.get("Target")`. HashMaps use keys, not indices. Added to Cheat Sheet.
- **Aptitude:** You successfully added the early/late time gap and converted to hours. No formula errors. The only mistake was a basic arithmetic slip (1/4 of 200).
- **DSA:** You perfectly remembered the core O(n) Two Pointers logic. The algorithm itself was flawless. You only struggled with Java syntax strictness (parameter names, `.length` vs `.length()`, and array return syntax). 

**Final Verdict:** Your algorithmic thinking is Tier-1. You just need to keep grinding the syntax until it's second nature. Day 20 complete.
