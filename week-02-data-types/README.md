# Week 2 – Primitive Data Types and Type Conversion

**Learning objective (derived):** Choose the right primitive type for a value and predict what happens when values are converted between types.
Plan examples: `src/com/example/week02/DataTypeExamples.java`

## Block 1 – Integer types
Study: `byte`, `short`, `int` (default integer type), `long`.
- [ ] Declare and print the minimum and maximum value of each integer type
- [ ] Store age, population, salary, distance, and transaction IDs in suitable types
- [ ] Use the `L` suffix with long literals

## Block 2 – Floating-point types
Study: `float`; `double`; precision differences; `F` suffix; floating-point accuracy limitations; why financial values normally need `BigDecimal`.
- [ ] Run `System.out.println(0.1 + 0.2);` and explain why the result may not be exactly 0.3

## Block 3 – char and boolean
Study: `char`; Unicode; character literals; escape sequences; `boolean`; boolean expressions.
- [ ] Grade classification
- [ ] Login status
- [ ] Eligibility status
- [ ] Uppercase/lowercase checks

## Block 4 – Widening and narrowing conversion
Understand: data loss; overflow; explicit casting; implicit casting; compatible and incompatible conversions.
- [ ] Predict, then print, `roundedDown` from the plan's narrowing example
- [ ] Write one example each of data loss and overflow

## Block 5 – Promotion and default values
Study: promotion of `byte`, `short`, and `char` to `int`; numeric promotion in expressions; default values of instance variables; why local variables have no default value.
- [ ] Explain why `byte + byte` must be stored in an `int`
- [ ] Create a class containing every primitive type and print its default value

## Mini-project – Student Result Calculator
Skeleton: `src/com/example/week02/result/StudentResultCalculator.java`
- [ ] Input or define: student name; marks in five subjects; maximum marks
- [ ] Calculate total
- [ ] Calculate percentage
- [ ] Decide pass/fail
- [ ] Assign a grade
- [ ] Show rounded and exact percentage

## Checkpoint (derived) – you should be able to explain:
- [ ] the eight primitive types and when to use each integer and floating-point type
- [ ] why `0.1 + 0.2` is not exactly `0.3`, and why money normally needs `BigDecimal`
- [ ] widening vs narrowing conversion, and when data loss or overflow happens
- [ ] numeric promotion of `byte`, `short` and `char` to `int`
- [ ] why instance variables have default values but local variables do not

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week02 $(find week-02-data-types/src -name "*.java")
java -cp out/week02 com.example.week02.DataTypeExamples
java -cp out/week02 com.example.week02.result.StudentResultCalculator
```
```powershell
javac -d out\week02 (Get-ChildItem -Recurse -Filter *.java week-02-data-types\src).FullName
java -cp out\week02 com.example.week02.DataTypeExamples
```
