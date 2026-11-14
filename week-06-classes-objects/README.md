# Week 6 – Classes, Objects, and Encapsulation

**Learning objective (derived):** Design classes whose state is protected and changed only through validated methods.
Plan examples: `src/com/example/week06/Student.java`, `src/com/example/week06/BankAccount.java`

## Block 1 – Classes and objects
Study: class structure; fields; methods; objects; state and behaviour; constructors (essential supporting topic).
- [ ] Type the plan's `Student` class and create two objects that call `introduce()`

## Block 2 – Creating objects
Study: `Student firstStudent = new Student();`: declaration; instantiation; initialisation; reference variables; multiple references to one object; `null`.
- [ ] Draw stack-and-heap diagrams (save in `notes/`)

## Block 3 – Kinds of variables
- [ ] Compare instance variables, local variables, parameters and static variables: scope; lifetime; default values; object-specific state

## Block 4 – Methods and constructors
Study: instance methods; parameters; return values; method overloading; `this.field`; `this()`; passing and returning objects.
- [ ] Add a constructor like `public Student(String name) { this.name = name; }` and explain `this.name`

## Block 5 – Access modifiers
Study: `private`; package-private; `protected`; `public`.
- [ ] Build a visibility table (same class; same package; subclass in another package; unrelated class in another package)

## Block 6 – Encapsulation
Study: private fields; validation in setters; getter naming; boolean getter naming; JavaBean conventions. Example: `BankAccount.java`.
- [ ] Explain why `deposit` throws for amounts ≤ 0

## Mini-project – Student Management Model
Skeleton: `src/com/example/week06/management/`
- [ ] Private fields
- [ ] Constructors
- [ ] Getters and setters
- [ ] Validation
- [ ] Result calculation
- [ ] Student information display

## Checkpoint (derived) – you should be able to explain:
- [ ] the difference between a class, an object and a reference variable
- [ ] what happens in memory for `new Student()`, and what `null` means
- [ ] instance vs local vs static variables (scope, lifetime, default values)
- [ ] `this.field`, `this()` and method overloading
- [ ] the four access levels, and why fields should be private with validated setters

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week06 $(find week-06-classes-objects/src -name "*.java")
java -cp out/week06 com.example.week06.management.StudentManagementApp
```
```powershell
javac -d out\week06 (Get-ChildItem -Recurse -Filter *.java week-06-classes-objects\src).FullName
java -cp out\week06 com.example.week06.management.StudentManagementApp
```
