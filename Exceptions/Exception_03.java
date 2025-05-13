package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// throws
public class Exception_03 {
    public static void main(String[] args) {
        try {
            readFile("data.txt"); // Method that declares an exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method that declares it may throw an exception
    static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        System.out.println("Reading file...");
    }
}

