# Week 8: Exception Handling

Study `Throwable`, `Error`, `Exception`, runtime exceptions, stack traces, catch ordering, multi-catch, `finally`, try-with-resources, `throw`, `throws`, checked and unchecked exceptions.

## Practice

- [ ] Read exception type, message, file, line and call sequence in a stack trace
- [ ] Handle multiple exception types
- [ ] Avoid empty catch blocks
- [ ] Compare `throw` and `throws`
- [ ] Create a custom checked exception

## Mini-project

Upgrade the banking application with invalid-amount, insufficient-balance and account-not-found exceptions. Show clear error messages and never swallow exceptions silently.

## Compile and run

```bash
javac -d out/week08 $(find week-08-exceptions/src -name "*.java")
java -cp out/week08 com.example.week08.DivisionDemo
```
