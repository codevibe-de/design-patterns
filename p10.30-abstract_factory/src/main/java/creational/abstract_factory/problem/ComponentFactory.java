package creational.abstract_factory.problem;

import creational.abstract_factory.components.*;

import javax.swing.*;

public class ComponentFactory {

    private static final int type = 0;

    public static JTextField createTextField(int length) {
        switch (type) {
            case 0:
                return new SimpleTextField(length);
            case 1:
                return new DefaultTextField(length);
            case 2:
                return new OverdressedTextField(length);
            default:
                throw new RuntimeException();
        }
    }

    public static JButton createButton(String text) {
        switch (type) {
            case 0:
                return new SimpleButton(text);
            case 1:
                return new DefaultButton(text);
            case 2:
                return new OverdressedButton(text);
            default:
                throw new RuntimeException();
        }
    }
}
