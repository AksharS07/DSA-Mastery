---
title: DSA Syntax Cheat Sheet & Notes
tags: [dsa, java, notes, cheatsheet]
---

# 📝 DSA Syntax Cheat Sheet & Notes
> Keep this open when you code. Update it *only* with things you actually forget. Don't copy-paste textbook definitions here!

---

##  My Common Mistakes 

## Day 1 

- **Missing Semicolons:** Always double-check line endings, especially on `System.out.println()`.
- **Reverse Loops:** When looping backward, start at `size() - 1` and run while `i >= 0`. (Don't use `i++` by habit!)
## Day 2

- Assignment error: It's not numbers = numbers.add(i);  remove that assignment while putting numbers...just numbers.add(i); 
- To remove the elements dynamically always run the loop backward...so that the array will adjust automatically without removing any unnecessary elements. And don't use Integer.valueOf() while removing... it passes an object, instead use just numbers.remove(i);
- When boolean is used java always returns lowercase true or false NOT 0 or 1.
- 

---

## ☕ Java Collections Syntax

### 1. ArrayList (Dynamic Array)
```java
import java.util.ArrayList;

// 1. Creation
ArrayList<Integer> nums = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();

// 2. Add / Update / Remove
nums.add(10);          // Adds to end
nums.set(0, 99);       // Changes element at index 0 to 99
nums.remove(0);        // Removes element at index 0

// 3. Search / Size
int size = nums.size();
boolean exists = nums.contains(10);

// 4. Iteration
for (int num : nums) {
    System.out.println(num);
}
```

### 2. HashMap (Coming Week 2)
*(Leave blank for now. Fill it in when you get there!)*

### 3. LinkedList, Queue, Stack (Coming Week 2)
*(Leave blank for now. Fill it in when you get there!)*

---

## 🧠 Algorithm Templates
*(You will fill this section in Phase 1 when you start Two-Pointers, Sliding Window, etc.)*

- 🍅 (pomodoro::WORK) (duration:: 25m) (begin:: 2026-07-31 12:08) - (end:: 2026-07-31 12:33)