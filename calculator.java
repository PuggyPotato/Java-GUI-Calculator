import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;







public class calculator{
    static boolean isOn = true;
    public static void main(String[] args){
        ButtonGroup group = new ButtonGroup();


        JFrame frame = new JFrame("My Calculator!");
        JTextField display = new JTextField("12345");
        JRadioButton on = new JRadioButton("on");
        JRadioButton off = new JRadioButton("off");

        JButton zeroButton = new JButton("0");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton resetButton = new JButton("C");
        JButton equalButton = new JButton("=");
        JButton decimalButton = new JButton(".");

        final StringBuilder expression = new StringBuilder();

        group.add(on);
        group.add(off);


        frame.setSize(400,600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);

        
        display.setBackground(Color.gray);
        display.setBounds(5,10,370,50);
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

        on.addActionListener(e ->{
            isOn = true;
            System.out.println(isOn);
            display.setVisible(true);
        });

        off.setBounds(320,50,50,50);
        off.setHorizontalTextPosition(SwingConstants.CENTER);
        off.setVerticalTextPosition(SwingConstants.TOP);
        off.setBorderPainted(false);
        off.setOpaque(false);
        off.setForeground(Color.WHITE);

        off.addActionListener(e ->{
            isOn = false;
            System.out.println(isOn);
            display.setVisible(false);
        });

        sevenButton.setBounds(20,110,100,70);
        eightButton.setBounds(140,110,100,70);
        nineButton.setBounds(260,110,100,70);
        fourButton.setBounds(20,200,100,70);
        fiveButton.setBounds(140,200,100,70);
        sixButton.setBounds(260,200,100,70);
        oneButton.setBounds(20,290,100,70);
        twoButton.setBounds(140,290,100,70);
        threeButton.setBounds(260,290,100,70);
        zeroButton.setBounds(20,380,100,70);

        equalButton.setBounds(140,380,100,70);
        resetButton.setBounds(260,380,100,70);

        plusButton.setBounds(20,470,50,50);
        minusButton.setBounds(90,470,50,50);
        multiplyButton.setBounds(160,470,50,50);
        divideButton.setBounds(230,470,50,50);
        decimalButton.setBounds(300,470,60,50);

        

        frame.getContentPane().setBackground(Color.darkGray);
        frame.add(display);
        frame.add(on);
        frame.add(off);

        zeroButton.addActionListener(e ->{
            expression.append("0");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        oneButton.addActionListener(e ->{
            expression.append("1");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        twoButton.addActionListener(e ->{
            expression.append("2");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        threeButton.addActionListener(e ->{
            expression.append("3");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        fourButton.addActionListener(e ->{
            expression.append("4");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        fiveButton.addActionListener(e ->{
            expression.append("5");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        sixButton.addActionListener(e ->{
            expression.append("6");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        sevenButton.addActionListener(e ->{
            expression.append("7");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        eightButton.addActionListener(e ->{
            expression.append("8");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        nineButton.addActionListener(e ->{
            expression.append("9");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        plusButton.addActionListener(e ->{
            expression.append("+");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        minusButton.addActionListener(e ->{
            expression.append("-");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        multiplyButton.addActionListener(e ->{
            expression.append("*");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        divideButton.addActionListener(e ->{
            expression.append("/");
            System.out.println(expression);
            display.setText(expression.toString());
        });
        resetButton.addActionListener(e ->{
            expression.setLength(0);
            System.out.println(expression);
            display.setText(expression.toString());
        });
        decimalButton.addActionListener(e ->{
            expression.append(".");
            display.setText(expression.toString());
        });

        equalButton.addActionListener(e -> {
            try{
                Expression exp = new ExpressionBuilder(expression.toString()).build();
                double result = exp.evaluate();
                display.setText(String.valueOf(result));
                expression.setLength(0);
                expression.append(result);
            }catch (Exception ex) {
                display.setText("Error!");
                expression.setLength(0);
            }
        });



        
        frame.add(zeroButton);
        frame.add(oneButton);
        frame.add(twoButton);
        frame.add(threeButton);
        frame.add(fourButton);
        frame.add(fiveButton);
        frame.add(sixButton);
        frame.add(sevenButton);
        frame.add(eightButton);
        frame.add(nineButton);
        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resetButton);
        frame.add(equalButton);
        frame.add(decimalButton);
        

    }
}