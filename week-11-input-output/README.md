# Week 11: Input and Output

Study `File`, `Path`, `Files`, file metadata, paths, byte streams, character streams, buffering, try-with-resources, reading and writing text files, and serialization basics.

## Practice

- [ ] Check whether a file exists
- [ ] Create directories and inspect metadata
- [ ] Copy a binary file using byte streams
- [ ] Read and write text using Reader and Writer
- [ ] Use buffering for line-based reading
- [ ] Handle missing and corrupted files

## Mini-project

Build a File-Based Student Manager. Add, save, load, search, update and delete student records. Store data under `data/` and validate input.

## Compile and run

```bash
javac -d out/week11 $(find week-11-input-output/src -name "*.java")
java -cp out/week11 com.example.week11.ReadStudentsFile
```
