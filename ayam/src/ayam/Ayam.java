/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayam;

/**
 *
 * @author muhammad
 */
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
public class Ayam extends JFrame {

    /**
     * @param args the command line arguments
     */
   private JLabel label1,label2 ;
    private JTextField textField1 ;
    private JButton plainButton,fancyButton;
    private JTextField TextA;
    private JTextArea Textbox1;
    private JRadioButton b1, b2, b3;
    private JCheckBox cb1, cb3 ;
    private JComboBox ComboBox;
    

public Ayam(){
      super("ultraman");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       label1 = new JLabel("Mad Long in the House");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(300,200);
       setVisible(true);}}

    

