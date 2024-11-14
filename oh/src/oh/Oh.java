/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oh;

/**
 *
 * @author muhammad
 */
import java.util.Scanner;
public class Oh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    
        int birth_year, current_year;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Please enter birth year:");
        birth_year=read.nextInt();
        
        System.out.println("Please enter current year:");
        current_year=read.nextInt();
        read.close();
        
        int age = current_year - birth_year;
        System.out.println("Your age is " +age);
        
    }
    
}
