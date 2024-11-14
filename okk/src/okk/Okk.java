/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okk;

/**
 *
 * @author muhammad
 */
import java.util.Scanner;
public class Okk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String name;
       String id; 
       String subject;
       double test1 , test2;
       Scanner read = new Scanner(System.in);
 
        System.out.print("Enter student name: ");
         name = read.nextLine();
        
        System.out.print("Enter student ID: ");
         id = read.nextLine();
        
        System.out.print("Enter subject: ");
        subject = read.nextLine();
  
        System.out.print("Enter marks for Test 1 (/100): ");
          test1 = read.nextDouble();
        
        System.out.print("Enter marks for Test 2 (/100): ");
          test2 = read.nextDouble();
          read.close();
         
         double average = (test1 + test2) / 2;
     
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Subject: " +subject);
        System.out.println("Average Mark: " +average);
        
          
    
    }
    
}
