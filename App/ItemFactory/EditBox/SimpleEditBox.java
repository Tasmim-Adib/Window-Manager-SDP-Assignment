package App.ItemFactory.EditBox;
import java.awt.Container;

import javax.swing.JTextField;

import App.Adapter;
import App.ItemFactory.Item;

public class SimpleEditBox implements Item{
    private JTextField editBox;
    
    @Override
    public void drawItem(Container c) {
        editBox = new JTextField();
        editBox.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        editBox.setText(Adapter.getValue());
        c.add(editBox);
        
    }
    
}
