package abstract_factory.solution;

import abstract_factory.components.DefaultButton;
import abstract_factory.components.DefaultTextField;

import javax.swing.*;

public class DefaultComponentFactory implements ComponentFactory {

    @Override
    public JTextField createTextField(int length) {
        return new DefaultTextField(length);
    }

    @Override
    public JButton createButton(String text) {
        return new DefaultButton(text);
    }

}
