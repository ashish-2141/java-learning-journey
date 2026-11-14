# Week 10 – Generics

**Learning objective (derived):** Write type-safe reusable classes and methods with generics, and understand their limits (erasure, raw types).
Plan examples: `src/com/example/week10/Box.java`, `GenericMethods.java`

> **Interpretation note:** text inside angle brackets was lost from the source PDF in this week.
> Block 2's "Box, Box, Box" is read as `Box<String>`, `Box<Integer>` and `Box<Student>`.
> Block 5's three blank bullets are read as `<?>`, `<? extends T>` and `<? super T>`.

## Block 1 – Why generics
Compare `List values = new ArrayList();` (raw, unsafe) with `List<String> names = new ArrayList<>();`.
Understand: compile-time type safety; reusability; reduced casting; generic invariance.

## Block 2 – Generic classes
- [ ] Use `Box<String>`
- [ ] Use `Box<Integer>`
- [ ] Use `Box<Student>` (your own class)

## Block 3 – Generic methods
- [ ] Generic print method (see `printArray`)
- [ ] Generic swap method
- [ ] Generic search method
- [ ] Generic pair creator

## Block 4 – Naming conventions and bounded types
Conventions: T – Type; E – Element; K – Key; V – Value; R – Result. Bounded type: `<T extends Number>` (see `doubleValue`).

## Block 5 – Wildcards and PECS
Study: `<?>`, `<? extends T>`, `<? super T>`; Producer Extends, Consumer Super; `List<? extends Number>` and `List<? super Integer>`.
- [ ] Method that reads numbers
- [ ] Method that adds integers
- [ ] Method that prints any list
- [ ] Method that calculates totals from numeric lists

## Block 6 – Erasure and pitfalls
Study: generic information at compile time; type erasure; raw types; unsafe casts; varargs and generics; heap pollution; `@SafeVarargs`.

## Mini-project – Generic Repository<T, ID>
Skeleton: `src/com/example/week10/repository/`
- [ ] Add
- [ ] Find by ID
- [ ] Update
- [ ] Delete
- [ ] Return all records
- [ ] Implemented for students
- [ ] Implemented for products

## Checkpoint (derived) – you should be able to explain:
- [ ] why raw types are unsafe and what compile-time type safety means
- [ ] generic invariance (`List<Integer>` is not a `List<Number>`)
- [ ] the type-parameter naming conventions and bounded types
- [ ] PECS with `? extends` and `? super`
- [ ] type erasure, heap pollution and `@SafeVarargs`

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week10 $(find week-10-generics/src -name "*.java")
java -cp out/week10 com.example.week10.GenericMethods
java -cp out/week10 com.example.week10.repository.RepositoryDemo
```
```powershell
javac -d out\week10 (Get-ChildItem -Recurse -Filter *.java week-10-generics\src).FullName
java -cp out\week10 com.example.week10.repository.RepositoryDemo
```
