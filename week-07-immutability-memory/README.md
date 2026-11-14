# Week 7 – Immutability and Memory Management

**Learning objective (derived):** Build immutable classes and explain what happens in stack and heap memory, including null references and garbage collection.
Plan examples: `src/com/example/week07/StudentIdentity.java`, `Student.java`, `ReferenceTraceDemo.java`

## Block 1 – Immutable classes
Rules: make the class final when appropriate; make fields private and final; initialise fields through constructors; do not provide setters; defensively copy mutable data; avoid exposing mutable internal objects.
- [ ] Complete the immutable `StudentIdentity` (see its TODOs)

## Block 2 – Stack and heap
- [ ] Trace `Student a = new Student(); Student b = a; b.name = "Rahul";` and explain why `a.name` also changes

## Block 3 – Object creation
Study: (1) class loading; (2) memory allocation; (3) default field initialisation; (4) constructor execution; (5) reference assignment. Constructors do not return objects: `new` creates the object; constructors initialise it.
- [ ] Explain the five steps for one `new` expression in your own words

## Block 4 – NullPointerException
Study: calling a method through null; accessing a field through null; unboxing a null wrapper; accessing a null array; chained method calls.
- [ ] Reproduce each of the five NullPointerException situations
- [ ] Practise `if (student != null) { student.introduce(); }`
- [ ] Practise `Objects.requireNonNull()`
- [ ] Return empty collections instead of null; avoid unnecessary null values

## Block 5 – Garbage collection
Study: reachable and unreachable objects; garbage collector purpose; no guarantee of immediate collection; why `System.gc()` is only a request; strong-reference basics; object lifecycle.
- [ ] Write programs that make references unreachable and draw the resulting memory state

## Block 6 – Memory leaks in Java
- [ ] Explain each cause: static collections; unremoved listeners; unclosed resources; unbounded caches; long-lived references; ThreadLocal misuse

## Weekly assignment – ten memory diagrams
Save them in `diagrams/` (photos or drawings: `diagram-01.png` … `diagram-10.png`).
- [ ] Primitive local values
- [ ] Object references
- [ ] Shared objects
- [ ] Reassigned references
- [ ] Null references
- [ ] Unreachable objects
- [ ] Diagrams 1–10 complete: [ ] 1 [ ] 2 [ ] 3 [ ] 4 [ ] 5 [ ] 6 [ ] 7 [ ] 8 [ ] 9 [ ] 10

## Checkpoint (derived) – you should be able to explain:
- [ ] the rules for an immutable class, and why defensive copies matter
- [ ] what lives on the stack versus the heap
- [ ] the five steps of object creation
- [ ] five causes of NullPointerException and how to defend against them
- [ ] reachability, garbage collection, and how Java can still leak memory

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week07 $(find week-07-immutability-memory/src -name "*.java")
java -cp out/week07 com.example.week07.ReferenceTraceDemo
```
```powershell
javac -d out\week07 (Get-ChildItem -Recurse -Filter *.java week-07-immutability-memory\src).FullName
java -cp out\week07 com.example.week07.ReferenceTraceDemo
```
