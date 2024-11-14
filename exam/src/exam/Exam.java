/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

/**
 *
 * @author muhammad
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Exam extends JFrame { 
 private JTextField[] numberFields;
    private JTextArea resultArea;
    /**
     * @param args the command line arguments
     */


    public Exam() {
        setTitle("Even Odd Checker");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numberFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            numberFields[i] = new JTextField(10);
            add(numberFields[i]);
        }

        JButton checkButton = new JButton("Check Even/Odd");
        add(checkButton);

        resultArea = new JTextArea(8, 30);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkEvenOdd();
            }
        });
    }

    private void checkEvenOdd() {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < numberFields.length; i++) {
            try {
                int num = Integer.parseInt(numberFields[i].getText());
                String result = (num % 2 == 0) ? "Even" : "Odd";
                results.append("Number " + (i + 1) + ": " + num + " is " + result + "\n");
            } catch (NumberFormatException e) {
                results.append("Number " + (i + 1) + ": Please enter a valid number.\n");
            }
        }
        resultArea.setText(results.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Exam checker = new  Exam();
            checker.setVisible(true);
        });
    }
}

