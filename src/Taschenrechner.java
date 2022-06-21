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
        textField.setEditable(false);

                addButton = new JButton("+");
                subButton = new JButton("-");
                mulButton = new JButton("*");
                divButton = new JButton("/");
                decButton = new JButton(".");
                equButton = new JButton("=");
                delButton = new JButton("Delete");
                clrButton = new JButton("Clear");

                functionButtons[0] = addButton;
                functionButtons[1] = subButton;
                functionButtons[2] = mulButton;
                functionButtons[3] = divButton;
                functionButtons[4] = decButton;
                functionButtons[5] = equButton;
                functionButtons[6] = delButton;
                functionButtons[7] = clrButton;

                for(int i =0;i<8;i++){
                        functionButtons[i].addActionListener(this);
                        functionButtons[i].setFont(myFont);
                        functionButtons[i].setFocusable(false);

                }
                for(int i =0;i<10;i++){
                     numberButton[i] = new JButton(String.valueOf(i));
                        numberButton[i].addActionListener(this);
                        numberButton[i].setFont(myFont);
                        numberButton[i].setFocusable(false);

                }


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
