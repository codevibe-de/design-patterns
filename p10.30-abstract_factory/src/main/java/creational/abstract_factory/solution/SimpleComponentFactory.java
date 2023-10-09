package creational.abstract_factory.solution;

import creational.abstract_factory.components.SimpleButton;
import creational.abstract_factory.components.SimpleTextField;

import javax.swing.*;

public class SimpleComponentFactory implements ComponentFactory {

    @Override
    public JTextField createTextField(int length) {
        return new SimpleTextField(length);
    }

    @Override
    public JButton createButton(String text) {
        return new SimpleButton(text);
    }

}
