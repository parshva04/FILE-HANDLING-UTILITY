import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileHandlingUtility {
    private static final String FILE_PATH = "sample.txt";

    public static void main(String[] args) {
        try {
            // Write content to the file
            writeFile("Hello, this is a sample text file.\nThis file will demonstrate file handling in Java.");

            // Read and display file content
            System.out.println("File Content:");
            readFile();

            // Modify the file content
            modifyFile("sample", "example");

            // Display modified file content
            System.out.println("\nModified File Content:");
            readFile();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to write to a file
    public static void writeFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
        }
    }

    // Method to read from a file
    public static void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Method to modify file content (replace a word)
    public static void modifyFile(String target, String replacement) throws IOException {
        Path path = Paths.get(FILE_PATH);
        List<String> lines = Files.readAllLines(path);

        List<String> modifiedLines = new ArrayList<>();
        for (String line : lines) {
            modifiedLines.add(line.replace(target, replacement));
        }

        Files.write(path, modifiedLines);
    }
}