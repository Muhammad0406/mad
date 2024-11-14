/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter;

/**
 *
 * @author muhammad
 */
import java.util.Scanner;
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double MYR , USD , kg , g , km , m , rate, currency , mass ,distance  ;
        int choose = 0;
        Scanner read = new Scanner(System.in);
        
        //System Display the menu and read user input
        System.out.println("converter availabe :");
        System.out.println("1. currency (MYR - USD)");
        System.out.println("2. Mass (kg - g)");
        System.out.println("3. Distance (km - m)");
       
        
        System.out.print("Choose your converter :");
        choose = read.nextInt();
        
        
        // number of choice that display different output when user
        //enter the input
        switch(choose){
                case 1 -> {
                    System.out.print("Insert Amount/Quantity :");
                    currency = read.nextDouble();
                    rate = 4.467;
                    System.out.println( "RM"+currency + "   = "    + (currency * rate) + " USD");
                    break;
            }
        case 2 -> {
            System.out.print("Insert Amount/Quantity:");
            mass = read.nextDouble();
            g = 1000;
            System.out.println(mass+"Kg  = " +(mass * g)+ "g");
            break;
            }
        
        case 3 -> {
            System.out.print("Insert Amount/Quantity:");
            distance = read.nextDouble();
            m = 1000;
            System.out.println(distance+"km  = "+(distance * m)+ "m");
            break;
            }
        }
    }}
    
    
    
    
    

