import javax.swing.*;
import java.awt.event.*;

class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField txtInput = new JTextField();
        txtInput.setBounds(50, 50, 150, 50);
        frame.add(txtInput);

        JLabel lblOutput = new JLabel("Hello World");
        lblOutput.setBounds(50, 170, 150, 50);
        frame.add(lblOutput);

        JButton btnSubmit = new JButton("submit");
        btnSubmit.setBounds(50, 110, 150, 50);
        frame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                lblOutput.setText(txtInput.getText());
            }
        });

        frame.setVisible(true);
    }
}
