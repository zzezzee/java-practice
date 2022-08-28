import javax.swing.*;
import java.awt.*;

public class Calculator {
   private CoreCalculator coreCalculator;
    private JTextField textField;
    private JPanel panel;

    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    public void run() {
        coreCalculator = new CoreCalculator();

        textField = new JTextField(10);

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        updateDisplay(coreCalculator.getCurrentNumber());
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        frame.add(panel);

        initNumberButtons();
        initOperatorButtons();

        frame.pack();
        frame.setVisible(true);
    }

    private void initNumberButtons() {
        for (int i = 0; i < 10; i += 1) {
            int number = (i + 1) % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event ->{
                coreCalculator.addNumber(number);
                updateDisplay(coreCalculator.getCurrentNumber());
            });
            panel.add(button);
        }
    }

    public void initOperatorButtons() {
        for(String operator : coreCalculator.OPERATORS){
            JButton button = new JButton(operator);
            button.addActionListener(event->{
                coreCalculator.calculate();
                coreCalculator.updateOperator(operator);
                updateDisplay(coreCalculator.getAccumulator());
            });
            panel.add(button);
        }
    }

    public void updateDisplay(long number){
        textField.setText(Long.toString(number));
    }
}
