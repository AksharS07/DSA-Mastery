# Day 32: Aptitude Deep Dive (Time & Work)
**Date:** 2026-09-14
**Start Time:** *8:45 PM*
**End Time:** *9:05 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** New String Syntax (`.substring()`).
Write a method `public String removeFirstChar(String s)` that returns the string without its very first character. 
*(Hint: Use `s.substring(1)` to slice the string starting from index 1 to the end. Strings are zero-indexed, so index 1 drops the first letter).*

**Your Code:**
```java
class Solution {
    public String removeFirstChar(String s) {
        return s.substring(1);
    }
}
```

---

## 2. Aptitude Deep Dive: Time & Work (LCM Method) [00:10 - 00:50]
*I just added Section 7 to your `Quants_Formulas.md`. Go read it right now before starting! It introduces the LCM method which completely eliminates messy fractions.*

**Problem 1 (Basic Together):**
P can complete a project in 12 days. Q can complete the same project in 24 days. How many days will it take if they work together?
*(Hint: Find LCM of 12 and 24 to get total work units. Find the efficiency of P and Q. Add them up).*

**Your Working:**
```text
    so total work = efficiency * time
    so total work is = 12,24 (lcm) that is 2*2*2*2*3 =48
    so efficiency of
    p=48/12=4
    q=48/24=2
    total efficiency=6
    so time = 48/6= 8 days
```

**Problem 2 (Someone Joins Late):**
A can finish a task in 15 days, and B can finish it in 10 days. 
A starts the work alone. After 5 days, B joins him. How many more days will it take for them to finish the remaining work together?
*(Hint: LCM of 15 and 10 is 30 units total. Find A and B's daily efficiencies. A works alone for 5 days. Subtract that work from the total 30. Then divide the remaining work by their COMBINED efficiency to find the remaining time).*

**Your Working:**
```text
so....
tw = e*t 
tw = 5*2*3 =30
eff of A = 30/15 =2
eff of B = 30/10 =3 
total work of A done in 5 days = 2*5=10
tw = 30-10=20 
so t = 20/(3+2)=4 days
```

---

## AI Feedback & Corrections
- **SRS:** Spot on. `s.substring(1)` is exactly how you drop the first character.
- **Aptitude Q1:** You got the correct answer (8 days)! One tiny note: The lowest common multiple (LCM) of 12 and 24 is actually 24. You used 48, which is just a common multiple. But here is the beautiful thing about this method: *any* common multiple will give you the exact same, correct answer! 
- **Aptitude Q2:** Absolutely flawless. You found the efficiencies (2 and 3), calculated A's solo work (10 units), found the remaining (20 units), and divided by the combined efficiency (5) to get 4 days. 

**Final Verdict:** You just mastered the LCM method for Time & Work problems on your very first try. You will never need to use messy fractions for these problems again.
