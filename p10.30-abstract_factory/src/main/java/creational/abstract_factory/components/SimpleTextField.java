package creational.abstract_factory.components;

import javax.swing.*;

public class SimpleTextField extends JTextField {
    public SimpleTextField(int length) {
        super(length);
        this.setBorder(null);
    }
}
