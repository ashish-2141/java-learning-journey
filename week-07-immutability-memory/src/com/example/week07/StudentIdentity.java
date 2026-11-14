package com.example.week07;

public final class StudentIdentity {
    private final String studentId;
    private final String name;

    // Added so this file compiles: final fields must be assigned in a constructor.
    public StudentIdentity(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // TODO: apply the remaining Block 1 rules yourself:
    //  - add getters, and no setters
    //  - decide how to handle null arguments (Block 4: Objects.requireNonNull)
    //  - if you add mutable data later, copy it defensively and never expose it
}
