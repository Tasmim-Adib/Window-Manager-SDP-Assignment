package App.ItemFactory.TextBox;

import App.Adapter;
import App.ItemFactory.Item;
import java.awt.Container;

import javax.swing.JLabel;

public class SimpleTextbox implements Item{

    private JLabel textBox;

    @Override
    public void drawItem(Container c) {
        textBox = new JLabel();
        textBox.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        textBox.setText(Adapter.getValue());
        c.add(textBox);
        
    }
    
}
