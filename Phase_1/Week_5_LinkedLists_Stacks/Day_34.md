# Day 34: LinkedList (Reverse a Linked List)
**Date:** 2026-09-18
**Start Time:** *11:27 PM*
**End Time:** *11:42 PM*

---

## 1. SRS Warm-Up: What is a ListNode? [00:00 - 00:15]
You are completely right. In Phase 0, we used `java.util.LinkedList`. We just called `.add()` and `.remove()`. 
In LeetCode, **you are not allowed to use that.** You have to build the linked list from scratch using raw memory nodes.

A **Node** is just an object that holds two things: 
1. A value (like an `int`).
2. A pointer (reference) to the `next` Node.

It looks like this in code:
```java
public class ListNode {
    int val;           // The data
    ListNode next;     // The pointer to the next node
    
    ListNode(int val) { this.val = val; } // Constructor
}
```

**Task:** 
Write a method `public ListNode createTwoNodes()` that manually creates two nodes.
1. Create a node with value `1`: `ListNode head = new ListNode(1);`
2. Create a second node with value `2`: `ListNode second = new ListNode(2);`
3. Link them together by pointing the head's `next` to the second node: `head.next = second;`
4. Return `head`.

**Your Code:**
```java
class Solution {
    public ListNode createTwoNodes() {
        int val;
        ListNode next;
        ListNode(int val) { this.val =val;}
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        return head;
    }
}
```

---

## 2. Aptitude Block [00:10 - 00:40]

**Problem 1 (Percentages - The 100% Rule):**
Akshar sells an item for ₹1,440 and makes a 20% profit. What was the original cost price of the item?
*(Hint: Cost Price is ALWAYS 100%. If you made a 20% profit, your selling price is 120%. So 120% = 1440. Find 100% by breaking it down to 10% first).*

**Your Working:**
```text
if 120%=1440
100%=? 
so 1440/120=12
12*100=1200
so the profit is 240
```

---

## 3. DSA: LinkedLists [00:40 - 01:25]

### Problem: Linked List Traversal (Find the Length)
Before we can reverse a linked list or do any complex tricks, you need to know how to simply "walk" through one.
Unlike Arrays, you cannot do a `for (int i = 0; i < nums.length; i++)` because a Linked List has no indexes and no `.length` property. 

To walk through a Linked List, we use a single pointer and a `while` loop.

**The Concept (The Traversal Loop):**
We start a pointer at the `head`. As long as the pointer is not `null` (meaning we haven't fallen off the end of the list), we move the pointer to the next node by doing `current = current.next`.

**Visualization:**
```text
[1]  ->  [2]  ->  [3]  ->  null
 ^
current (moves right one step every loop)
```

**Task:**
Given the `head` of a singly linked list, write a method that counts how many nodes are in the list and returns that integer.

**Steps to code:**
1. Create an integer `int count = 0;`.
2. Create a pointer to start at the head: `ListNode current = head;`
3. Create a `while` loop that runs as long as `current != null`.
4. Inside the loop:
   - Add 1 to your `count`.
   - Move the pointer forward: `current = current.next;`
5. Return the `count` at the end.

**Your Code:**
```java
class Solution {
    public int getLength(ListNode head) {
        int count=0;
        ListNode current = head;
        while(current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }
}
```

---

## AI Feedback & Corrections
- **SRS:** You wrote the actual logic perfectly (`ListNode head = new ListNode(1); head.next = second; return head;`). However, you accidentally copy-pasted the *definition* of the `ListNode` class inside your method! In Java, classes are defined outside of other methods. You don't need to define `val` and `next` inside your method, you just *use* the `ListNode` class.
- **Aptitude:** 1440/120 = 12. 12 * 100 = 1200. Original price = 1200. Flawless logic. 
- **DSA:** Flawless! You successfully wrote your very first Linked List traversal loop. You initialized the `current` pointer to the head, and correctly moved it forward using `current = current.next` until it fell off the end (`null`). 

**Final Verdict:** You now know how to traverse raw memory nodes! We will tackle Reversal tomorrow.

