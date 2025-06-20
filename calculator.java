import javax.swing.*;
import java.awt.Color;





public class calculator{
    public static void main(String[] args){
        JFrame frame = new JFrame("My Calculator!");
        JTextArea display = new JTextArea("");
        frame.setSize(1000,2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        display.setBackground(Color.LIGHT_GRAY);
        display.setBounds(10,20,950,80);

        frame.getContentPane().setBackground(Color.gray);
        frame.add(display);
        
    }
}