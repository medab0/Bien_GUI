package SimpleCalculator;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calculator extends JFrame{
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextArea taResult;
    private JButton btnCompute;
    private JComboBox<String> cbOperations;  // Specify the type parameter for JComboBox
    private JLabel lNumber2;
    private JLabel tfResult;
    private JLabel lNumber1;

    public Calculator() {


        btnCompute.addActionListener(e -> {

                double x = Double.parseDouble(tfNumber1.getText());
                double y = Double.parseDouble(tfNumber2.getText());
                String operation = (String) cbOperations.getSelectedItem();
                double result = 0;

                switch (operation) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    case "/":
                        if (y != 0) {
                            result = x / y;
                        } else {
                            JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                }

                taResult.append(String.valueOf(result));

        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator app = new Calculator();
            app.setContentPane(app.jpanel);
            app.setSize(600, 200);
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setVisible(true);
            app.setTitle("Simple Calculator");
        });
    }
}
