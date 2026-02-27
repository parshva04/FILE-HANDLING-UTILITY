# FILE-HANDLING-UTILITY
*COMPANY* : CODTECH IT SOLUTIONS
*NAME* : PARSHVA SHAH
*INTERN ID* : CTIS4370
*DOMAIN* : JAVA
*DURATION* : 12 WEEKS
*MENTOR* : NEELA SANTOSH

### **Project Description: File Handling Utility in Java**  

This project, titled **"File Handling Utility"**, is an internship task assigned by CODTECH. The objective of this task is to develop a Java-based program that demonstrates fundamental file operations, including **reading, writing, and modifying** text files. The deliverable includes a well-structured Java script with clear documentation to illustrate file handling functionalities effectively.

### **Overview of the Workflow in IntelliJ IDEA**  

The development of this project was carried out in **Eclipse IDE**, a widely used Java IDE that provides powerful coding and debugging tools. The workflow followed in implementing the **File Handling Utility** can be broken down into several key stages:

---

### **1. Setting Up the Project**  
- **Step 1:** Opened **Eclipse IDE** and created a new Java project.  
- **Step 2:** Defined a new Java class named **FileHandlingUtility.java** and configured the environment to run the script.  

---

### **2. Writing the Java Program**  

The **FileHandlingUtility** program performs three key operations on a text file:  
1. **Writing Data to a File**  
2. **Reading Data from a File**  
3. **Modifying the File Content**  

---

#### **2.1 Writing Data to the File**  
The `writeFile()` method was implemented using **BufferedWriter** to write a predefined text into the file named `sample.txt`. The content written was:  

```
Hello, this is a sample text file.
This file will demonstrate file handling in Java.
```
The method works as follows:
- A `BufferedWriter` object is created using `FileWriter(FILE_PATH)`.
- The specified content is written to the file.
- The file stream is closed automatically due to the **try-with-resources** block.

```java
public static void writeFile(String content) throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
        writer.write(content);
    }
}
```

---

#### **2.2 Reading Data from the File**  
The `readFile()` method was implemented to read and display the file’s content using **BufferedReader**. The method:
- Opens the file for reading.
- Reads the file line by line using a `while` loop.
- Prints each line to the console.

```java
public static void readFile() throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
```

**Console Output:**
```
File Content:
Hello, this is a sample text file.
This file will demonstrate file handling in Java.
```

---

#### **2.3 Modifying the File Content**  
The `modifyFile()` method was implemented to replace a specific word in the file content. In this case, the word **"sample"** was replaced with **"example"**. This was achieved by:
- Reading all lines from the file using `Files.readAllLines(path)`.
- Iterating over the lines and replacing the target word.
- Writing the modified content back to the file using `Files.write(path, modifiedLines)`.

```java
public static void modifyFile(String target, String replacement) throws IOException {
    Path path = Paths.get(FILE_PATH);
    List<String> lines = Files.readAllLines(path);

    List<String> modifiedLines = new ArrayList<>();
    for (String line : lines) {
        modifiedLines.add(line.replace(target, replacement));
    }

    Files.write(path, modifiedLines);
}
```

---

### **3. Execution and Output**  

After implementing the functions, the **main method** was used to:
1. Write the original content to the file.
2. Read and display the file content.
3. Modify the file by replacing "sample" with "example."
4. Read and display the modified content.

#### **Execution Output in IntelliJ IDEA**  
The execution output from IntelliJ IDEA confirms that the operations were performed correctly:



- **Before modification:** The file contained `"Hello, this is a sample text file."`
- **After modification:** The word `"sample"` was changed to `"example"` in `"Hello, this is a example text file."`

---

### **4. Summary of the Work Done in IntelliJ IDEA**
- **Created a new Java project** in IntelliJ IDEA.
- **Implemented file operations** (writing, reading, modifying).
- **Ran the program** and verified the outputs.
- **Used IntelliJ's built-in terminal** to execute and debug the Java code.
- **Displayed console logs** confirming successful execution.

---

### **Conclusion**
The **File Handling Utility** program successfully demonstrates essential file operations in Java. It efficiently performs writing, reading, and modifying text files while ensuring **code readability and maintainability**. The structured approach taken in **IntelliJ IDEA** facilitated a seamless development and testing process. This project serves as a fundamental example of handling files in Java and provides a solid foundation for more advanced file-processing applications.
