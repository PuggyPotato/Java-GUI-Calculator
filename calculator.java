import javax.swing.*;
import java.awt.Color;





public class calculator{
    public static void main(String[] args){
        JFrame frame = new JFrame("My Calculator!");
        JTextArea display = new JTextArea("");
        JRadioButton on = new JRadioButton("on");
        JRadioButton off = new JRadioButton("off");
        frame.setSize(400,600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        display.setBackground(Color.LIGHT_GRAY);
        display.setBounds(5,10,370,30);

        frame.getContentPane().setBackground(Color.gray);
        frame.add(display);
        
    }
}