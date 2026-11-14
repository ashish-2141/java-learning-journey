# Phase 0 – Environment Setup

## Install

- JDK 21 (Eclipse Temurin): https://adoptium.net/temurin/releases/?version=21
- IntelliJ IDEA: https://www.jetbrains.com/idea/download/
- Git: https://git-scm.com/downloads
- GitHub account: https://github.com/signup
- Optional: GitHub CLI: https://cli.github.com
- Maven is optional and is not needed for this plan.

## Verify your tools

```bash
git --version
java -version
javac -version
```

Use JDK 21 for this course so the `main` method examples match the syllabus.

## Open the project in IntelliJ IDEA

1. Extract or clone this repository.
2. Open the `java-learning-journey` root folder.
3. In the Project panel, right-click each `week-NN-*/src` folder.
4. Choose **Mark Directory as → Sources Root**.
5. Set the Project SDK to JDK 21.
6. Open a class with a `main` method and click Run.

## Compile and run from the terminal

Run commands from the repository root. Example for Week 1:

```bash
javac -d out/week01 $(find week-01-basics/src -name "*.java")
java -cp out/week01 com.example.week01.HelloWorld
```

Windows PowerShell:

```powershell
javac -d out\week01 (Get-ChildItem -Recurse -Filter *.java week-01-basics\src).FullName
java -cp out\week01 com.example.week01.HelloWorld
```

## Initial skills checklist

- [ ] Create a Java project
- [ ] Create a package
- [ ] Create a class
- [ ] Compile using `javac`
- [ ] Run using `java`
- [ ] Run programs through IntelliJ
- [ ] Read compilation errors
- [ ] Commit code with Git
