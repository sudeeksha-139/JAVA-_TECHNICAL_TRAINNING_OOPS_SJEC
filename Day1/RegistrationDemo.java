import javax.swing.*;
public class RegistrationDemo {
    public static void main(String args[])
    {
        JFrame frame = new JFrame("college registration page");
        frame.setSize(800,800);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Name");
        label.setBounds(100,20,100,30);
        frame.add(label);

        JTextField field = new JTextField();
        field.setBounds(200,20,100,30);
        frame.add(field);

        JLabel label2 = new JLabel("Email");
        label2.setBounds(100,70,100,30);
        frame.add(label2);

        JTextField field1 = new JTextField();
        field1.setBounds(200,70,200,30);
        frame.add(field1);
        frame.setVisible(true);

       JTextArea area = new JTextArea();
        area.setBounds(100, 120, 300, 100);
        frame.add(area);

    }
}
