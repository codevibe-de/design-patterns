package abstract_factory.components;

import javax.swing.*;
import java.awt.*;

public class OverdressedButton extends JButton {

    private static final Font font = new Font("Arial", Font.BOLD, 20);

    public OverdressedButton(String text) {
        super(text);
        this.setFont(OverdressedButton.font);
        this.setForeground(Color.red);
    }
}
