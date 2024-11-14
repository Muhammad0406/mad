/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

/**
 *
 * @author muhammad
 */
class javaapplication51 {
    public static void main(String[] args) {}
    public  static void init() {
    // Assume number1, number2, and number3 are defined elsewhere in the class
    double number1 = 10.5;
    double number2 = 20.5;
    double number3 = 15.5;

    // Find the maximum of the three numbers
    double max = maximum(number1, number2, number3);

    // Use the maximum value as needed
    System.out.println("The maximum value is: " + max);
}

public static double  maximum(double x, double y, double z) {
    return Math.max(x, Math.max(y, z));
}
}


