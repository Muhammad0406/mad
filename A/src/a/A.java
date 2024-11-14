/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

/**
 *
 * @author muhammad
 */import java.awt.*;
import javax.swing.*;

public class A extends JFrame {

    public A() {
        setTitle("Ultraman");
        setSize(400, 500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        DrawingPanel panel = new DrawingPanel();
        add(panel);  
        setVisible(true);
    }

  
    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

     
            g.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
            g.setColor(Color.BLACK);
            g.drawString("Ultraman", 140, 50);
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval(100, 100, 200, 250); 

            
            g.setColor(Color.YELLOW);
            g.fillOval(140, 160, 50, 50); 
            g.fillOval(210, 160, 50, 50); 

           
            g.setColor(Color.WHITE);
            g.fillOval(150, 170, 15, 15); 
            g.fillOval(220, 170, 15, 15); 

            
            g.setColor(Color.RED);
            g.fillRect(195, 100, 10, 250); 

        

            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(165, 350, 70, 40); 

           
            g.setColor(Color.CYAN);
            g.fillOval(180, 400, 40, 40);
        }
    }

    public static void main(String[] args) {
        new A(); // Create an instance of the A class
    }
}
