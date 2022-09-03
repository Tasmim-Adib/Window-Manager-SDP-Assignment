package App.ItemFactory.RadioButton;

import App.Adapter;
import App.ItemFactory.Item;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class DetailedRadio implements Item{

    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup group;
    private Font font;

    @Override
    public void drawItem(Container c) {
        
        int a = Adapter.getFontStyle();
        if(a == 1){
            font = new Font(Adapter.getFontName(),Font.BOLD,Adapter.getFontSize());
        }
        else{
            font = new Font(Adapter.getFontName(),Font.ITALIC,Adapter.getFontSize());
        }
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        maleRadioButton.setFont(font);
        maleRadioButton.setBackground(Color.GREEN);
        c.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(150,180,120,60);
        femaleRadioButton.setFont(font);
        femaleRadioButton.setBackground(Color.RED);
        c.add(femaleRadioButton);

        group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);
        
    }
    
}
