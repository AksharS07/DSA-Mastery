# Day 22: Two Pointers (Merge Sorted Arrays)
**Date:** 2026-09-02
**Start Time:*11:25 PM* 
**End Time:** 

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** 
1. Initialize an `ArrayList` of Integers.
2. Add the numbers 10, 20, and 30.
3. Check if the list contains the number 20 without looping.
4. Remove the number at index 0.
5. Print the size of the list.

**Your Code:**
```java

import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        boolean target = numbers.contains(20);
        if(target){
            System.out.println("Number 20 exists");
        }
        numbers.remove(0);
        System.out.println("Arraylist Size: "+numbers.size());
    }
}


```

---

## 2. Aptitude Block [00:10 - 00:40]
**Task:** 
Akshar takes 4 hours to complete a journey at 45 km/hr. If he needs to complete the same journey in 3 hours, at what speed should he travel? (Solve without a calculator).

**Your Solution & Working:**
```text
 So we have 4 hrs at 45km/hr
  to reach in 3hrs our speed should be?
  so find the distance...of the destination so speed is distance by time...
  so 45 = d/4*60*60
  45 = d/14400
  d=648000m or 648KM
  so plug that back in the formula
  s = 648000/3*60*60
  s = 648000/10800
  s = 6480/108
  (divide by 2)
  s = 3240/54
  after trying multiple times 54*8,54*2 etc i found 54*6=324 which implies 54*60=3240!
  so the speed needed is 60km/hr to reach the destination in 3hr
```

---

## 3. DSA Patterns [00:40 - 01:25]
**Problem:** 
You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.
Merge `nums1` and `nums2` into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

Use the Two Pointers approach. (Hint: Try starting from the end of both arrays!)

Example:
Input: `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3`
Output: `[1,2,2,3,5,6]`

**Your Code:**
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[p]= nums1[p1];
                p1--;
                p--;
            }
            else{  
               nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }
            while(p2>=0){
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
    
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** 
- **Aptitude:** 
- **DSA:** 
- **SRS:** Flawless logic and syntax! Perfect execution of `.contains()`, `.remove(index)`, and correctly using `.size()` instead of `.length` for an ArrayList.
- **Aptitude:** You got the final answer correctly (60 km/hr) but fell into a massive trap by converting time to seconds. Added to `Quants_Formulas.md` as "Trap: Unnecessary Unit Conversions". Distance = Speed x Time (180 km = 45 x 4). Keep the units aligned!
- **DSA:** Phenomenal job wrestling with the Two Pointers (Merge Sorted Arrays) pattern. You correctly identified starting from the back to utilize the zeros. Struggled slightly with assignment direction (`nums1[p] = nums1[p1]`) and scope bounds, but you persevered and wrote an optimal O(m+n) solution!

**Final Verdict:** 
**Final Verdict:** Day 22 complete! You tackled one of the most notoriously confusing pointer problems and fought through the logic perfectly. Take a well-deserved break!
