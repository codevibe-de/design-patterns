package abstract_factory.components;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class OverdressedTextField extends JTextField {

    private static final Font font = new Font("Arial", Font.BOLD, 20);

    public OverdressedTextField(int length) {
        super(length);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED),
                BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
        this.setFont(OverdressedTextField.font);

    }
}
