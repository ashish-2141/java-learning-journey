# Week 9 – Collections Framework

**Learning objective (derived):** Choose and use the right collection (List, Set, Queue/Deque, Map) for a problem.

## Block 1 – Why collections
Study: why collections exist; collection hierarchy; Collection; Iterable; Iterator; enhanced for-loop; generic collections.

## Block 2 – Lists
Study: ordered data; duplicates allowed; index-based access; ArrayList; LinkedList. Operations: add; get; update; remove; search; sort; iterate.
- [ ] Manage a list of students

## Block 3 – Sets
Study: unique values; HashSet; LinkedHashSet; TreeSet; ordering differences; importance of equals() and hashCode().
- [ ] Remove duplicate names
- [ ] Find unique words
- [ ] Compare two groups of students

## Block 4 – Queues and deques
Study: FIFO behaviour; Queue; Deque; ArrayDeque; PriorityQueue. Compare add()/offer(), remove()/poll(), element()/peek().
- [ ] Build a service-token queue

## Block 5 – Maps
Study: key-value storage; unique keys; HashMap; LinkedHashMap; TreeMap; keySet(); values(); entrySet(); getOrDefault(); putIfAbsent().
- [ ] Student ID to student
- [ ] Word-frequency counting
- [ ] Product ID to stock quantity
- [ ] Username to profile

## Block 6 – Collections utility class
- [ ] Practise Collections.sort(), reverse(), shuffle(), min(), max(), frequency(), and unmodifiable views

## Mini-project – Student Record Manager
Skeleton: `src/com/example/week09/records/`
- [ ] Store students in a list
- [ ] Prevent duplicate IDs using a map or set
- [ ] Search by ID
- [ ] Sort by marks
- [ ] Find the highest scorer
- [ ] Calculate class average
- [ ] Display students by grade

## Checkpoint (derived) – you should be able to explain:
- [ ] the Collection/Iterable hierarchy and how an Iterator works
- [ ] ArrayList vs LinkedList
- [ ] HashSet vs LinkedHashSet vs TreeSet, and why equals()/hashCode() matter
- [ ] add/offer, remove/poll, element/peek
- [ ] HashMap vs LinkedHashMap vs TreeMap, and how to iterate a map with entrySet()

## Saturday assessment
| A /20 | B /20 | C /20 | D /30 | E /10 | Total /100 | Pass? |
|---|---|---|---|---|---|---|
| | | | | | | |

## Compile and run
```bash
javac -d out/week09 $(find week-09-collections/src -name "*.java")
java -cp out/week09 com.example.week09.records.StudentRecordManager
```
```powershell
javac -d out\week09 (Get-ChildItem -Recurse -Filter *.java week-09-collections\src).FullName
java -cp out\week09 com.example.week09.records.StudentRecordManager
```
