# Week 8 – Exception Handling

**Learning objective (derived):** Read stack traces, handle and declare exceptions correctly, and design custom exceptions.
Plan examples: `src/com/example/week08/DivisionDemo.java`, `bank/InsufficientBalanceException.java`

## Block 1 – Exception hierarchy and stack traces
Study: Throwable; Error; Exception; runtime exceptions; call-stack propagation; stack traces.
- [ ] Read a stack trace and identify: exception type; message; file name; line number; call sequence

## Block 2 – try/catch
Study: multiple catch blocks; catch ordering; multi-catch; avoiding empty catches.
- [ ] Run `DivisionDemo` with `0` and with a non-zero number

## Block 3 – finally and try-with-resources
Study: finally; cleanup logic; why finally is not always enough; introduction to try-with-resources.

## Block 4 – throw vs throws
- [ ] Explain: `throw` creates or propagates a specific exception; `throws` declares possible exceptions in a method signature

## Block 5 – Checked vs unchecked
Checked: verified by the compiler; must be handled or declared (e.g. `IOException`). Unchecked: subclasses of `RuntimeException`; usually programming or validation problems (e.g. `NullPointerException`, `IllegalArgumentException`, `IndexOutOfBoundsException`).

## Block 6 – Custom exceptions
- [ ] Type the plan's `InsufficientBalanceException` yourself and explain `super(message)`

## Mini-project – Upgrade the banking application
Skeleton: `src/com/example/week08/bank/`
- [ ] Invalid-amount exception
- [ ] Insufficient-balance exception
- [ ] Account-not-found exception
- [ ] Proper error messages
- [ ] No silent exception handling

## Checkpoint (derived) – you should be able to explain:
- [ ] Throwable vs Error vs Exception, and how an exception propagates up the call stack
- [ ] how to read a stack trace
- [ ] catch ordering, multi-catch, and why empty catches are harmful
- [ ] finally versus try-with-resources
- [ ] throw vs throws, and checked vs unchecked exceptions

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week08 $(find week-08-exceptions/src -name "*.java")
java -cp out/week08 com.example.week08.DivisionDemo
java -cp out/week08 com.example.week08.bank.BankingApp
```
```powershell
javac -d out\week08 (Get-ChildItem -Recurse -Filter *.java week-08-exceptions\src).FullName
java -cp out\week08 com.example.week08.bank.BankingApp
```
