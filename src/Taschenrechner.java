import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Taschenrechner implements ActionListener {

        JFrame frame;
        JTextField textField;
        JButton[] numberButton = new JButton[10];
        JButton[] functionButtons= new JButton[8];
        JButton addButton,subButton,mulButton,divButton;
        JButton decButton, equButton, delButton, clrButton;
        JPanel panel;

        Font myFont = new Font ("Ink Free", Font.BOLD,30);
        double num1 = 0, num2 = 0, num3 = 0;
        char operator;

        Taschenrechner(){
        frame = new JFrame("Taschenrechner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        frame.add(textField);
        frame.setVisible(true);

        }

        public static void main (String[]args){
        Taschenrechner Calc = new Taschenrechner();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
}
