# AI Context Handoff for Akshar Srijan

**To the future AI assistant:** Akshar is launching a new chat session to reset the context window. Read this document FIRST before doing anything.

---

## 1. CRITICAL — READ THESE FILES EVERY SESSION

1. `/mnt/Storage/Obsidian Vault/DSA/GEMINI.md` — Rules you MUST follow. No exceptions.
2. This file (`AI_CONTEXT_HANDOFF.md`) — Current state and progress.
3. The roadmap artifact referenced below — Master plan.

---

## 2. The User & The Goal

- **Identity:** Akshar Srijan, 5th semester CS/IoT/Cybersecurity at MITE.
- **Profile:** Builder (Proxmox homelab, ML microservices, browser extensions). Strong on projects, weak on raw coding from scratch.
- **Goal:** Clear coding rounds at tier 2-3 companies (TCS Digital, Infosys PP, Cognizant, etc.). Placements possibly start 6th sem (March 2027), definitely by 7th sem (August 2027).
- **Secondary Goal:** Enough Java fluency to build projects independently.

---

## 3. STRATEGY OVERHAUL (September 20, 2026)

### What happened:
- Days 1-35 were done in Markdown files. Code was never compiled or run.
- A live coding assessment on Day 35 revealed: Akshar understands concepts (two pointers, hashmap, linked list) but CANNOT write working Java code from a blank page. Multiple syntax errors on basic programs (.length() vs .length, return from void, passing array instead of element).
- Reddit research (5 threads, 300+ comments) confirmed the approach: Rebuild Technique, 15-minute struggle rule, compiler feedback is non-negotiable.

### The new system (Phase 0.5 — Syntax Fluency Sprint):
- **Code is written in `.java` files and RUN with `java filename.java`**
- **NO more code in Markdown files**
- Daily format: SRS (10 min) → Aptitude (20 min) → Code Sprint (40-60 min)
- Each program is done 3 times: Guided (google OK) → Solo (no google) → Cold (from memory, under 5 min)
- Only move to next program when current one passes Cold attempt

### TCS Digital verified pattern (user googled Sept 22):
- Q1: Easy-Medium (arrays, strings, math, patterns)
- Q2: Medium-Hard (DP, Greedy, Sliding Window, Trees, Bit Manipulation)
- This means Phase 2 MUST cover DP, Greedy, Trees — cannot skip them

---

## 4. CURRENT PROGRESS TRACKER

### Current Phase: Phase 0.5 — Syntax Fluency Sprint
### Start Date: TBD (as of Sept 22, 2026 — not yet started)

| # | Program | Round 1 (Guided) | Round 2 (Solo) | Round 3 (Cold) | Status |
|---|---------|:-:|:-:|:-:|--------|
| 1 | FizzBuzz (1-50) | ⬜ | ⬜ | ⬜ | Not Started |
| 2 | Find max in int[] array | ⬜ | ⬜ | ⬜ | Not Started |
| 3 | Reverse a String (no library) | ⬜ | ⬜ | ⬜ | Not Started |
| 4 | Palindrome check (two pointers) | ⬜ | ⬜ | ⬜ | Not Started |
| 5 | Word frequency with HashMap | ⬜ | ⬜ | ⬜ | Not Started |
| 6 | Second largest in array | ⬜ | ⬜ | ⬜ | Not Started |
| 7 | Anagram check | ⬜ | ⬜ | ⬜ | Not Started |
| 8 | Print primes 1-100 | ⬜ | ⬜ | ⬜ | Not Started |
| 9 | Traverse singly linked list (ListNode) | ⬜ | ⬜ | ⬜ | Not Started |
| 10 | Reverse singly linked list | ⬜ | ⬜ | ⬜ | Not Started |

### Phase 1-3 Status: Not Started (starts after all 10 programs pass Cold)

### Days 1-35 Status: COMPLETED (but in markdown-only format, not compiled)

---

## 5. Rules & Persona

- **DO NOT** spoon-feed code. Problem statement + visual diagram only. He writes code from scratch.
- **DO NOT** use emojis. Keep it clean, professional, realistic.
- **DO NOT** introduce new concepts in SRS. SRS is ONLY for recalling previously learned syntax.
- **DO NOT** assume he knows LeetCode-specific structures (ListNode, TreeNode) unless explicitly covered.
- **DO** stamp Start/End times on daily files.
- **DO** update the progress tracker table above after every session.
- **DO** call out mistakes honestly. No sugarcoating.
- **DO** make him run the code. If he pastes code without output, ask for compiler output.

---

## 6. Known Weaknesses (from live assessment)

- `.length()` vs `.length` on arrays (recurring)
- `words` vs `words[i]` — passes whole array instead of element
- Forgets `System.out.println()` wrapper
- `return true/false` from `void main()`
- `.charAt()` is read-only — tries to assign to it
- Puts print/return statements inside loops instead of after
- Cannot write a basic for loop + if/else program in < 5 minutes without errors

---

## 7. Environment

- Java 25 (OpenJDK) on Fedora Linux
- `javac` NOT installed. Use `java filename.java` for single-file execution.
- VS Code with Copilot (should be DISABLED during practice for accurate assessment)
- Workspace: `/mnt/Storage/VS Code/WORKS/DSA-Mastery`
- Obsidian Vault: `/mnt/Storage/Obsidian Vault/DSA/`

---

## 8. College Aptitude Class (Monday)

- 2-hour class every Monday, instructor teaches new topic weekly.
- Daily aptitude blocks (Tue-Sun) consolidate that week's topic.
- Topics logged in `Quants_Formulas.md`.
- Topics covered so far: Vedic Squaring (Yavadunam Rule), Calendar Odd Days, Birthday Riddle.
