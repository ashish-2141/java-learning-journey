# Week 4 – Control Flow Statements

**Learning objective (derived):** Control the order of execution with conditions, switches and loops.
Plan examples: `src/com/example/week04/SwitchDemo.java`

## Block 1 – if statements
Study: simple if; if-else; else-if; nested conditions; guard clauses.
- [ ] Largest of three numbers
- [ ] Leap-year checker
- [ ] Grade calculator
- [ ] Loan-eligibility checker

## Block 2 – switch
Study: the traditional switch statement and modern switch expressions (both in `SwitchDemo.java`).
- [ ] Menu-driven calculator
- [ ] Month-name finder
- [ ] Grade-description program

## Block 3 – for loops
Study: standard for; nested loops; enhanced for; loop counters; infinite-loop risks.
- [ ] Multiplication tables
- [ ] Sum from 1 to n
- [ ] Factorial
- [ ] Prime-number checking
- [ ] Number patterns

## Block 4 – while and do-while
Understand: `while` executes only when the condition is true; `do-while` executes at least once.
- [ ] Number guessing
- [ ] Password retry
- [ ] Menu-based program
- [ ] Digit counting
- [ ] Number reversal

## Block 5 – break, continue, labels
Study: exiting a loop with break; skipping an iteration with continue; labelled statements (advanced).
- [ ] Stop when a negative number appears
- [ ] Skip numbers divisible by three
- [ ] Search for an item
- [ ] Exit nested loops

## Mini-project – Console Banking Menu
Skeleton: `src/com/example/week04/bank/BankingMenu.java`
Menu: 1. Check balance, 2. Deposit, 3. Withdraw, 4. View transactions, 5. Exit.
- [ ] Input validation
- [ ] Withdrawal rules
- [ ] Repeated menu execution
- [ ] Proper use of switch
- [ ] break and loops

## Checkpoint (derived) – you should be able to explain:
- [ ] when to use if/else-if versus switch, and what a guard clause is
- [ ] the difference between a traditional switch statement and a switch expression
- [ ] the difference between while and do-while
- [ ] what break, continue and labelled statements do
- [ ] how an infinite loop happens and how to avoid it

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week04 $(find week-04-control-flow/src -name "*.java")
java -cp out/week04 com.example.week04.SwitchDemo
java -cp out/week04 com.example.week04.bank.BankingMenu
```
```powershell
javac -d out\week04 (Get-ChildItem -Recurse -Filter *.java week-04-control-flow\src).FullName
java -cp out\week04 com.example.week04.bank.BankingMenu
```
