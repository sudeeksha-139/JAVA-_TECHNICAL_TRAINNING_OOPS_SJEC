import javax.swing.*;
public class LoginDemo {
    public static void main(String args[]){
        JFrame frame = new JFrame("LOGIN PAGE");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("USERNAME:");
        label.setBounds(100, 20, 100, 30);
        frame.add(label);

        JTextField field = new JTextField();
        field.setBounds(100, 60, 200, 30);
        frame.add(field);

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(100, 20, 100, 30);
        frame.add(label2);
        JTextField field2 = new JTextField();
        field2.setBounds(100, 60, 200, 30);
        frame.add(field2);
        
        JButton button = new JButton("Click Me");
        button.setBounds(100, 110, 150, 50);
        frame.add(button);

        frame.setVisible(true);
    }
}


    
