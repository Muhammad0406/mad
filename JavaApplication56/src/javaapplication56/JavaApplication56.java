/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication56;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaApplication56 extends JFrame implements ActionListener { 

    private JTextField display;
    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operation = "";
    private boolean startNewNumber = true;

    public JavaApplication56() {
        setTitle("insan yang lemah");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("calculator-icon.png").getImage());

        // Set the background color of the JFrame
        getContentPane().setBackground(Color.RED);

        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.YELLOW);
        display.setForeground(Color.RED);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        panel.setBackground(Color.RED); // Set background color for the panel

        String[] buttons = {
            "C", "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.setBackground(Color.YELLOW); // Button background color
            button.setForeground(Color.RED); // Button text color
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isDigit(keyChar) || keyChar == '.') {
                    actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, String.valueOf(keyChar)));
                } else if ("+-*/=".indexOf(keyChar) >= 0) {
                    actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, String.valueOf(keyChar)));
                }
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("0");
            firstNumber = secondNumber = 0;
            operation = "";
            startNewNumber = true;
            return;
        }

        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            firstNumber = Double.parseDouble(display.getText());
            operation = command;
            startNewNumber = true;
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(display.getText());
            switch (operation) {
                case "+":
                    display.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    display.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    display.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber != 0) {
                        display.setText(String.valueOf(firstNumber / secondNumber));
                    } else {
                        display.setText("Error");
                    }
                    break;
            }
            startNewNumber = true;
        } else {
            if (startNewNumber) {
                display.setText(command);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JavaApplication56::new);
    }
}

