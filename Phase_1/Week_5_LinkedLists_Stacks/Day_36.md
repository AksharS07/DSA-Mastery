# Day 36: LinkedList (Detect Cycle)
**Date:** 2026-09-20
**Start Time:** *12:35 PM*
**End Time:** 

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** HashMap Recall.
From memory (no looking it up), write a method that takes a `String[] words` array and returns the word that appears the most times. If there is a tie, return any of them.
*(You've done this pattern before. This is Day 8-10 material. HashMap, iterate, find max).*

**Your Code:**
```java
class Solution {
    public String mostFrequent(String[] words) {
        HashMap<String,Integer> list = new HashMap<>();
        
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]

**Problem 1 (Percentages & Ratios):**
In a college, the ratio of boys to girls is 3:2. If 20% of boys and 30% of girls are scholarship holders, what percentage of the total students do NOT hold a scholarship?
*(Hint: Assume total students is 100 to make the math easy. Find total boys, total girls, then find the non-scholarship numbers).*

**Your Working:**
```text

```

---

## 3. DSA: LinkedLists [00:40 - 01:25]

### Problem: Linked List Cycle (LeetCode 141)
Given `head`, the head of a linked list, determine if the linked list has a cycle in it.
A cycle occurs if there is some node in the list that can be reached again by continuously following the `next` pointer.
Return `true` if there is a cycle, otherwise `false`.

**The Concept (Fast & Slow Pointers / Floyd's Tortoise and Hare):**
If a linked list has a loop, and two runners are on the track, the faster runner will eventually lap the slower runner and they will collide.
If there is no loop, the faster runner will just hit the end of the track (`null`).

- You need two pointers: `slow` and `fast`. Both start at `head`.
- `slow` moves 1 step at a time.
- `fast` moves 2 steps at a time.
- If `fast` or `fast.next` ever hits `null`, there is no cycle (return false).
- If `slow == fast` at any point, they collided, so there is a cycle (return true).

### Visualization
**Start:**
```text
[1] -> [2] -> [3] -> [4]
        ^             |
        |-------------|
 ^
slow, fast
```

**Step 1:** (slow moves 1, fast moves 2)
```text
[1] -> [2] -> [3] -> [4]
        ^             |
        |-------------|
        ^      ^
       slow   fast
```

**Step 2:** (slow moves 1, fast moves 2 - fast loops back around!)
```text
[1] -> [2] -> [3] -> [4]
        ^             |
        |-------------|
        ^             ^
       fast          slow
```

**Step 3:** (slow moves 1, fast moves 2)
```text
[1] -> [2] -> [3] -> [4]
        ^             |
        |-------------|
               ^
          slow, fast (COLLISION! Return true)
```

**Your Code:**
*(Translate the visual logic into a `while` loop. Think carefully about what the `while` loop condition should check to prevent NullPointerExceptions when `fast` moves twice).*

```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** 
- **Aptitude:** 
- **DSA:** 

**Final Verdict:** 

