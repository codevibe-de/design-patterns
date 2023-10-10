package abstract_factory.solution;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application(String argType) {
        ComponentType componentType = ComponentType.valueOf(argType);
        final ComponentFactory factory = getComponentFactory(componentType);

        final JTextField textField = factory.createTextField(10);
        final JButton button = factory.createButton("press me");

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        button.addActionListener(e -> textField.setText("World"));
        this.setBounds(100, 100, 400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static ComponentFactory getComponentFactory(ComponentType componentType) {
        return switch (componentType) {
            case SIMPLE -> new SimpleComponentFactory();
            case DEFAULT -> new DefaultComponentFactory();
            case OVERDRESSED -> new OverdressedComponentFactory();
        };
    }

    public static void main(String[] args) {
        // the first program-argument defines the family variant, e.g. "SIMPLE" or "DEFAULT"
        new Application(args.length == 0 ? ComponentType.DEFAULT.name() : args[0]);
    }
}
