/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okkl;

/**
 *
 * @author muhammad
 */
import java.util.Scanner;
public class Okkl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String item_name;
     double price;
     int quantity;
     double discount_rate;
   
     Scanner read = new Scanner(System.in);
     
     System.out.println("Please enter item name:");
     item_name = read.nextLine();
     
     System.out.println("Please enter  price:");
     price =  read.nextDouble();
     
     System.out.println("Please enter quantity");
     quantity = read.nextInt();
     
     System.out.println("Please enter discount rate");
     discount_rate = read.nextDouble();
     
     read.close();
     
        double totalPrice = price * quantity;
        double discount = totalPrice * (discount_rate / 100);
        double price_after_discount = totalPrice - discount;
        
        System.out.println("Item Name:" +item_name);
        System.out.println("Price:" + price);
        System.out.println("Quantity:" + quantity);
        System.out.println("Total Price:" + totalPrice);
        System.out.println("Discount Rate:" + discount_rate );
        System.out.println("Price After Discount:" +price_after_discount);
     
     
     
     
     
     
      
    }
    
}
