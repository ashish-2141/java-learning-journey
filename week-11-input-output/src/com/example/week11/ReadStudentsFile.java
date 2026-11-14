package com.example.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * The BufferedReader example from Week 11, Block 4.
 * "throws IOException" was added to main so the snippet compiles on its own.
 */
public class ReadStudentsFile {
    public static void main(String[] args) throws IOException {
        // TODO: after the first run, move the file to data/ and use Path.of("data", "students.txt")
        try (BufferedReader reader =
                Files.newBufferedReader(Path.of("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
