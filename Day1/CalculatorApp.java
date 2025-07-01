import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;

public class CalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField display = new JTextField();
        display.setBounds(50, 40, 300, 50);
        frame.add(display);

        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", "C", "=", "+"
        };

        JPanel panel = new JPanel();
        panel.setBounds(50, 120, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cmd = button.getText();
                    if (cmd.equals("C")) {
                        display.setText("");
                    } else if (cmd.equals("=")) {
                        try {
                            display.setText(eval(display.getText()));
                        } catch (Exception ex) {
                            display.setText("Error");
                        }
                    } else {
                        display.setText(display.getText() + cmd);
                    }
                }
            });
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    public static String eval(String expr) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        Object result = engine.eval(expr);
        return result.toString();
    }
}
