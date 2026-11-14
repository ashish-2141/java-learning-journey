# Week 7: Immutability and Memory Management

Study immutable class design, stack frames, heap objects, references, object initialisation, null handling, reachability, garbage collection and common causes of memory leaks.

## Practice

- [ ] Create an immutable StudentIdentity class
- [ ] Draw stack and heap diagrams for ten code samples
- [ ] Trace shared references and reassignment
- [ ] Identify unreachable objects
- [ ] Explain why `System.gc()` is only a request
- [ ] Identify memory-leak risks such as static collections, listeners, unclosed resources, unbounded caches and ThreadLocal misuse

## Assignment

Draw diagrams showing primitive local values, object references, shared objects, reassigned references, null references and unreachable objects.

## Compile and run

```bash
javac -d out/week07 $(find week-07-immutability-memory/src -name "*.java")
java -cp out/week07 com.example.week07.ReferenceTraceDemo
```
