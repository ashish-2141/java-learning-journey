# Week 12: Integrated Final Project, Workflow and Task Manager

Build a console-based Workflow and Task Manager that combines the full 12-week Core Java syllabus. Keep it plain Java with no build tool or external libraries.

Package root: `com.example.workflow`.

## Core entities

- [ ] User: id, name, email, role
- [ ] Workflow: id, name, description, status and list of tasks
- [ ] Task: id, title, description, status, priority and assigned user ID

## Required features

- [ ] Clear class structure, names and comments
- [ ] Priority calculations, completion percentages and validation
- [ ] Menu-driven interface and input validation
- [ ] String validation, keyword search and reports
- [ ] Encapsulated models with constructors and controlled updates
- [ ] Safe null handling and sensible object lifecycles
- [ ] Custom exceptions for missing workflows/tasks, invalid transitions and duplicate IDs
- [ ] List, Map, Set and Queue where appropriate
- [ ] Generic `Repository<T, ID>` and specialised repositories
- [ ] Save and load records under `data/`, export reports and handle file errors

## Defend your project

- [ ] Explain every important design decision
- [ ] Build and defend the final project without copying a solution

## Compile and run

```bash
javac -d out/week12 $(find week-12-integrated-project/src -name "*.java")
java -cp out/week12 com.example.workflow.Main
```
