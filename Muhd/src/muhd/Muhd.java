/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhd;

import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class Muhd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
           int marks = 0;
           Scanner read = new Scanner(System.in);
           
           //User input mark
           System.out.print("Enter marks : ");
           marks = read.nextInt();
           read.close();
           
           // Different output based on user input
           if (marks >= 85){
            System.out.println("Your grade is A");
        } 
           else if (marks >= 70 && marks <= 84) {
            System.out.println("Your grade is B");
        } 
           else if (marks >= 60 && marks <= 69) {
            System.out.println("Your grade is C");
        }
           else {
               System.out.println("You fail");}
    }
}
   
    
    

