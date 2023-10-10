package abstract_factory.solution;

import javax.swing.*;

// this factory is our Point-Of-Contact for creating everything
public interface ComponentFactory {

    JTextField createTextField(int length);

    JButton createButton(String text);

}
