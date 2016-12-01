/**
 * Created by robertprog on 01/12/2016.
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MrMadRobs amazing Calculator");
        JPanel back = new JPanel();
        JPanel front = new JPanel();
        back.setLayout(new BorderLayout(4,4));
        front.setLayout(new GridLayout(4,4,2,2));
        JLabel total = new JLabel("");
        final JTextField textField = new JTextField("0");
        final StringBuilder displayString = new StringBuilder("");
        final ArrayList<Integer> nums = new ArrayList<Integer>();

        textField.setEditable(false);

        JButton button_one = new JButton("1");
        JButton button_two = new JButton("2");
        JButton button_three = new JButton("3");
        JButton button_four = new JButton("4");
        JButton button_five = new JButton("5");
        JButton button_six = new JButton("6");
        JButton button_seven = new JButton("7");
        JButton button_eight = new JButton("8");
        JButton button_nine = new JButton("9");
        JButton button_zero = new JButton("0");
        JButton button_plus = new JButton("+");
        JButton button_multiply = new JButton("*");
        JButton button_divide = new JButton("/");
        JButton button_minus = new JButton("-");
        JButton button_clear = new JButton("C");
        JButton button_equals = new JButton("=");

        frame.add(back);
        back.add(total, BorderLayout.NORTH);
        back.add(textField, BorderLayout.NORTH);
        back.add(front, BorderLayout.SOUTH);

        front.add(button_one);
        front.add(button_two);
        front.add(button_three);
        front.add(button_plus);

        front.add(button_four);
        front.add(button_five);
        front.add(button_six);
        front.add(button_minus);

        front.add(button_seven);
        front.add(button_eight);
        front.add(button_nine);
        front.add(button_multiply);

        front.add(button_clear);
        front.add(button_zero);
        front.add(button_equals);
        front.add(button_divide);

        total.setHorizontalAlignment(JLabel.RIGHT);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("System Bold", Font.BOLD, 50));


        Dimension dm = new Dimension(500, 300);
        frame.setSize(dm);
        frame.setMinimumSize(dm);
        frame.setVisible(true);



    }
}
