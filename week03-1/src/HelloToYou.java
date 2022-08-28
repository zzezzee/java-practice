import javax.swing.*;
import java.awt.*;

public class HelloToYou {
    private String name;

    public static void main(String[] args) {
        HelloToYou helloWorld = new HelloToYou();
        helloWorld.run();
    }

    private void run() {
        JFrame frame = new JFrame(greetingMessage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        JLabel label = new JLabel(greetingMessage());
        frame.add(label);

        JTextField textField = new JTextField(10);
        frame.add(textField);

        JButton button = new JButton("입력");
        button.addActionListener(event->{
            name = textField.getText();
            label.setText(greetingMessage());
        });

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    private String greetingMessage() {
        return "Hello, " + name;
    }
}
