package abstract_factory.components;

import javax.swing.*;

public class SimpleButton extends JButton {
    public SimpleButton(String text) {
        super(text);
        this.setBorder(null);
    }
}
