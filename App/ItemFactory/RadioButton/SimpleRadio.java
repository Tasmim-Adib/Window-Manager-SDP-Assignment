package App.ItemFactory.RadioButton;

import App.Adapter;
import App.ItemFactory.Item;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class SimpleRadio implements Item{

    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup group;
    @Override
    public void drawItem(Container c) {
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        c.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(150,180,120,60);
        c.add(femaleRadioButton);

        group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);
        
    }
    
}
