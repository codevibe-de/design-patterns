package abstract_factory.solution;

import javax.swing.*;

public interface ComponentFactory {

    JTextField createTextField(int length);

    JButton createButton(String text);

}
