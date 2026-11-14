# Week 1 – Java Syntax and Program Structure

**Learning objective:** Understand how a Java program is organised, compiled, and executed.

## Block 1 – Program structure
Study: class declaration, class body, method declaration, statements, braces, semicolons, source-file naming, case sensitivity.
Example: `src/com/example/week01/HelloWorld.java`. Understand every part: `public`, `class`, `HelloWorld`, `static`, `void`, `main`, `String[] args`, `System.out.println()`.
- [ ] Program that prints your name
- [ ] Program that prints your education
- [ ] Program that prints three career goals
- [ ] Program that prints a formatted student profile

## Block 2 – main, arguments, compilation vs execution
Study: why execution starts from `main`; valid main-method signature; command-line arguments; compilation versus execution; the JVM's role; source code, bytecode, and JVM execution.
- [ ] Type and run `CommandLineDemo` with an argument (commands below)
- [ ] Run it with **no** argument, read the exception, and explain it

> The plan's commands `javac CommandLineDemo.java` / `java CommandLineDemo Nischal` only work for a file
> with no `package` line, in the current folder. Here the file is in package `com.example.week01`,
> so use the commands at the bottom of this page.

## Block 3 – Comments
Study: single-line comments; multiline comments; Javadoc comments; when comments are useful; why comments should explain intent, not obvious code.
Example: `CommentsDemo.java` (`calculateTotal`).
- [ ] Call `calculateTotal` from `main` and print the result

## Block 4 – Keywords, identifiers, naming conventions
Study: reserved Java keywords; legal and illegal identifiers; case sensitivity; naming conventions
(classes `StudentReport`, methods `calculateAverage`, variables `totalMarks`, constants `MAX_RETRY_COUNT`, packages `com.example.student`).
- [ ] Identify which are invalid, and why: `2marks`, `student-name`, `class`, `total marks`, `_student`, `student2`

## Block 5 – Scope
Study: class scope; method scope; block scope; local-variable scope; semicolon rules; variable shadowing basics.
Example: `ScopeDemo.java`.
- [ ] Try to print `blockValue` outside the `if` block, read the compiler error, then remove the line

## Mini-project – Personal Profile Console Program
Skeleton: `src/com/example/week01/profile/PersonalProfile.java`
- [ ] Prints name
- [ ] Prints education
- [ ] Prints skills
- [ ] Prints career objective
- [ ] Prints current learning goal

## Week 1 checkpoint – you should be able to explain:
- [ ] how Java source code becomes executable
- [ ] why the main method is static
- [ ] the difference between a class and a method
- [ ] different types of comments
- [ ] class, method, and block scope

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run (from the repository root)
```bash
javac -d out/week01 $(find week-01-basics/src -name "*.java")
java -cp out/week01 com.example.week01.HelloWorld
java -cp out/week01 com.example.week01.CommandLineDemo Nischal
java -cp out/week01 com.example.week01.profile.PersonalProfile
```
```powershell
javac -d out\week01 (Get-ChildItem -Recurse -Filter *.java week-01-basics\src).FullName
java -cp out\week01 com.example.week01.HelloWorld
java -cp out\week01 com.example.week01.CommandLineDemo Nischal
```
