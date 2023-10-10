package abstract_factory.problem;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {
        final JTextField textField = ComponentFactory.createTextField(10);
        final JButton button = ComponentFactory.createButton("press me");

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        button.addActionListener(e -> textField.setText("World"));
        this.setBounds(100, 100, 400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}
