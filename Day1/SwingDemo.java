import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Java Application");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter Text:");
        label.setBounds(100, 20, 100, 30);
        frame.add(label);

        JTextField field = new JTextField();
        field.setBounds(100, 60, 200, 30);
        frame.add(field);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 110, 150, 50);
        frame.add(button);

        frame.setVisible(true);
    }
}
