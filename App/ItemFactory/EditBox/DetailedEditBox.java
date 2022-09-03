package App.ItemFactory.EditBox;

import App.Adapter;
import App.ItemFactory.Item;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JTextField;

public class DetailedEditBox implements Item{

    private JTextField editBox;
    private Font font;
    @Override
    public void drawItem(Container c) {
        editBox = new JTextField();
        int a = Adapter.getFontStyle();
        if(a == 1){
            font = new Font(Adapter.getFontName(),Font.BOLD,Adapter.getFontSize());
        }
        else{
            font = new Font(Adapter.getFontName(),Font.ITALIC,Adapter.getFontSize());
        }
        editBox.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        editBox.setText(Adapter.getValue());
        editBox.setFont(font);
        editBox.setBackground(Color.BLUE);
        c.add(editBox);
    }
    
}
