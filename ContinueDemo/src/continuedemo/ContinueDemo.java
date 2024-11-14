/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuedemo;

/**
 *
 * @author muhammad
 */
public class ContinueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String searchMe = "I scream, you scream, we all scream for ice cream.";
        int max =searchMe.length();
        int numms = 0;
        int numss = 0;
        for (int i = 0;i<max;i++){
            if (searchMe.charAt(i)!='m')
                continue;
            numms++;}
        for (int b = 0;b<max;b++){
         if (searchMe.charAt(b)!='s')
                continue;        
            numss++;}
           
            
        System.out.println(max);
        System.out.println("Found "+ numms +"m's in the string.");
        System.out.println("Found "+ numss +"s's in the string.");
        }
    }
    

