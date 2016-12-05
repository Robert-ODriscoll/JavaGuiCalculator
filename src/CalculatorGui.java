/**
 * Created by robertprog on 02/12/2016.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorGui extends JFrame{
    private static  Thread thread;
    private double temp;
    private double tempResult;
    String display = " ";
    private JButton button_zero;
    private JButton button_one;
    private JButton button_two;
    private JButton button_three;
    private JButton button_four;
    private JButton button_five;
    private JButton button_six;
    private JButton button_seven;
    private JButton button_eight;
    private JButton button_nine;
    private JButton button_plus;
    private JButton button_minus;
    private JButton button_multiply;
    private JButton button_divide;
    private JButton button_clear;
    private JButton button_equals;
    private JTextField displayResult;
    private Boolean plus = false;
    private Boolean minus = false;
    private Boolean multiply = false;
    private Boolean divide = false;
    public CalculatorGui(){
        JPanel frontPanel = new JPanel();
        frontPanel.setLayout(new GridLayout(4,4));
        frontPanel.add(button_one = new JButton("1"));
        frontPanel.add(button_two = new JButton("2"));
        frontPanel.add(button_three = new JButton("3"));
        frontPanel.add(button_plus = new JButton("+"));
        frontPanel.add(button_four = new JButton("4"));
        frontPanel.add(button_five = new JButton("5"));
        frontPanel.add(button_six = new JButton("6"));
        frontPanel.add(button_minus = new JButton("-"));
        frontPanel.add(button_seven = new JButton("7"));
        frontPanel.add(button_eight = new JButton("8"));
        frontPanel.add(button_nine = new JButton("9"));
        frontPanel.add(button_multiply = new JButton("X"));
        frontPanel.add(button_clear = new JButton("C"));
        frontPanel.add(button_zero = new JButton("0"));
        frontPanel.add(button_equals = new JButton("="));
        frontPanel.add(button_divide = new JButton("/"));
        JPanel backPanal = new JPanel();
        backPanal.setLayout(new FlowLayout());
        backPanal.add(displayResult = new JTextField(20));
        displayResult.setHorizontalAlignment(JTextField.RIGHT);
        displayResult.setEditable(false);
        displayResult.setFont(new Font("System Bold", Font.BOLD, 10));
        JPanel panal = new JPanel();
        panal.add(frontPanel, BorderLayout.SOUTH);
        panal.add(backPanal, BorderLayout.NORTH);
        add(panal);
        button_one.addActionListener(new one_push());
        button_two.addActionListener(new two_push());
        button_three.addActionListener(new three_push());
        button_four.addActionListener(new four_push());
        button_five.addActionListener(new five_push());
        button_six.addActionListener(new six_push());
        button_seven.addActionListener(new seven_push());
        button_eight.addActionListener(new eight_push());
        button_nine.addActionListener(new nine_push());
        button_zero.addActionListener(new zero_push());
        button_plus.addActionListener(new plus_push());
        button_minus.addActionListener(new minus_push());
        button_divide.addActionListener(new divide_push());
        button_multiply.addActionListener(new multiply_push());
        button_clear.addActionListener(new clear_push());
        button_equals.addActionListener(new equals_push());
    }
    class one_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "1");
        }
    }
    class two_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "2");
        }
    }
    class three_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "3");
        }
    }
    class four_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "4");
        }
    }
    class five_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "5");
        }
    }
    class six_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "6");
        }
    }
    class seven_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "7");
        }
    }
    class eight_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "8");
        }
    }
    class nine_push implements ActionListener{ public void actionPerformed(ActionEvent e){
            display = displayResult.getText();
            displayResult.setText(display + "9");
        }
    }
    class zero_push implements ActionListener{ public void actionPerformed(ActionEvent e){
        display = displayResult.getText();
        displayResult.setText(display + "0");
    }
    }
    class plus_push implements ActionListener {public void actionPerformed(ActionEvent e) {
        temp = Double.parseDouble(displayResult.getText());
        displayResult.setText("");
        plus = true;
    }
    }
    class minus_push implements ActionListener {public void actionPerformed(ActionEvent e) {
        temp = Double.parseDouble(displayResult.getText());
        displayResult.setText("");
        minus = true;
    }
    }
    class multiply_push implements ActionListener {public void actionPerformed(ActionEvent e) {
        temp = Double.parseDouble(displayResult.getText());
        displayResult.setText("");
        multiply = true;
    }
    }
    class divide_push implements ActionListener {public void actionPerformed(ActionEvent e) {
        temp = Double.parseDouble(displayResult.getText());
        displayResult.setText("");
        divide = true;
    }
    }
    class clear_push implements ActionListener {public void actionPerformed(ActionEvent e) {
        temp = Double.parseDouble(displayResult.getText());
        displayResult.setText("");
        plus = false;
        minus = false;
        divide = false;
        multiply = false;
        temp = 0;
        tempResult = 0;
    }
    }
    class equals_push implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tempResult = Double.parseDouble(displayResult.getText());
            if (plus == true) {
                tempResult = tempResult + temp;
            } else if (minus == true) {
                tempResult = tempResult - temp;
            } else if (multiply == true) {
                tempResult = tempResult * temp;
            } else if (divide == true) {
                tempResult = temp /tempResult;
            }
            displayResult.setText(Double.toString(tempResult));
            plus = false;
            minus = false;
            multiply = false;
            divide = false;
        }
    }
    public static void main( String args[] )
    {
        thread = new Thread() {
            public void run() {
                try {
                    String LookAndFeelDesign = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
                    UIManager.setLookAndFeel(LookAndFeelDesign);
                    CalculatorGui calculator = new CalculatorGui();
                    calculator.pack();
                    calculator.setLocationRelativeTo(null);
                    calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    calculator.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        synchronized (thread){
            thread.start();
        }

    }
}
