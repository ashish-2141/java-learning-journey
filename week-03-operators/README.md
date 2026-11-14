# Week 3 – Operators and Expressions

**Learning objective (derived):** Evaluate Java expressions correctly, including precedence, short-circuiting and increment/decrement behaviour.
Plan examples: `src/com/example/week03/OperatorExamples.java`
> This week has no folder in the PDF's original list. It is included here because it is in the syllabus.

## Block 1 – Arithmetic, unary, increment/decrement
Study: `+`, `-`, `*`, `/`, `%`, unary `+` and `-`, increment and decrement. Compare `a++` and `++a`.
- [ ] Simple calculator
- [ ] Even/odd checker
- [ ] Unit conversion
- [ ] Time conversion
- [ ] Percentage calculator

## Block 2 – Relational and logical operators
Study: `==`, `!=`, `>`, `<`, `>=`, `<=`, `&&`, `||`, `!`, short-circuit evaluation.
- [ ] Create eligibility conditions such as `boolean eligible = age >= 18 && percentage >= 60;`

## Block 3 – Assignment operators
Study: `=`, `+=`, `-=`, `*=`, `/=`, `%=`.
- [ ] Compare `total = total + marks;` versus `total += marks;`

## Block 4 – Ternary operator
- [ ] Maximum of two numbers
- [ ] Adult/minor classification
- [ ] Positive/negative classification
- [ ] Discount eligibility
- Do not overuse nested ternary expressions.

## Block 5 – Bitwise and shift operators
Study: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`, binary number representation.
- [ ] Check whether a number is odd using bitwise operations
- [ ] Set and clear a bit
- [ ] Calculate powers of two using shifts
- [ ] Compare logical and bitwise operators

## Mini-project – Expression Laboratory
Skeleton: `src/com/example/week03/lab/ExpressionLaboratory.java`
- [ ] Take multiple values
- [ ] Evaluate expressions
- [ ] Show results with and without parentheses
- [ ] Demonstrate precedence
- [ ] Demonstrate short-circuiting
- [ ] Demonstrate pre-increment and post-increment

## Checkpoint (derived) – you should be able to explain:
- [ ] the difference between `a++` and `++a`
- [ ] short-circuit evaluation of `&&` and `||`
- [ ] when the ternary operator helps, and why nested ternaries hurt readability
- [ ] how bitwise and shift operators work on the binary representation
- [ ] how precedence and parentheses change a result

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week03 $(find week-03-operators/src -name "*.java")
java -cp out/week03 com.example.week03.OperatorExamples
java -cp out/week03 com.example.week03.lab.ExpressionLaboratory
```
```powershell
javac -d out\week03 (Get-ChildItem -Recurse -Filter *.java week-03-operators\src).FullName
java -cp out\week03 com.example.week03.OperatorExamples
```
