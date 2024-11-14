/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continueexample;

/**
 *
 * @author muhammad
 */
public class ContinueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numbers 1- 10");
        for(int i =1;i<=10;i++){
            if (i==5)
                continue;//skip remaining code in loop when i is 5
            System.out.println(i+"\t");}
        System.out.println("Skip printing 5");}}
    
    
