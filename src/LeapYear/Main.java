package LeapYear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField tfYear;
    private JLabel lInputYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public Main() {


        btnCheckYear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    int year = Integer.parseInt(tfYear.getText());

                    boolean isLeapYear = false;

                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            isLeapYear = (year % 400 == 0);
                        } else {
                            isLeapYear = true;
                        }
                    }

                    if (isLeapYear) {
                        JOptionPane.showMessageDialog(Main.this, "Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(Main.this, "Not a Leap Year");
                    }

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.setContentPane(app.jpanel);
            app.setSize(600, 300);
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setVisible(true);
            app.setTitle("Leap Year Checker");
        });
    }
}
