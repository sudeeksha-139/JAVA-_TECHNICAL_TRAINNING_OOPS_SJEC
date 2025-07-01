import javax.swing.*;

public class Login{
    public static void main(String args[]) {
        JFrame frame = new JFrame("LOGIN PAGE");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("USERNAME:");
        label.setBounds(100, 20, 100, 30);
        frame.add(label);

        JTextField field = new JTextField();
        field.setBounds(200, 20, 200, 30);
        frame.add(field);

        JLabel label2 = new JLabel("PASSWORD:");
        label2.setBounds(100, 70, 100, 30);
        frame.add(label2);

        JPasswordField field2 = new JPasswordField();
        field2.setBounds(200, 70, 200, 30);
        frame.add(field2);

        JButton button = new JButton("Login");
        button.setBounds(180, 130, 100, 40);
        frame.add(button);

        frame.setVisible(true);
    }
}
