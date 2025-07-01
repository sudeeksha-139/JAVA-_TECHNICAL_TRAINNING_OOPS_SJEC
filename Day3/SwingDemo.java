import java.awt.event.*; 
import javax.swing.*;

public class SwingDemo {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] genderOptions = {"Select Gender", "Male", "Female"};
        JComboBox<String> cmbGender = new JComboBox<>(genderOptions);
        cmbGender.setBounds(50, 50, 150, 50);
        frame.add(cmbGender);

        JButton btnDisplay = new JButton("Display");
        btnDisplay.setBounds(50, 120, 150, 50);
        frame.add(btnDisplay);

        JTextField txtOutput = new JTextField();
        txtOutput.setBounds(50, 190, 200, 50);
        frame.add(txtOutput);

        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String gender = (String) cmbGender.getSelectedItem();
                if (gender.equals("Male")) {
                    txtOutput.setText("Male is selected");
                } else if (gender.equals("Female")) {
                    txtOutput.setText("Female is selected");
                } else {
                    txtOutput.setText("No option selected");
                }
            }
        });

        String[] columns = {"USN", "NAME", "MARKS"};
        String[][] data = {
            {"101", "Varun", "100"},
            {"102", "John", "99"},
            {"103", "David", "98"}
        };

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 260, 380, 100);
        frame.add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Edit");
        JMenuItem menuSaveAs = new JMenuItem("Save As");
        JMenuItem menuOpen = new JMenuItem("Open");
        JMenuItem menuSave = new JMenuItem("Save");

        menu.add(menuOpen);
        menu.add(menuSave);
        menu.add(menuSaveAs);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
