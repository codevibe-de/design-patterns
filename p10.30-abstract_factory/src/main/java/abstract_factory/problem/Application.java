package abstract_factory.problem;

import abstract_factory.components.DefaultButton;
import abstract_factory.components.DefaultTextField;
import abstract_factory.components.SimpleButton;
import abstract_factory.components.SimpleTextField;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {
        // here we create instances of our "product family", i.e. the family consists of a Textfield and a Button
        JTextField textField = new DefaultTextField(20);
        JButton button = new DefaultButton("Press me");

        // if we want a different look, we need to change the concrete product class names:
        textField = new SimpleTextField(20);
        button = new SimpleButton("Press me");

        //
        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        final JTextField finalTextField = textField;
        button.addActionListener(e -> finalTextField.setText("World"));
        this.setBounds(100, 100, 400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}
