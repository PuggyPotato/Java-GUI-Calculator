import javax.swing.*;
import java.awt.Color;
import java.awt.Font;





public class calculator{
    public static void main(String[] args){
        JFrame frame = new JFrame("My Calculator!");
        JTextField display = new JTextField("12345");
        JRadioButton on = new JRadioButton("on");
        JRadioButton off = new JRadioButton("off");
        frame.setSize(400,600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);

        
        display.setBackground(Color.gray);
        display.setBounds(5,10,370,30);
        display.setEditable(false);
        display.setFont(new Font("Courier New",Font.PLAIN,18));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.white);
        display.setFocusable(false);
        display.setBorder(null);

        on.setBounds(350,50,50,50);
        on.setHorizontalTextPosition(SwingConstants.CENTER);
        on.setVerticalTextPosition(SwingConstants.TOP);
        on.setBorderPainted(false);
        on.setOpaque(false);
        on.setForeground(Color.WHITE);

        off.setBounds(320,50,50,50);
        off.setHorizontalTextPosition(SwingConstants.CENTER);
        off.setVerticalTextPosition(SwingConstants.TOP);
        off.setBorderPainted(false);
        off.setOpaque(false);
        off.setForeground(Color.WHITE);

        frame.getContentPane().setBackground(Color.darkGray);
        frame.add(display);
        frame.add(on);
        frame.add(off);
        
    }
}