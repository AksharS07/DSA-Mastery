# Day 24: Array Manipulation (Majority Element)
**Date:** 2026-09-05
**Start Time:** *2:17 PM*
**End Time:** *9:11 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** 
1. Create a `HashMap<Integer, Integer>` called `counts`.
2. Given an array `int[] arr = {2, 2, 1, 1, 1, 2, 2};`, write a `for` loop to iterate through it.
3. Inside the loop, count the frequency of each number using the map. (Hint: use `.getOrDefault()` if you remember it, or use the `if/else` logic you mastered on Day 23).

**Your Code:**
```java
import java.util.*;
class Main{
    public static void main(String args[]){
        HashMap<Integer, Integer> counts = new HashMap<>();
        int frequency;
        int[] arr = {2,2,1,1,1,2,2};
        for(int i=0; i<=arr.length-1;i++){
            int num = arr[i];


if (!counts.containsKey(num)) {
    counts.put(num,1);
    
} 

else {
    int currentcount =  counts.get(num);
    
    currentcount++;
    
    counts.put(num,currentcount);
    
}
        }
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]
**Task:** 
Akshar buys a gadget and sells it at a loss of 15% for ₹850. What was the original cost price of the gadget? (Solve using the 100% Rule in your head!).

**Your Solution & Working:**
```text
 So, 
 Cost Price = Selling Price - loss (or + profit)
 given is the Selling price or sold price so 
 i am just gonna wing it say its Cost price was 1000 
 since 85% is 850 so 100% is 1000?`




```

---

## 3. DSA Patterns [00:40 - 01:25]
**Problem:** 
Given an array `nums` of size `n`, return the majority element.
The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

Example:
Input: `nums = [2,2,1,1,1,2,2]`
Output: `2`

*Bonus Challenge: Can you solve this in `O(n)` time and `O(1)` space? (If not, just use a HashMap like in the SRS warm-up!)*

**Your Code:**
```java
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i=0;i<nums.length;i++){
         int num = nums[i];
        
            if(!numbers.containsKey(num))
            {
                numbers.put(num,1);
            }
            else
            {
                
                int currentmajor = numbers.get(num);
                currentmajor++;
                numbers.put(num,currentmajor);
                if(currentmajor>nums.length/2){
                    return num;
                }
        }
        }
        return nums[0];
    }
}

```

---

## AI Feedback & Corrections
- **SRS:** Really struggled with array syntax (`arr.len` vs `length`, treating variables as arrays) but perfectly nailed the core `if/else` HashMap counting logic after a reset.
- **Aptitude:** Forgot the 100% rule initially and tried to calculate profit/loss off the Selling Price. Remember: **Cost Price is ALWAYS 100%**. Successfully used the unitary method once reminded.
- **DSA:** Successfully implemented the `O(n)` time, `O(n)` space HashMap approach! Battled heavily with Java scoping rules (`{}` placement) and variable initialization order inside the `if/else` blocks, but wrote a functionally perfect algorithm by the end. 

**Final Verdict:** Day 24 Complete! This was a gritty, syntax-heavy day, but you didn't give up. The logic is clearly there, the fingers just need to keep typing to build that Java muscle memory!

