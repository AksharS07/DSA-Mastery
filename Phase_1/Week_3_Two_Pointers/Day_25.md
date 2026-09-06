# Day 25: Aptitude Deep Dive (Time, Speed, Distance)
**Date:** 2026-09-06
**Start Time:** *11:17 AM*
**End Time:** *12:08 PM*

---

## 1. SRS Warm-Up [00:00 - 00:10]
**Task:** 
Let's drill your bracket scoping and `for` loop syntax from yesterday!
1. Write a `for` loop to iterate through an integer array `arr`.
2. Extract the current element into an `int` variable called `val`.
3. If `val` is exactly 20, `return val;`.
(Don't forget the fallback `return -1;` at the very end of the method!).

**Your Code:**
```java
class Solution {
    public int findTwenty(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            if(val==20)
            {
                return val;
            }
        }
        return -1;
    }
}
```

---

## 2. Aptitude Deep Dive: Time, Speed, Distance [00:10 - 01:00]
Today is all about TSD! You have 3 classic problems. Reference your `Quants_Formulas.md` if you get stuck.

**Problem 1 (Average Speed):**
Akshar travels from City A to City B at 40 km/hr and returns from City B to City A at 60 km/hr. What is his average speed for the entire round trip? 
*(Hint: It is NOT 50 km/hr! Use the formula).*

**Your Working:**
```text
so the avg speed is
2*40*60=4800
40+60=100
4800/100=48km/h is the avg speed
```

**Problem 2 (Late/Early Time Gap):**
Traveling at 30 km/hr, you reach your college 10 minutes late. Traveling at 40 km/hr, you reach 5 minutes early. What is the distance to the college?
*(Hint: Watch your units! Convert your time gap to hours).*

**Your Working:**
```text
So the distance is
30*40 = 1200
40-30=10
1200/10=120
Time difference = 10+5=15min=0.25hrs
so 120*0.25=30KM?
```

**Problem 3 (Relative Speed):**
Two trains, 100 meters and 150 meters long respectively, are moving in opposite directions on parallel tracks. Train A is moving at 40 km/hr and Train B is moving at 50 km/hr. How long will they take to completely pass each other?
*(Hint: When moving in opposite directions, do you add or subtract the speeds? Convert km/hr to m/s by multiplying by 5/18).*

**Your Working:**
```text
so
Time = distance/speed
distance =100+150=250
speed= 50+40=90
so time = 90*5/18 = 450/18 = 25m/s
therefore time = 250/25 =10m/s

```

---

## AI Feedback & Corrections
- **SRS:** Successfully implemented the early exit vs fallback return logic. Bracket scoping is rock solid.
- **Aptitude 1:** Flawlessly executed the harmonic mean `2xy/(x+y)` formula for average speed.
- **Aptitude 2:** Flawlessly executed the time gap formula and unit conversion.
- **Aptitude 3:** Perfect logic for relative speed (adding opposite directions) and distance. Almost fell into the unit trap at the end (writing m/s instead of seconds), but the numerical calculation `10` was exactly correct.

**Final Verdict:** Day 25 Complete! This was an incredibly strong showing. You have officially conquered the TSD aptitude block.

