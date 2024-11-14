/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg50;

/**
 *
 * @author muhammad
 */
   import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt(); // Read the number of students
        int passedCount = 0; // Initialize counters
        int failedCount = 0;

        // Loop through the number of students to get their results
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the result for student " + i + " (1 for pass, 0 for fail): ");
            int result = scanner.nextInt(); // Read the result (1 for pass, 0 for fail)
            
            // Update counters based on the result
            if (result == 1) {
                passedCount++;
            } else if (result == 0) {
                failedCount++;
            } else {
                System.out.println("Invalid input. Please enter 1 for pass or 0 for fail.");
                i--; // Decrement the counter to repeat the input for the current student
            }
        }

        scanner.close(); // Close the scanner

        // Output the number of students who passed and failed
        System.out.println("Number of students who passed: " + passedCount);
        System.out.println("Number of students who failed: " + failedCount);

        // Determine if more than 50% of students passed
        if (passedCount > numberOfStudents / 2) {
            System.out.println("Bonus to instructor");
        }
    }
}

    
    

