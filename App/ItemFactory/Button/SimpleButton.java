package App.ItemFactory.Button;

import javax.swing.JButton;

import App.Adapter;
import App.ItemFactory.Item;
import java.awt.Container;

public class SimpleButton implements Item{
    public JButton button;

    @Override
    public void drawItem(Container c) {
        button = new JButton();
        button.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        button.setText(Adapter.getValue());
        c.add(button);
    }
    
}
