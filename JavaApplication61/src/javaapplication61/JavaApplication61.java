/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication61;

/**
 *
 * @author muhammad
 */
import javax.swing.*;


 import javax.swing.JOptionPane; // Import JOptionPane
import java.util.Scanner; // Import Scanner

public class JavaApplication61 {




    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // Create Scanner object for input
        boolean proceed = true; // To control main loop

        while (proceed) { // Start loop that can continue or exit
            // Prompt the user to enter the number of students
            String studentCountStr = JOptionPane.showInputDialog("Please enter the number of students:");
            int numberOfStudents = 0; // Initialize variable to hold the number of students

            // Validate input for the number of students
            if (isNumeric(studentCountStr)) { // Check if the input is numeric
                numberOfStudents = Integer.parseInt(studentCountStr); // Convert string to integer
                // Check if the number is a positive integer
                if (numberOfStudents <= 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid positive number of students.");
                    continue; // Go back to the start of the loop if invalid
                }
            } else {
                // Show an error message if the input is not numeric
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a positive integer.");
                continue; // Go back to the start of the loop
            }

            // Create an array to hold the marks for each student
            int[] marks = new int[numberOfStudents];

            // Input marks for each student using JOptionPane
            for (int i = 0; i < numberOfStudents; i++) {
                String markStr = JOptionPane.showInputDialog("Enter marks for student " + (i + 1) + ":");

                // Validate marks input
                while (!isNumeric(markStr)) { // Keep asking for valid input until it is numeric
                    markStr = JOptionPane.showInputDialog("Invalid input! Please enter a valid mark for student " + (i + 1) + ":");
                }

                // Convert valid string input to an integer and store it in the marks array
                marks[i] = Integer.parseInt(markStr);
            }

            // Count grades
            int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0; // Initialize counters for each grade
            for (int mark : marks) { // Loop through each mark in the marks array
                if (mark >= 80) {
                    countA++; // Increment countA for grade A
                } else if (mark >= 70) {
                    countB++; // Increment countB for grade B
                } else if (mark >= 60) {
                    countC++; // Increment countC for grade C
                } else if (mark >= 50) {
                    countD++; // Increment countD for grade D
                } else {
                    countF++; // Increment countF for grade F
                }
            }

            // Prepare output
            StringBuilder result = new StringBuilder(); // Create a StringBuilder to construct the output
            result.append("Number of students with grade A: ").append(countA).append("\n");
            result.append("Number of students with grade B: ").append(countB).append("\n");
            result.append("Number of students with grade C: ").append(countC).append("\n");
            result.append("Number of students with grade D: ").append(countD).append("\n");
            result.append("Number of students with grade F: ").append(countF).append("\n");

            // Calculate number of students who passed and failed
            int passCount = countA + countB + countC; // Number of students who passed
            int failCount = countD + countF; // Number of students who failed

            // Append pass/fail information to the result
            result.append("Number of students who passed: ").append(passCount).append("\n");
            result.append("Number of students who failed: ").append(failCount).append("\n");

            // Determine instructor bonus
            if (passCount > failCount) {
                result.append("Bonus to instructor! Congratulations!(˵ •̀ ᴗ - ˵ ) ✧\n"); // Bonus message for instructor
            } else {
                result.append("No bonus to instructor.( ｡ • ᴖ • ｡)(˚ ˃̣̣̥⌓˂̣̣̥ )(｡>﹏<)\n"); // No bonus message
            }

            // Display results in console
            System.out.println(result.toString()); // Print the results

            // Option to continue or exit
            int option = JOptionPane.showConfirmDialog(null, "Do you want to continue this program?", "Continue", JOptionPane.YES_NO_OPTION);
            proceed = (option == JOptionPane.YES_OPTION); // Set proceed based on user's choice
        }

        System.out.println("Thank you for using the program!(⸝⸝ᵕᴗᵕ⸝⸝)"); // Thank you message
    }

    // Helper method to check if a string is numeric
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) { // Ensure string is not null or empty
            return false; // Not numeric
        }
        for (char c : str.toCharArray()) { // Loop through each character in the string
            if (!Character.isDigit(c)) { // Check if character is a digit
                return false; // Not numeric
            }
        }
        return true; // All characters are numeric
    }
}




    

