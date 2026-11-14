# Week 10: Generics

Study generic classes and methods, type parameters, bounded types, generic invariance, wildcards, PECS, type erasure, raw types, unsafe casts, varargs and heap pollution.

## Practice

- [ ] Compare raw and type-safe collections
- [ ] Create Box<String> and Box<Integer>
- [ ] Write generic print, swap, search and pair methods
- [ ] Use bounded type parameters
- [ ] Practise `? extends` and `? super`
- [ ] Explain type erasure and `@SafeVarargs`

## Mini-project

Create a generic `Repository<T, ID>` supporting add, find by ID, update, delete and return all records. Implement it for students and products.

## Compile and run

```bash
javac -d out/week10 $(find week-10-generics/src -name "*.java")
java -cp out/week10 com.example.week10.GenericMethods
```
