/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhd45;

import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class NewClass {
   public void tunjuklhpliss()
   {  Scanner read = new Scanner(System.in);
        
        int number1 = 0, number2 = 0, number3 = 0;
        boolean validInput;

       
        do {
            System.out.print("Enter the first integer: ");
            validInput =read.hasNextInt();
            if (validInput) {
                number1 = read.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                read.next();
            }
        } while (!validInput);

      
        do {
            System.out.print("Enter the second integer: ");
            validInput = read.hasNextInt();
            if (validInput) {
                number2 = read.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                read.next();
            }
        } while (!validInput);

       
        do {
            System.out.print("Enter the third integer: ");
            validInput = read.hasNextInt();
            if (validInput) {
                number3 = read.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                read.next(); 
            }
        } while (!validInput);

       
        int max = Math.max(number1, Math.max(number2, number3));
        
  maksaya mymaksaya = new maksaya();
     mymaksaya.terima();
       
        System.out.println("The maximum value is: " + max);
    

        read.close();
    }}
