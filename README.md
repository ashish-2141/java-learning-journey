# Java Learning Journey

A 12-week, self-paced Core Java study plan, from Hello World to a console-based
Workflow and Task Manager. It follows the rule:
**Understand → Predict → Code → Break → Debug → Test → Explain → Apply.**

Maintained by Ashish Kumar Samal · GitHub: [@ashish-2141](https://github.com/ashish-2141)

> Everything here is written by me while learning. The repository holds the plan's
> example programs and empty skeletons. Every exercise solution is my own work.

## Tools

JDK 21 (Eclipse Temurin) · IntelliJ IDEA · Git · GitHub. No build tool is required.
Setup instructions: [docs/setup.md](docs/setup.md).

## 12-week roadmap

| Week | Folder | Topic | Mini-project / assignment | Status |
|---|---|---|---|---|
| 0 | [docs/setup.md](docs/setup.md) | Environment setup | Initial skills checklist | Not started |
| 1 | [week-01-basics](week-01-basics) | Java Syntax and Program Structure | Personal Profile Console Program | Not started |
| 2 | [week-02-data-types](week-02-data-types) | Primitive Data Types and Type Conversion | Student Result Calculator | Not started |
| 3 | [week-03-operators](week-03-operators) | Operators and Expressions | Expression Laboratory | Not started |
| 4 | [week-04-control-flow](week-04-control-flow) | Control Flow Statements | Console Banking Menu | Not started |
| 5 | [week-05-arrays-strings](week-05-arrays-strings) | Arrays and Strings | Text Analyzer | Not started |
| 6 | [week-06-classes-objects](week-06-classes-objects) | Classes, Objects, and Encapsulation | Student Management Model | Not started |
| 7 | [week-07-immutability-memory](week-07-immutability-memory) | Immutability and Memory Management | Memory diagrams for ten code samples | Not started |
| 8 | [week-08-exceptions](week-08-exceptions) | Exception Handling | Banking application upgrade | Not started |
| 9 | [week-09-collections](week-09-collections) | Collections Framework | Student Record Manager | Not started |
| 10 | [week-10-generics](week-10-generics) | Generics | Generic `Repository<T, ID>` | Not started |
| 11 | [week-11-input-output](week-11-input-output) | Input and Output | File-Based Student Manager | Not started |
| 12 | [week-12-integrated-project](week-12-integrated-project) | Integrated Final Project | Console-Based Workflow and Task Manager | Not started |

Change *Not started* to *In progress* or *Done* as you go.

## How to compile and run a program

Always run commands from the **repository root** (the folder that contains this README).
Each week folder holds a `src/` folder, and packages are named `com.example.weekNN`.

**macOS / Linux / Git Bash**

```bash
# compile every file of one week into out/week01
javac -d out/week01 $(find week-01-basics/src -name "*.java")
# run one program (use the fully qualified class name)
java -cp out/week01 com.example.week01.HelloWorld
# with command-line arguments
java -cp out/week01 com.example.week01.CommandLineDemo Nischal
```

**Windows PowerShell**

```powershell
javac -d out\week01 (Get-ChildItem -Recurse -Filter *.java week-01-basics\src).FullName
java -cp out\week01 com.example.week01.HelloWorld
java -cp out\week01 com.example.week01.CommandLineDemo Nischal
```

**Compile just one program and whatever it uses:**

```bash
javac -d out/week06 -sourcepath week-06-classes-objects/src week-06-classes-objects/src/com/example/week06/management/StudentManagementApp.java
```

**Quick single-file shortcut** (no `out/` folder; works when the program is a single file):

```bash
java week-01-basics/src/com/example/week01/HelloWorld.java
```

**IntelliJ IDEA:** open the repository folder and mark each `week-NN-*/src` folder as
*Sources Root* (details in [docs/setup.md](docs/setup.md)). Then click the green ▶ next to `main`.

## Daily learning method (every 2–3-hour session)

1. **Retrieval practice – 15 min.** Without notes, write: what you learned yesterday; two syntax examples; one mistake you made; one question you still have.
2. **Concept study – 35 min.** Study only one focused topic. Do not spend the entire session watching tutorials.
3. **Guided coding – 35 min.** Reproduce examples, but type everything yourself.
4. **Independent coding – 45 min.** Solve two or three problems without copying.
5. **Debugging – 20 min.** Deliberately introduce errors (syntax error, type error, logic error, runtime exception), then identify and fix them.
6. **Notes and Git commit – 15 min.** Record: definition, syntax, example, common mistake, practical use. Then commit and push.

Template: [notes/templates/daily-note.md](notes/templates/daily-note.md)

## Exercise progression (four levels for every topic)

| Level | Type | Examples |
|---|---|---|
| 1 | Syntax exercises | declare variables; create arrays; write loops; create classes |
| 2 | Logic exercises | prime numbers; palindromes; frequency counting; matrix operations |
| 3 | Object-oriented exercises | Student; Bank account; Product; Employee; Library book |
| 4 | Integrated applications | banking system; student manager; library manager; workflow manager |

## Weekly assessment (every Saturday)

| Part | Content | Marks |
|---|---|---|
| A | Concept test: ten MCQs, five true-or-false questions, five short definitions | 20 |
| B | Code reading: predict the output of four programs | 20 |
| C | Debugging: fix four broken programs | 20 |
| D | Coding: solve two programming problems without assistance | 30 |
| E | Explanation: explain one concept aloud for five minutes | 10 |
| | **Total** | **100** |

**Passing rule:** at least **70%** overall **and** at least **60% on the coding section** (18/30).
If you miss either requirement, use the next day for remediation before continuing.
Scorecard: [notes/templates/weekly-assessment.md](notes/templates/weekly-assessment.md)

## Commit message convention

Format: `type: short description in the imperative mood`

| Type | Use it for | Example |
|---|---|---|
| `practice` | exercises and practice programs (custom type) | `practice: complete array search problems` |
| `feat` | a mini-project or final-project feature | `feat: implement student grade calculator` |
| `fix` | fixing a bug in your own code | `fix: handle invalid withdrawal amount` |
| `docs` | notes, READMEs, assessment scores | `docs: add notes on string immutability` |
| `refactor` | restructuring code without changing behaviour | `refactor: extract menu printing method` |
| `chore` | setup, configuration, CI | `chore: add compile workflow` |

## Progress tracker

- [ ] Phase 0 – environment set up and initial skills checklist done
- [ ] Week 01 – blocks, mini-project, Saturday assessment passed
- [ ] Week 02 – blocks, mini-project, Saturday assessment passed
- [ ] Week 03 – blocks, mini-project, Saturday assessment passed
- [ ] Week 04 – blocks, mini-project, Saturday assessment passed
- [ ] Week 05 – blocks, project, Saturday assessment passed
- [ ] Week 06 – blocks, mini-project, Saturday assessment passed
- [ ] Week 07 – blocks, memory-diagram assignment, Saturday assessment passed
- [ ] Week 08 – blocks, mini-project, Saturday assessment passed
- [ ] Week 09 – blocks, mini-project, Saturday assessment passed
- [ ] Week 10 – blocks, mini-project, Saturday assessment passed
- [ ] Week 11 – blocks, mini-project, Saturday assessment passed
- [ ] Week 12 – final project built and defended

## Mastery checklist

You are ready to move on when you can independently:

- [ ] Write and run Java programs
- [ ] Explain primitive and reference types
- [ ] Use operators and control-flow statements
- [ ] Manipulate arrays and strings
- [ ] Design classes with proper encapsulation
- [ ] Explain stack, heap, references, and garbage collection
- [ ] Diagnose null-pointer problems
- [ ] Design custom exceptions
- [ ] Select the correct collection
- [ ] Use generics without raw types
- [ ] Read and write text and binary files
- [ ] Build a menu-driven application
- [ ] Organise code into packages
- [ ] Debug without depending entirely on AI
- [ ] Explain every important design decision
- [ ] Build and defend the final project

## Final rule

For each topic: **Understand → Predict → Code → Break → Debug → Test → Explain → Apply.**
Do not mark a topic complete merely because you watched a tutorial or copied working code.

## What comes after Week 12

Another 5–6 weeks of supporting topics before moving seriously into Spring Boot:
[docs/after-week-12.md](docs/after-week-12.md).

## Licence

Code in this repository is released under the MIT License. See [LICENSE](LICENSE).
