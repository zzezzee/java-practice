import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.run();
    }
    public void run() {
        JFrame frame = new JFrame("Hello, world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Hello!");
        frame.add(label);

        frame.setVisible(true);
    }
}
