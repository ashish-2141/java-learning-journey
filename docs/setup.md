# Phase 0 – Environment Setup

## 1. Install

- [ ] **JDK 21** – Eclipse Temurin 21 (LTS) from https://adoptium.net/temurin/releases/?version=21
  - Windows: run the `.msi` and enable **"Set JAVA_HOME"** and **"Add to PATH"**,
    or run `winget install EclipseAdoptium.Temurin.21.JDK`
  - macOS: run the `.pkg`, or `brew install --cask temurin@21`
  - Linux (Debian/Ubuntu): `sudo apt install openjdk-21-jdk`, or the Adoptium package repository
- [ ] **IntelliJ IDEA** from https://www.jetbrains.com/idea/download/ . Since version 2025.3 there is a
      single installer. Its core Java features are free and need no subscription. The separate
      "Community Edition" download no longer exists.
- [ ] **Git** from https://git-scm.com/downloads (Windows: Git for Windows, which includes Git Bash
      and Git Credential Manager)
- [ ] **GitHub account** at https://github.com/signup
- [ ] Optional: **GitHub CLI** (`gh`) from https://cli.github.com – the simplest way to log in to GitHub
- [ ] Optional: Maven – not needed for this plan (see docs/after-week-12.md, topic 19)

## 2. Verify (open a NEW terminal after installing)

```bash
java -version
javac -version
git --version
```

Expected output (version numbers may be newer):

```text
openjdk version "21.0.13" ... LTS
OpenJDK Runtime Environment Temurin-21.0.13+... (build 21.0.13+...-LTS)
javac 21.0.13
git version 2.x.x
```

If you see `'javac' is not recognized` (Windows) or `command not found` (macOS/Linux), the JDK
is not on your PATH. Re-run the installer with the PATH option, then open a new terminal.

## 3. Open the repository in IntelliJ IDEA

1. **File → Open…** → select the `java-learning-journey` folder → **Trust Project**.
2. **File → Project Structure… → Project**: set **SDK** to 21 and **Language level** to 21.
   If 21 is not listed, use *Add SDK → Download JDK… → Version 21, Eclipse Temurin*.
3. In the **Project** tool window, right-click `week-01-basics/src` → **Mark Directory as → Sources Root**.
   The folder turns blue. Repeat for every `week-NN-*/src` folder.
   - If **Project Structure → Modules** is empty, click **+ → Import Module**, choose the repository folder,
     select *Create module from existing sources*, and accept the twelve detected `src` folders.
4. Open `HelloWorld.java` and click the green ▶ next to `main` → **Run**.
5. To pass command-line arguments: **Run → Edit Configurations… → Program arguments** (e.g. `Nischal`).

IntelliJ compiles into `out/`, which Git ignores.

## 4. Initial skills checklist

- [ ] Create a Java project
- [ ] Create a package
- [ ] Create a class
- [ ] Compile using `javac`
- [ ] Run using `java`
- [ ] Run programs through IntelliJ
- [ ] Read compilation errors
- [ ] Commit code with Git
