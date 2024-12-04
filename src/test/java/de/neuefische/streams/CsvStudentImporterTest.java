package de.neuefische.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.stream.Stream;

public class CsvStudentImporterTest {

    @Test
    void importStudents_returnsStreamOfStudents () throws IOException {
        Stream<Student> s = CsvStudentImporter.importStudents("students.csv");
        long res = s.count();
        Assertions.assertEquals(5, res);
    }
}
