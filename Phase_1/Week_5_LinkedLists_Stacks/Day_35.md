# Day 35: LinkedList (Reverse a Linked List)
**Date:** 2026-09-19
**Start Time:** *8:19 PM*
**End Time:** *8:52 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** Linked List Traversal Refresher.
Given the `head` of a linked list, write a method `public void printAll(ListNode head)` that uses a `while` loop to print the value of every single node in the list.
*(Hint: Create a `current` pointer. Inside the loop, use `System.out.println(current.val);`, and don't forget to move the pointer forward!)*

**Your Code:**
```java
class Solution {
    public void printAll(ListNode head) {
        ListNode current = head;
        while(current!= null)
        {
            System.out.println(current.val);
            current++; //current = current.next;
        }
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]

**Problem 1 (Relative Speed - Trains):**
Train A (100 meters long) is moving at 40 km/hr. Train B (150 meters long) is moving in the **opposite** direction at 50 km/hr. How many seconds will it take for them to completely pass each other?
*(Hint: Section 4 in your Formulas. Add their lengths for total distance. Add their speeds because they are moving opposite. Convert km/hr to m/s by multiplying by `5/18`. Then Time = Distance / Speed).*

**Your Working:**
```text
so Time = L1+L2/S1+/-S2
but since opposite direction its S1+S2=40+50=90*5/18=25m/s
so t = 250/25 = 10sec
```

---

## 3. DSA: LinkedLists [00:40 - 01:25]

### Problem: Reverse a Linked List (LeetCode 206)
Given the `head` of a singly linked list, reverse the list, and return the reversed list.

**The Concept (The 3-Pointer Trick):**
Because nodes only know about the node in front of them (`.next`), we cannot go backwards. To reverse the list, we have to walk forward and flip the `.next` pointers to point backwards as we go. 

If we just do `current.next = prev`, we instantly lose the rest of the list! To prevent this, we need 3 pointers:
1. `prev` (to point backwards to)
2. `current` (the node we are currently flipping)
3. `nextNode` (a temporary save state for the rest of the list)

### Visualization
**Start:**
```text
null       [1]  ->  [2]  ->  [3]
 ^          ^
prev     current
```

**Step 1:** Save the rest of the list! (`ListNode nextNode = current.next;`)
```text
null       [1]  ->  [2]  ->  [3]
 ^          ^        ^
prev     current   nextNode
```

**Step 2:** Flip the pointer! (`current.next = prev;`)
```text
null   <-  [1]      [2]  ->  [3]
 ^          ^        ^
prev     current   nextNode
```

**Step 3 & 4:** Shift `prev` and `current` forward for the next loop.
```text
null   <-  [1]      [2]  ->  [3]
            ^        ^
          prev    current
```

### The Code Implementation
You are basically doing yesterday's `while` loop, but with the 3-pointer trick inside it!

1. Initialize `ListNode prev = null;` (the new tail will point to null).
2. Initialize `ListNode current = head;` (we start at the head).
3. Create a `while` loop that runs as long as `current != null`.
4. **Inside the loop:** 
   - `ListNode nextNode = current.next;` (Save the rest of the list)
   - `current.next = prev;` (Flip the arrow backwards)
   - `prev = current;` (Move prev forward)
   - `current = nextNode;` (Move current forward)
5. After the loop finishes, `prev` will be standing on the new head. `return prev;`

**Your Code:**
```java
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode current = head;
        while(current!=null)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** You made a massive mistake here: `current++`. You can increment an `int` index for an array, but `current` is a Node object in memory. You cannot numerically increment a memory pointer in Java. To move to the next node, you MUST write `current = current.next;`. This proves your point—you are typing on autopilot instead of thinking about the data structure.
- **Aptitude:** 10 seconds. Perfect execution of relative speed and m/s conversion.
- **DSA:** The code is 100% syntactically correct, but as you pointed out, you just blindly copied the 4 steps I gave you. You haven't truly learned it yet.

**Final Verdict:** Your frustration is completely justified. The training wheels need to come off immediately.

