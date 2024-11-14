/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycalculator;

/**
 *
 * @author muhammad
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mycalculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Mycalculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (JButton button : functionButtons) {
            button.addActionListener(this);
            button.setFont(myFont);
            button.setFocusable(false);
            button.setForeground(Color.WHITE); // Set font color to white
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setForeground(Color.WHITE); // Set font color to white
        }

        // Set button colors
        Color blueColor = Color.BLUE;
        Color orangeColor = Color.ORANGE;
        Color blackColor = Color.BLACK;

        for (int i = 0; i < 3; i++) {
            numberButtons[i + 1].setBackground(blueColor); // Buttons 1, 2, 3
            numberButtons[i + 4].setBackground(blueColor); // Buttons 4, 5, 6
            numberButtons[i + 7].setBackground(blueColor); // Buttons 7, 8, 9
        }
        numberButtons[0].setBackground(blueColor); // Button 0

        addButton.setBackground(orangeColor);
        subButton.setBackground(orangeColor);
        mulButton.setBackground(orangeColor);
        divButton.setBackground(orangeColor);
        decButton.setBackground(blackColor);
        equButton.setBackground(orangeColor);
        delButton.setBackground(orangeColor);
        clrButton.setBackground(orangeColor);
        negButton.setBackground(blackColor);

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Mycalculator calc = new Mycalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            for (int i = 0; i < 10; i++) {
                if (e.getSource() == numberButtons[i]) {
                    textfield.setText(textfield.getText().concat(String.valueOf(i)));
                }
            }

            if (e.getSource() == decButton && !textfield.getText().contains(".")) {
                textfield.setText(textfield.getText().concat("."));
            }

            if (e.getSource() == addButton) {
                performOperation('+');
            } else if (e.getSource() == subButton) {
                performOperation('-');
            } else if (e.getSource() == mulButton) {
                performOperation('*');
            } else if (e.getSource() == divButton) {
                performOperation('/');
            } else if (e.getSource() == equButton) {
                calculateResult();
            } else if (e.getSource() == clrButton) {
                clearCalculator();
            } else if (e.getSource() == delButton) {
                deleteLastCharacter();
            } else if (e.getSource() == negButton) {
                toggleNegative();
            }
        } catch (NumberFormatException ex) {
            textfield.setText("Error");
        }
    }

    private void performOperation(char operation) {
        num1 = Double.parseDouble(textfield.getText());
        operator = operation;
        textfield.setText("");
    }

    private void calculateResult() {
    num2 = Double.parseDouble(textfield.getText());
    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                textfield.setText("Error");
                return;
            }
            break;
        }
        textfield.setText(String.valueOf(result));
        num1 = result; // Prepare for the next operation
    }

    private void clearCalculator() {
        textfield.setText("");
        num1 = 0;
        num2 = 0;
        result = 0;
        operator = '\0'; // Reset operator
    }

    private void deleteLastCharacter() {
        String string = textfield.getText();
        if (string.length() > 0) {
            textfield.setText(string.substring(0, string.length() - 1));
        }
    }

    private void toggleNegative() {
        double temp = Double.parseDouble(textfield.getText());
        textfield.setText(String.valueOf(temp * -1));
    }
}
