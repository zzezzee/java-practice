import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JTextField textField;
    private int currentNumber = 0;

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();

    }

    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        updateDisplay();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        frame.add(panel);

        for (int i = 0; i < 10; i += 1) {
            int number = (i + 1) % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event->{
//                currentNumber = number;
                updateDisplay();
            });
            panel.add(button);
        }

        frame.pack();
        frame.setVisible(true);
    }

    private void updateDisplay() {
        textField.setText(Integer.toString(currentNumber));
    }
}
