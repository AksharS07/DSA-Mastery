---
title: DSA Mastery — Phase 0 Progress Tracker
student: Akshar Srijan
college: MITE Mangalore
goal: 4–7 LPA Tier-2/3 Placement
phase: Phase 0
start_date: 2026-07-30
end_date: 2026-08-20
status: in-progress
tags:
  - dsa
  - java
  - placement-prep
  - phase-0
  - hackerrank
---

# 📚 DSA Mastery — Phase 0 Progress Tracker
**Student:** Akshar Srijan | MITE, Mangalore | CSE (IoT & Cybersecurity)
**Goal:** 4–7 LPA Tier-2/3 Placement | Java + DSA

---

## ⏱️ Key Dates
| Milestone | Date |
|---|---|
| Phase 0 Start | **Jul 30, 2026 (Today)** |
| Week 1 Checkpoint | Aug 6 |
| Week 2 Checkpoint | Aug 13 |
| **Phase 0 Final** | **Aug 20** |
| Phase 1 Start | Aug 23 |
| **5th Semester Starts** | **Sep 1** ← Hard deadline! |

> [!important]
> You have **32 days** before Sem 5 starts. Phase 0 ends Aug 20. That gives you 11 days for Phase 1 before classes begin. Use that time!

---

## ✔️ HackerRank: Already Completed (138 pts)

> [!success] Done — never revisit these. Move forward.

| # | Problem | Category | Relevance to Phase 0 |
|---|---------|----------|----------------------|
| 1 | Welcome to Java! | Intro | ✅ Done, skip |
| 2 | Java Stdin and Stdout I | Intro | ✅ Done, skip |
| 3 | Java If-Else | Intro | ✅ Done, skip |
| 4 | Java Stdin and Stdout II | Intro | ✅ Done, skip |
| 5 | Java Output Formatting | Intro | ✅ Done, skip |
| 6 | Java Loops I | Intro | ✅ Done, skip |
| 7 | Java Loops II | Intro | ✅ Done, skip |
| 8 | Java Datatypes | Intro | ✅ Done, skip |
| 9 | Java End-of-file | Intro | ✅ Done, skip |
| 10 | Java Static Initializer Block | Intro | ✅ Done, skip |
| 11 | Java Int to String | Intro | ✅ Done, skip |
| 12 | Java Date and Time | Intro | ✅ Done, skip |
| 13 | Java Currency Formatter | Intro | ✅ Done, skip |
| 14 | Java Strings Introduction | Strings | ✅ Done, skip |
| 15 | Java Substring | Strings | ✅ Done, skip |

> [!note]
> **Good news:** None of your Phase 0 target problems (Java Arraylist, Java Map, Java Stack, etc.) are in this list. They are all still unsolved — which means the plan is exactly right.

---

## 🎯 HackerRank: Phase 0 Targets (All Unsolved)
These are the **only** HR problems you should attempt during Phase 0, in this order:

