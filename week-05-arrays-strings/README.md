# Week 5 – Arrays and Strings

**Learning objective (derived):** Store and process data in arrays, and use String, StringBuilder and StringBuffer correctly.
Plan examples: `src/com/example/week05/ArraysAndStringsExamples.java`

## Block 1 – One-dimensional arrays
Study: declaration; creation; initialisation; indexing; array length; default values; iteration; index errors.
- [ ] Sum and average
- [ ] Minimum and maximum
- [ ] Linear search
- [ ] Array reversal
- [ ] Frequency counting

## Block 2 – Two-dimensional arrays
Study: two-dimensional arrays; rows and columns; nested iteration; jagged arrays.
- [ ] Matrix addition
- [ ] Matrix transpose
- [ ] Student-subject marks table
- [ ] Row and column totals

## Block 3 – String basics
Study: String creation; String literals; immutability; reference comparison; content comparison.
- [ ] Explain why `==` and `.equals()` give different answers

## Block 4 – String pool
Study: String literals; heap objects; String pool; `new String()`; `intern()`; why immutable strings can be pooled safely.
- [ ] Draw memory diagrams for `a = "Java"`, `b = "Java"`, `c = new String("Java")` (save in `notes/`)

## Block 5 – String methods
- [ ] Practise: `length()`, `charAt()`, `substring()`, `indexOf()`, `contains()`, `replace()`, `split()`, `trim()`, `strip()`, `toUpperCase()`, `toLowerCase()`, `equalsIgnoreCase()`, `startsWith()`, `endsWith()`
- [ ] Palindrome checker
- [ ] Word counter
- [ ] Vowel counter
- [ ] Email validator
- [ ] Sentence analyser

## Block 6 – StringBuilder and StringBuffer
Study: mutable character sequences; `append()`; `insert()`; `delete()`; `reverse()`; capacity; performance; thread-safety difference.
Rule: use StringBuilder for normal string construction; use StringBuffer only when synchronized mutable access is genuinely required.

## Project – Text Analyzer
Skeleton: `src/com/example/week05/textanalyzer/TextAnalyzer.java`
- [ ] Character count
- [ ] Word count
- [ ] Vowel count
- [ ] Digit count
- [ ] Most frequent character
- [ ] Reversed text
- [ ] Palindrome status

## Checkpoint (derived) – you should be able to explain:
- [ ] array default values and what causes an index error
- [ ] how jagged arrays differ from rectangular ones
- [ ] `==` versus `.equals()` for Strings
- [ ] the String pool, `new String()` and `intern()`, and why immutability makes pooling safe
- [ ] when to use StringBuilder versus StringBuffer

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week05 $(find week-05-arrays-strings/src -name "*.java")
java -cp out/week05 com.example.week05.ArraysAndStringsExamples
java -cp out/week05 com.example.week05.textanalyzer.TextAnalyzer
```
```powershell
javac -d out\week05 (Get-ChildItem -Recurse -Filter *.java week-05-arrays-strings\src).FullName
java -cp out\week05 com.example.week05.textanalyzer.TextAnalyzer
```
