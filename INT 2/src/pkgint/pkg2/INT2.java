/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgint.pkg2;

/**
 *
 * @author muhammad
 */
 import java.util.Scanner;

public class pkgint.pkg2 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1, number2, number3;
        boolean validInput;

       
        do {
            System.out.print("Enter the first integer: ");
            validInput = scanner.hasNextInt();
            if (validInput) {
                number1 = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        } while (!validInput);

        
        do {
            System.out.print("Enter the second integer: ");
            validInput = scanner.hasNextInt();
            if (validInput) {
                number2 = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
        } while (!validInput);


        do {
            System.out.print("Enter the third integer: ");
            validInput = scanner.hasNextInt();
            if (validInput) {
                number3 = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        } while (!validInput);

        
        int max = Math.max(number1, Math.max(number2, number3));
        int min = Math.min(number1, Math.min(number2, number3));

        
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);

        scanner.close();
   }

