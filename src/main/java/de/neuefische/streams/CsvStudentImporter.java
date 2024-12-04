package de.neuefische.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CsvStudentImporter {

    public static Stream<Student> importStudents(String filePath) throws IOException {
        try {
            return Files.lines(Paths.get(filePath))
                    .skip(1) // Skip the header line
                    .filter(line -> !line.trim().isEmpty())
                    .distinct()
                    .map(line -> {
                        String[] fields = line.split(",");
                        int id = Integer.parseInt(fields[0]);
                        String name = fields[1];
                        String postalCode = fields[2];
                        int age = Integer.parseInt(fields[3]);
                        return new Student(id, name, postalCode, age);
                    });

        } catch (IOException e) {
            e.printStackTrace();
            return Stream.empty();
        }
    }
}
