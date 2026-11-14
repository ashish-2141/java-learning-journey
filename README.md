# Java Learning Journey

A 12-week self-paced Core Java plan, from Java basics to a console-based Workflow and Task Manager.

Follow the rule: **Understand → Predict → Code → Break → Debug → Test → Explain → Apply.**

Maintained by ashish-2141 · GitHub: [@ashish-2141](https://github.com/ashish-2141)

## Tools

JDK 21 (Eclipse Temurin) · IntelliJ IDEA · Git · GitHub. No build tool is required.
Setup instructions: [docs/setup.md](docs/setup.md).

## 12-week roadmap

| Week | Folder | Topic | Mini-project / assignment |
|---|---|---|---|
| 0 | [docs/setup.md](docs/setup.md) | Environment setup | Initial skills checklist |
| 1 | [week-01-basics](week-01-basics) | Java Syntax and Program Structure | Personal Profile Console Program |
| 2 | [week-02-data-types](week-02-data-types) | Primitive Data Types and Type Conversion | Student Result Calculator |
| 3 | [week-03-operators](week-03-operators) | Operators and Expressions | Expression Laboratory |
| 4 | [week-04-control-flow](week-04-control-flow) | Control Flow Statements | Console Banking Menu |
| 5 | [week-05-arrays-strings](week-05-arrays-strings) | Arrays and Strings | Text Analyzer |
| 6 | [week-06-classes-objects](week-06-classes-objects) | Classes, Objects, and Encapsulation | Student Management Model |
| 7 | [week-07-immutability-memory](week-07-immutability-memory) | Immutability and Memory Management | Memory diagrams for ten code samples |
| 8 | [week-08-exceptions](week-08-exceptions) | Exception Handling | Banking application upgrade |
| 9 | [week-09-collections](week-09-collections) | Collections Framework | Student Record Manager |
| 10 | [week-10-generics](week-10-generics) | Generics | Generic `Repository<T, ID>` |
| 11 | [week-11-input-output](week-11-input-output) | Input and Output | File-Based Student Manager |
| 12 | [week-12-integrated-project](week-12-integrated-project) | Integrated Final Project | Console-Based Workflow and Task Manager |

Every exercise solution should be your own work. Change the progress status as you complete each week.

## Compile and run

Run commands from the repository root.

**macOS / Linux / Git Bash**

```bash
javac -d out/week01 $(find week-01-basics/src -name "*.java")
java -cp out/week01 com.example.week01.HelloWorld
java -cp out/week01 com.example.week01.CommandLineDemo Nischal
```

**Windows PowerShell**

```powershell
javac -d out\week01 (Get-ChildItem -Recurse -Filter *.java week-01-basics\src).FullName
java -cp out\week01 com.example.week01.HelloWorld
java -cp out\week01 com.example.week01.CommandLineDemo Nischal
```

In IntelliJ IDEA, open the repository folder and mark each `week-NN-*/src` folder as a Sources Root. See [docs/setup.md](docs/setup.md).

## Daily learning method

1. Retrieval practice: recall yesterday's concepts without notes.
2. Study one focused concept.
3. Type and run examples yourself.
4. Solve problems independently.
5. Introduce, diagnose, and fix errors.
6. Record notes and commit your work.

Template: [notes/templates/daily-note.md](notes/templates/daily-note.md).

## Commit messages

Use `practice:`, `feat:`, `fix:`, `docs:`, `refactor:`, and `chore:`.

## Progress tracker

- [ ] Phase 0 – environment set up
- [ ] Week 01 – Java syntax and program structure
- [ ] Week 02 – primitive data types and conversions
- [ ] Week 03 – operators and expressions
- [ ] Week 04 – control flow
- [ ] Week 05 – arrays and strings
- [ ] Week 06 – classes, objects, and encapsulation
- [ ] Week 07 – immutability and memory management
- [ ] Week 08 – exception handling
- [ ] Week 09 – collections framework
- [ ] Week 10 – generics
- [ ] Week 11 – input and output
- [ ] Week 12 – integrated project

## Final rule

**Understand → Predict → Code → Break → Debug → Test → Explain → Apply.** Do not mark a topic complete merely because you watched a tutorial or copied working code.

See [docs/after-week-12.md](docs/after-week-12.md) for supporting topics before Spring Boot.

## Licence

MIT. See [LICENSE](LICENSE).