| Week | Problem | Link | Status |
|------|---------|------|--------|
| Wk 1 | Java 1D Array | [link](https://www.hackerrank.com/challenges/java-1d-array-introduction/problem) | ⬜ |
| Wk 1 | Java Arraylist | [link](https://www.hackerrank.com/challenges/java-arraylist/problem) | ⬜ |
| Wk 1 | Java List | [link](https://www.hackerrank.com/challenges/java-list/problem) | ⬜ |
| Wk 1 | Java 2D Array | [link](https://www.hackerrank.com/challenges/java-2d-array/problem) | ⬜ |
| Wk 1 | Java Subarray | [link](https://www.hackerrank.com/challenges/java-negative-subarray/problem) | ⬜ (stretch) |
| Wk 2 | Java Map | [link](https://www.hackerrank.com/challenges/phone-book/problem) | ⬜ |
| Wk 2 | Java Hashset | [link](https://www.hackerrank.com/challenges/java-hashset/problem) | ⬜ |
| Wk 2 | Java Stack | [link](https://www.hackerrank.com/challenges/java-stack/problem) | ⬜ |
| Wk 2 | Java Sort | [link](https://www.hackerrank.com/challenges/java-sort/problem) | ⬜ |
| Wk 2 | Java Priority Queue | [link](https://www.hackerrank.com/challenges/java-priority-queue/problem) | ⬜ (stretch) |
| Wk 3 | Java String Reverse | [link](https://www.hackerrank.com/challenges/java-string-reverse/problem) | ⬜ |
| Wk 3 | Java Anagrams | [link](https://www.hackerrank.com/challenges/java-anagrams/problem) | ⬜ |
| Wk 3 | Java String Tokens | [link](https://www.hackerrank.com/challenges/java-string-tokens/problem) | ⬜ |

> [!tip]
> Change ⬜ to ✅ in the table above as you complete each problem.

---

## 🗂️ How to Use This File
- Change `[ ]` to `[x]` when you complete a task
- Add your daily notes under each day
- Save daily `.java` files in `Phase_0/` folder

---

## ✅ WEEK 1: ARRAYLIST MASTERY (Jul 30 – Aug 6)

### Day 1 — Wed, Jul 30 ✅ DONE
- [x] Did ArrayList basics + for-each loop with Gem
- [x] Did reverse loop challenge (with Gem's correction)
- [x] Understood `size()-1` vs `size()` and `i >= 0`
- **Recode** `Day1_ReverseAnimeList.java` from scratch (close it, open new file, type from memory)

**HackerRank today:** Skip (you did enough for Day 1)

**Notes:**
- Forgot semicolon at end of `System.out.println(num)` — remember this!
- `anime.size()` returns 5, but last index is **4** (`size() - 1`)

---

### Day 2 — Thu, Jul 31
**Topics:** `.remove()`, `.set()`, `.contains()`, `removeIf()`

**📋 Gem Prompt to paste:**
```
Day 2, Phase 0. Today's topic: ArrayList remove & search operations.
Teach me:
1. How to remove an element by index (.remove(int index))
2. How to remove an element by value (.remove(Object o))
3. How to check if an element exists (.contains())
4. How to update an element (.set())
Then give me these 2 challenges:
Challenge 1: Create an ArrayList of integers [1,2,3,4,5,6,7,8], remove all even numbers, print what remains.
Challenge 2: Create an ArrayList of 5 strings. Remove the 3rd element. Check if "Java" exists. Print the final list.
Review my code and explain any mistakes.
```

**✅ Checklist:**
- Submit Challenge 1 to Gem + get feedback
- Submit Challenge 2 to Gem + get feedback
- Recode Day 1 reverse loop from scratch (no notes!) → save as `Day2_Recode_ReverseLoop.java`
- Save as `Day2_RemoveEvens.java` and `Day2_RemoveByIndex.java`

**🎯 HackerRank:** [Java 1D Array (Easy)](https://www.hackerrank.com/challenges/java-1d-array-introduction/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 3 — Fri, Aug 1
**Topics:** `contains()`, conditional adding, mixed operations

**📋 Gem Prompt to paste:**
```
Day 3, Phase 0. ArrayList mixed operations practice.
Challenge 1: Create an ArrayList of integers. Add 10,20,30,40,50.
- Check if 30 exists — if yes, remove it. Print the result.
- Add 60 only if the list size is less than 5. Print the result.
Challenge 2: Create an ArrayList of 5 students' names.
- Remove the student at index 2.
- Add a new student at index 1.
- Print the final list with index numbers.
Review my code carefully — check for index boundary errors and semicolons.
```

**✅ Checklist:**
- Submit Challenge 1 to Gem + get feedback
- Submit Challenge 2 to Gem + get feedback
- Recode Day 2 challenges from scratch → save as `Day3_Recode_RemoveEvens.java`
- Save today's work as `Day3_ConditionalOps.java`

**🎯 HackerRank:** [Java Arraylist (Easy)](https://www.hackerrank.com/challenges/java-arraylist/problem) ← **Main Week 1 target**

**Notes:**
_Write what you struggled with here_

---

### Day 4 — Sat, Aug 2
**Topics:** Mini-project combining all Week 1 ops

**📋 Gem Prompt to paste:**
```
Day 4, Phase 0. Mini-project day.
Build a simple Shopping Cart using ArrayList:
- Create an ArrayList<String> for cart items
- Add 5 items (e.g., "Apple", "Bread", "Milk", "Eggs", "Butter")
- Remove "Milk" by name (not by index)
- Check if "Eggs" is still in the cart
- Print total number of items
- Print all items with their index numbers
I'll write the code myself. Review it and point out mistakes without giving me the answer first.
```

**✅ Checklist:**
- Complete the shopping cart project
- Submit to Gem + get feedback
- Recode Day 2 AND Day 3 challenges from scratch (no notes!)
- Save as `Day4_ShoppingCart.java`

**🎯 HackerRank:** [Java List (Easy)](https://www.hackerrank.com/challenges/java-list/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 5 — Sun, Aug 3
**Topics:** Speed drill + explanation practice

**📋 Gem Prompt to paste:**
```
Day 5, Phase 0. Speed drill day.
Give me these 5 challenges back-to-back. I'll do them all without stopping:
1. Create ArrayList of integers, add 10,20,30,40,50, print with for-each
2. Create ArrayList of strings, print in reverse order
3. Create ArrayList of integers [1,2,3,4,5,6], remove all even numbers, print remaining
4. Create ArrayList of 5 names, remove name at index 2, check if "Alice" exists, print result
5. Create ArrayList, add 5 items, sort using Collections.sort(), print
After I send all 5, give me feedback on each one. Then ask me: "Why would you use ArrayList instead of a regular array? Explain in 2 sentences."
```

**✅ Checklist:**
- Complete all 5 speed challenges in one sitting
- Answer the "why ArrayList?" explanation question to Gem
- Save as `Day5_SpeedDrill.java`

**🎯 HackerRank:** [Java 2D Array (Easy)](https://www.hackerrank.com/challenges/java-2d-array/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 6 — Mon, Aug 4
**Topics:** Final review + HackerRank focus

**📋 Gem Prompt to paste:**
```
Day 6, Phase 0. Final prep before Week 1 checkpoint.
Ask me 3 things I'm still unsure about in ArrayList. Then give me 2 random problems I haven't seen before — don't tell me what operations to use, just give me the problem statement. I need to figure out the approach myself.
After I solve them, tell me honestly: Am I ready for the Week 1 checkpoint?
```

**✅ Checklist:**
- List 3 things you're still unsure about (send to Gem)
- Solve the 2 surprise problems Gem gives you
- Attempt [Java Subarray (Easy)](https://www.hackerrank.com/challenges/java-negative-subarray/problem) _(stretch goal)_

**🎯 HackerRank (main):** Try [Java 2D Array](https://www.hackerrank.com/challenges/java-2d-array/problem) if not done from Day 5

**Notes:**
_Write what you struggled with here_

---

### Day 7 — Tue, Aug 5
**Topics:** Checkpoint preparation

**📋 Gem Prompt to paste:**
```
Day 7, Phase 0. I'm preparing for tomorrow's Week 1 checkpoint.
Quiz me on ArrayList:
1. Give me 3 theory questions (I answer in words)
2. Give me 1 tracing question (I trace what the code outputs step by step)
3. Give me 1 coding question (I write Java from scratch)
Tell me if I'm ready for the checkpoint after reviewing my answers.
```

**✅ Checklist:**
- Complete the Gem's quiz
- Note down anything still weak before tomorrow
- Make sure at least 3 HackerRank problems from Week 1 are solved

**🎯 HackerRank:** Finish any pending Week 1 problems

**Notes:**
_Write what you struggled with here_

---

### ⚠️ WEEK 1 CHECKPOINT — Wed, Aug 6

**📋 Gem Prompt to paste:**
```
Week 1 Checkpoint. Ready for my test.
Give me 2 unseen ArrayList problems. I have 30 minutes total.
Don't give hints. Just review my final code.
After both: tell me if I pass or fail Week 1, and what specifically I need to fix if I fail.
```

**✅ Checklist:**
- Complete 2 unseen ArrayList problems in **30 minutes**
- Explain your approach to Gem
- **Pass (both correct)** → Move to Week 2
- **Fail** → Identify weak spot, repeat those specific challenges, retest

#### Week 1 Milestone Checklist
- Can code ArrayList from scratch without notes
- Understand indexing (`size()-1`, bounds, `get(i)`)
- Can explain WHY ArrayList over Array in 2 sentences
- Solved at least 3 of: Java 1D Array, Java Arraylist, Java List on HackerRank

---

## ✅ WEEK 2: HASHMAP + LINKEDLIST (Aug 7 – Aug 13)

### Day 8 — Thu, Aug 7
**Topics:** HashMap basics — `put()`, `get()`, `containsKey()`, `size()`

**📋 Gem Prompt to paste:**
```
Day 8, Phase 0. Starting HashMap today.
Teach me:
1. What is a HashMap? How is it different from ArrayList?
2. How to create HashMap<String, Integer>
3. How to: put(), get(), containsKey(), size()
Then give me this challenge:
Create a HashMap<String, Integer> mapping 3 people's names to their ages.
- Add: "Akshar"→21, "Rohan"→20, "Priya"→22
- Print all entries
- Check if "Rohan" exists
- Get Priya's age and print it
I'll write the code. Review it carefully.
```

**✅ Checklist:**
- Submit HashMap challenge to Gem + get feedback
- Recode any 2 ArrayList challenges from Week 1 (stay sharp!)
- Save as `Day8_HashMapBasics.java`

**🎯 HackerRank:** [Java Map (Easy)](https://www.hackerrank.com/challenges/phone-book/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 9 — Fri, Aug 8
**Topics:** HashMap iteration — `entrySet()`, `keySet()`, `values()`

**📋 Gem Prompt to paste:**
```
Day 9, Phase 0. HashMap iteration today.
Teach me the 3 ways to iterate a HashMap:
1. entrySet() — gives key+value pairs
2. keySet() — gives only keys
3. values() — gives only values
Then give me these 2 challenges:
Challenge 1: Create HashMap<String, Integer> with 4 students and their scores.
Iterate using entrySet() and print: "StudentName: Score"
Challenge 2: Same HashMap — find and print only students who scored above 75.
Review my code. Point out any iteration mistakes.
```

**✅ Checklist:**
- Submit Challenge 1 + 2 to Gem
- Recode Day 8 HashMap basics from scratch → `Day9_Recode_HashMapBasics.java`
- Save as `Day9_HashMapIteration.java`

**🎯 HackerRank:** [Java Hashset (Easy)](https://www.hackerrank.com/challenges/java-hashset/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 10 — Sat, Aug 9
**Topics:** HashMap advanced — `remove()`, `HashMap<String, List<Integer>>`

**📋 Gem Prompt to paste:**
```
Day 10, Phase 0. Advanced HashMap practice.
Challenge 1: Create HashMap<String, Integer> with 4 entries.
Remove one entry. Print what remains.
Challenge 2 (harder): Create HashMap<String, ArrayList<Integer>>
Add 3 students, each with a list of 3 exam scores.
Calculate and print each student's average score.
This one is tough — give me a pseudocode hint first before I code it.
```

**✅ Checklist:**
- Submit Challenge 1 + 2 to Gem
- Recode Day 9 iteration challenges from scratch
- Save as `Day10_HashMapAdvanced.java`

**🎯 HackerRank:** [Java Stack (Medium)](https://www.hackerrank.com/challenges/java-stack/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 11 — Sun, Aug 10
**Topics:** HashMap speed drill + "when to use what" explanation

**📋 Gem Prompt to paste:**
```
Day 11, Phase 0. HashMap speed drill.
Give me 3 HashMap challenges back-to-back. I'll do them without stopping.
After all 3, ask me: "When would you use HashMap vs ArrayList? Give me a real example of each."
Then tell me: am I ready for LinkedList or do I need more HashMap practice?
```

**✅ Checklist:**
- Complete all 3 speed challenges
- Answer the "HashMap vs ArrayList" question
- Save as `Day11_HashMapSpeedDrill.java`

**🎯 HackerRank:** [Java Sort (Easy)](https://www.hackerrank.com/challenges/java-sort/problem)

**Notes:**
_Write what you struggled with here_

---

### Day 12 — Mon, Aug 11
**Topics:** LinkedList basics — difference from ArrayList, `add()`, `remove()`, `get()`, `iterator`

**📋 Gem Prompt to paste:**
```
Day 12, Phase 0. Starting LinkedList today.
First, explain to me: How is LinkedList different from ArrayList in terms of memory? When should I use one over the other?
Then teach me: add(), remove(index), get(index), and how to traverse with an iterator.
Challenge: Create a LinkedList<String>.
Add: "Alpha", "Beta", "Gamma"
Remove the 2nd element (index 1)
Print all remaining elements using an iterator (not for-each)
I'll write the code. Review it.
```

**✅ Checklist:**
- Submit LinkedList challenge to Gem
- Recode any 2 HashMap challenges from memory (keep them fresh!)
- Save as `Day12_LinkedListBasics.java`

**🎯 HackerRank:** No new problem today — focus fully on LinkedList concept

**Notes:**
_Write what you struggled with here_

---

### Day 13 — Tue, Aug 12
**Topics:** Queue (FIFO) and Stack (LIFO) using LinkedList

**📋 Gem Prompt to paste:**
```
Day 13, Phase 0. Queue and Stack using LinkedList.
Teach me:
1. What is a Queue (FIFO)? How to implement using LinkedList (offer(), poll(), peek())
2. What is a Stack (LIFO)? How to implement using Deque/LinkedList (push(), pop(), peek())
Then give me 2 challenges:
Challenge 1 (Queue): Create a Queue<String>. Add "First", "Second", "Third". Remove them in FIFO order. Print each as it's removed.
Challenge 2 (Stack): Create a Stack<Integer>. Push 10, 20, 30. Pop them in LIFO order. Print each as it's popped.
After I code both: ask me "What real-world scenario uses a Queue? What uses a Stack?"
```

**✅ Checklist:**
- Submit Queue + Stack challenges to Gem
- Recode Day 12 LinkedList challenge from scratch
- Answer the real-world scenario question
- Save as `Day13_QueueAndStack.java`

**🎯 HackerRank:** [Java Priority Queue (Medium)](https://www.hackerrank.com/challenges/java-priority-queue/problem) _(stretch goal)_

**Notes:**
_Write what you struggled with here_

---

### ⚠️ WEEK 2 CHECKPOINT — Wed, Aug 13

**📋 Gem Prompt to paste:**
```
Week 2 Checkpoint. Ready for my test.
Give me 2 unseen problems — 1 HashMap problem + 1 LinkedList/Queue/Stack problem.
I have 45 minutes total. No hints.
After both: pass or fail? What specifically do I need to fix?
```

**✅ Checklist:**
- Complete problems in **45 minutes**
- **Pass** → Move to Week 3
- **Fail** → Repeat weak area, retest

#### Week 2 Milestone Checklist
- Can code HashMap from scratch without notes
- Understand all 3 iteration methods (`entrySet`, `keySet`, `values`)
- Can code LinkedList, Queue, Stack from scratch
- Solved Java Map + Hashset + Stack on HackerRank

---

## ✅ WEEK 3: CONSOLIDATION & INTERVIEW PREP (Aug 14 – Aug 20)

### Day 15 — Thu, Aug 14
**Topics:** `Collections.sort()`, review

**📋 Gem Prompt to paste:**
```
Day 15, Phase 0. Collections.sort() + review day.
Teach me: How to sort an ArrayList using Collections.sort(). How to sort in reverse order.
Challenge 1: Create ArrayList<Integer> with [5,2,8,1,9,3]. Sort ascending. Print.
Challenge 2: Create ArrayList<String> with 5 names. Sort alphabetically. Print.
Then: give me 2 random review problems from Week 1 or 2. I need to stay sharp.
```

**✅ Checklist:**
- Complete sorting challenges
- Solve 2 Week 1-2 review problems from Gem
- Save as `Day15_SortingReview.java`

**Notes:**
_Write what you struggled with here_

---

### Day 16 — Fri, Aug 15
**Topics:** Syntax bug fixing

**📋 Gem Prompt to paste:**
```
Day 16, Phase 0. Syntax debugging day.
Give me 5 Java code snippets — each one has at least 1 bug (semicolons, index errors, wrong variable names, missing imports, wrong method calls). I'll find and fix all bugs. Don't tell me where the bugs are — let me find them.
After I fix all 5, tell me which types of errors I'm still making most often.
```

**✅ Checklist:**
- Fix all 5 buggy code snippets from Gem
- Note your most common error type
- Save fixed versions as `Day16_BugFixes.java`

**Notes:**
_Write what you struggled with here_

---

### Day 17 — Sat, Aug 16
**Topics:** Mini-project combining everything

**📋 Gem Prompt to paste:**
```
Day 17, Phase 0. Capstone mini-project.
Build a Student Grade Tracker:
- Use HashMap<String, ArrayList<Integer>> to store student name → list of 3 exam scores
- Add 3 students with 3 scores each
- Calculate and print each student's average score
- Find and print the student with the highest average
- Find and print the student with the lowest average
I'll write the full code myself. Don't give me the solution — only give me pseudocode hints if I'm completely stuck.
```

**✅ Checklist:**
- Complete the full grade tracker project
- Submit to Gem for review
- Save as `Day17_GradeTracker.java`

**Notes:**
_Write what you struggled with here_

---

### Day 18 — Sun, Aug 17
**Topics:** Full speed challenge across all topics

**📋 Gem Prompt to paste:**
```
Day 18, Phase 0. Maximum speed drill.
I'm going to recode everything from memory in one sitting. Time me mentally.
Give me these back-to-back (no stops):
1. ArrayList: create, add 5 items, remove evens, print
2. HashMap: create with 3 entries, iterate with entrySet(), print all
3. LinkedList: create, add 3 items, remove 2nd, iterate with iterator
4. Queue: create, add 3 items, poll() all in FIFO order
5. Stack: create, push 3 items, pop() all in LIFO order
After all 5: tell me my weakest area.
```

**✅ Checklist:**
- All 5 challenges from memory, no notes
- Save as `Day18_FinalSpeedDrill.java`

**Notes:**
_Write what you struggled with here_

---

### Day 19 — Mon, Aug 18
**Topics:** Mock Interview 1

**📋 Gem Prompt to paste:**
```
Day 19, Phase 0. Mock Interview 1.
Simulate a real 30-minute technical interview. Give me 2 collection problems I haven't seen.
Rules:
- I must explain my approach BEFORE writing code
- I must talk through my logic as I code (I'll type it as a comment above each line)
- You time me (assume 30 minutes)
After I finish: grade me. Did I explain clearly? Did I code correctly? What would an interviewer think?
```

**✅ Checklist:**
- Complete mock interview
- Note exactly what went wrong
- Save as `Day19_MockInterview1.java`

**Notes:**
_Write what you struggled with here_

---

### Day 20 — Tue, Aug 19
**Topics:** Mock Interview 2 (harder)

**📋 Gem Prompt to paste:**
```
Day 20, Phase 0. Mock Interview 2 — harder problems.
Same format as yesterday but harder problems and only 25 minutes.
I must explain approach first, then code.
After: Am I ready for the Phase 0 final tomorrow? Honest answer only.
```

**✅ Checklist:**
- Complete mock interview 2
- Get Gem's honest readiness verdict
- Save as `Day20_MockInterview2.java`

**Notes:**
_Write what you struggled with here_

---

### 🏆 PHASE 0 FINAL CHECKPOINT — Wed, Aug 20

**📋 Gem Prompt to paste:**
```
Phase 0 Final Checkpoint.
Give me 3 unseen problems — 1 ArrayList, 1 HashMap, 1 LinkedList/Queue/Stack.
I have 60 minutes. No hints. No help.
After I submit all 3:
- Score me out of 3
- Tell me if I pass Phase 0 (need at least 2/3 correct)
- List exactly what to practice before Phase 1 if I failed anything
```

**✅ Checklist:**
- 3 unseen problems in **60 minutes**
- Must get 2/3 correct to pass
- **Pass** → 🎉 Move to Phase 1 on Aug 23
- **Fail** → Find weak area, targeted practice, retest Aug 22

---




---

## 📅 After Phase 0 (Aug 23 – Sep 1)
**Phase 1: Syntax Fixing** (8 days before Sem 5)
- Gem gives buggy code → you fix it
- Binary Search pseudocode → Java translation starts
- This phase blends into Sem 5 — it's light enough to do alongside classes

> [!important]
> **Sep 1 = Sem 5 starts.** Phase 1 is intentionally lightweight so it can continue alongside your new semester without killing your schedule.

---

## 🚫 HackerRank Problems to SKIP (For Now)
These are on your unsolved list but are **not relevant to Phase 0**:
- All Regex problems (Java Regex, Regex 2, Pattern Checker, Tag Extractor, Valid Username)
- Java MD5, SHA-256, BigDecimal, BigInteger, Primality Test, BitSet
- All OOP patterns (Factory, Singleton, Visitor, Annotations)
- Lambda, Generics, Varargs, Reflection, Covariant Return Types
- Java Inheritance I & II, Abstract Class, Interface, Method Overriding

**Come back to these during Phase 3+ (September onwards)**

---

## 📊 Daily Log Table

| Day | Date | Challenge | HR Problem | Status | Time | Notes |
|-----|------|-----------|------------|--------|------|-------|
| 1 | Jul 30 | ArrayList basics + reverse loop | — | ✅ Done | ~1.5h | size()-1 confusion |
| 2 | Jul 31 | Remove ops + contains | Java 1D Array | | | |
| 3 | Aug 1 | Exists check + remove by index | Java Arraylist | | | |
| 4 | Aug 2 | Mini shopping cart project | Java List | | | |
| 5 | Aug 3 | Speed drill Days 1-4 | Java 2D Array | | | |
| 6 | Aug 4 | Final recode session | Java Subarray | | | |
| 7 | Aug 6 | ⚠️ WEEK 1 CHECKPOINT | — | | | |
| 8 | Aug 7 | HashMap basics | Java Map | | | |
| 9 | Aug 8 | HashMap iteration | Java Hashset | | | |
| 10 | Aug 9 | HashMap advanced ops | Java Stack | | | |
| 11 | Aug 10 | HashMap speed drill | Java Sort | | | |
| 12 | Aug 11 | LinkedList basics | — | | | |
| 13 | Aug 12 | Queue + Stack | Java Priority Queue | | | |
| 14 | Aug 13 | ⚠️ WEEK 2 CHECKPOINT | — | | | |
| 15 | Aug 14 | Collections.sort() + review | — | | | |
| 16 | Aug 15 | Syntax bug fixing | — | | | |
| 17 | Aug 16 | Student grade tracker project | — | | | |
| 18 | Aug 17 | Speed challenge (all topics) | — | | | |
| 19 | Aug 18 | Mock Interview 1 | — | | | |
| 20 | Aug 19 | Mock Interview 2 | — | | | |
| 21 | Aug 20 | 🏆 PHASE 0 FINAL CHECKPOINT | — | | | |

---

## 📁 File Naming Convention
Save your `.java` files in `Phase_0/` like this:
```text
Phase_0/
  Day1_ReverseAnimeList.java      ← already done!
  Day2_RemoveEvens.java
  Day2_Recode_ReverseLoop.java    ← your recode attempt
  Day3_ContainsCheck.java
  ...
```
