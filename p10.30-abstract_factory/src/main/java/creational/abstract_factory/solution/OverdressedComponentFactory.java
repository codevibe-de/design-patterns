package creational.abstract_factory.solution;


import creational.abstract_factory.components.OverdressedButton;
import creational.abstract_factory.components.OverdressedTextField;

import javax.swing.*;

public class OverdressedComponentFactory implements ComponentFactory {

    @Override
    public JTextField createTextField(int length) {
        return new OverdressedTextField(length);
    }

    @Override
    public JButton createButton(String text) {
        return new OverdressedButton(text);
    }

}
