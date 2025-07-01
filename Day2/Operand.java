import javax.swing.*;
import java.awt.event.*;

public class Operand {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Operand Operation");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField txtOperand1 = new JTextField();
        txtOperand1.setBounds(50, 30, 130, 30);
        frame.add(txtOperand1);

        JTextField txtOperand2 = new JTextField();
        txtOperand2.setBounds(200, 30, 130, 30);
        frame.add(txtOperand2);

        JLabel lblResult = new JLabel("Result: ");
        lblResult.setBounds(50, 80, 300, 30);
        frame.add(lblResult);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(50, 130, 50, 30);
        frame.add(btnAdd);

        JButton btnSub = new JButton("-");
        btnSub.setBounds(110, 130, 50, 30);
        frame.add(btnSub);

        JButton btnMul = new JButton("*");
        btnMul.setBounds(170, 130, 50, 30);
        frame.add(btnMul);

        JButton btnDiv = new JButton("/");
        btnDiv.setBounds(230, 130, 50, 30);
        frame.add(btnDiv);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtOperand1.getText());
                int b = Integer.parseInt(txtOperand2.getText());
                lblResult.setText("Result: " + (a + b));
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtOperand1.getText());
                int b = Integer.parseInt(txtOperand2.getText());
                lblResult.setText("Result: " + (a - b));
            }
        });

        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtOperand1.getText());
                int b = Integer.parseInt(txtOperand2.getText());
                lblResult.setText("Result: " + (a * b));
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtOperand1.getText());
                int b = Integer.parseInt(txtOperand2.getText());
                if (b != 0)
                    lblResult.setText("Result: " + (a / b));
                else
                    lblResult.setText("Cannot divide by zero");
            }
        });

        frame.setVisible(true);
    }
}
