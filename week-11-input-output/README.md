# Week 11 – Input and Output

**Learning objective (derived):** Read and write text and binary files safely, and choose the right input approach.
Plan example: `src/com/example/week11/ReadStudentsFile.java`

> **Where files go:** run programs from the repository root (IntelliJ does this by default) and read/write
> under `data/`, e.g. `Path.of("data", "students.txt")`. Git ignores the contents of `data/`.

## Block 1 – File, Path, Files
Study: File; modern Path; Files; file existence; directory creation; file metadata; relative and absolute paths.
Learn Path and Files too, because they are the cleaner modern APIs.

## Block 2 – Byte streams
Study: InputStream; OutputStream; FileInputStream; FileOutputStream. Use for images, PDFs, audio, other binary data.
- [ ] Binary file-copy program

## Block 3 – Character streams
Study: Reader; Writer; FileReader; FileWriter; character encoding basics.
- [ ] Text writer
- [ ] Text reader
- [ ] Line counter
- [ ] Character counter

## Block 4 – Buffered streams
Study: BufferedInputStream; BufferedOutputStream; BufferedReader; BufferedWriter; performance advantages.
- [ ] Run `ReadStudentsFile` (create `students.txt` first, then change it to read from `data/`)

## Block 5 – Data streams and console input
Study: DataInputStream; DataOutputStream; reading and writing primitives; Scanner; BufferedReader; `System.console()`.
- [ ] Compare the input approaches and write down when to use each

## Block 6 – Serialization
Study: Serializable; ObjectInputStream; ObjectOutputStream; serialVersionUID; transient; compatibility limitations; security concerns; why serialization should not be used blindly.

## Mini-project – File-Based Student Manager
Skeleton: `src/com/example/week11/filemanager/`
- [ ] Add students
- [ ] Save records
- [ ] Load records
- [ ] Search students
- [ ] Update records
- [ ] Delete records
- [ ] Handle missing or corrupted files
- [ ] Validate user input

## Checkpoint (derived) – you should be able to explain:
- [ ] File vs Path/Files, and relative vs absolute paths
- [ ] when to use byte streams versus character streams
- [ ] why buffering improves performance, and how try-with-resources closes files
- [ ] Scanner vs BufferedReader vs `System.console()`
- [ ] serialVersionUID, transient, and the risks of serialization

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week11 $(find week-11-input-output/src -name "*.java")
java -cp out/week11 com.example.week11.ReadStudentsFile
java -cp out/week11 com.example.week11.filemanager.FileStudentManager
```
```powershell
javac -d out\week11 (Get-ChildItem -Recurse -Filter *.java week-11-input-output\src).FullName
java -cp out\week11 com.example.week11.filemanager.FileStudentManager
```
