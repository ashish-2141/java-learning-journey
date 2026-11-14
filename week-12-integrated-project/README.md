# Week 12 – Integrated Final Project: Console-Based Workflow and Task Manager

This project combines the entire syllabus without requiring Spring Boot yet.
Package root: `com.example.workflow` (`model`, `repository`, `exception`, `service`, `storage`, `ui`, plus `Main`).
It uses no build tool. Maven is optional, and only after you study it (post-12 topic 19).

## Core entities
- [ ] **User**: id, name, email, role
- [ ] **Workflow**: id, name, description, status, list of tasks
- [ ] **Task**: id, title, description, status, priority, assignedUserId

## Required features
**Java basics**
- [ ] Correct program structure
- [ ] Clear naming
- [ ] Proper comments
- [ ] Package organisation

**Primitive types and operators**
- [ ] Priority calculations
- [ ] Completion percentages
- [ ] Validation conditions
- [ ] Counters and statistics

**Control flow**
- [ ] Menu-driven application
- [ ] Input validation
- [ ] Search loops
- [ ] Status selection

**Arrays and strings**
- [ ] String validation
- [ ] Keyword search
- [ ] Reports
- [ ] Text formatting

**OOP and encapsulation**
- [ ] Private fields
- [ ] Constructors
- [ ] Getters
- [ ] Controlled updates
- [ ] Immutable IDs where appropriate

**Memory awareness**
- [ ] Avoid unnecessary static collections
- [ ] Handle null references safely
- [ ] Remove unused object references where applicable

**Exceptions**
- [ ] WorkflowNotFoundException
- [ ] TaskNotFoundException
- [ ] InvalidStatusTransitionException
- [ ] DuplicateIdException

**Collections**
- [ ] List for ordered tasks
- [ ] Map for workflow lookup
- [ ] Set for unique tags
- [ ] Queue for pending work

**Generics**
- [ ] Repository<T, ID>
- [ ] WorkflowRepository
- [ ] TaskRepository
- [ ] UserRepository

**Input/output**
- [ ] Save records to files (under `data/`)
- [ ] Load records on startup
- [ ] Export workflow reports
- [ ] Handle file errors safely

## Defend your project (from the mastery checklist)
- [ ] I can explain every important design decision
- [ ] I can build and defend the final project

## Compile and run
```bash
javac -d out/week12 $(find week-12-integrated-project/src -name "*.java")
java -cp out/week12 com.example.workflow.Main
```
```powershell
javac -d out\week12 (Get-ChildItem -Recurse -Filter *.java week-12-integrated-project\src).FullName
java -cp out\week12 com.example.workflow.Main
```
