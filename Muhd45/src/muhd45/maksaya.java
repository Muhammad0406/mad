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
public class maksaya {
    public void terima()
    {  Scanner read = new Scanner(System.in);
        
        int number1 = 0, number2 = 0, number3 = 0;
        boolean validInput;
do {
            
            validInput =read.hasNextInt();
            if (validInput) {
                number1 = read.nextInt();
            } else {
              
                read.next();
            }
        } while (!validInput);

      
        do {
            
            if (validInput) {
                number2 = read.nextInt();
            } else {
               
                read.next();
            }
        } while (!validInput);

       
        do {
            
            if (validInput) {
                number3 = read.nextInt();
            } else {
                
                read.next(); 
            }
        } while (!validInput);

      
      int min = Math.min(number1, Math.min(number2, number3));

    
              System.out.println("The minimum value is: " + min);

        read.close();
    }}

  
