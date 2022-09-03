package App.ItemFactory.Button;

import App.Adapter;
import App.ItemFactory.Item;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;

public class DetailedButton implements Item{
    public JButton button;
    private Font font;

    @Override
    public void drawItem(Container c) {
        
        button = new JButton();
        int a = Adapter.getFontStyle();
        if(a == 1){
            font = new Font(Adapter.getFontName(),Font.BOLD,Adapter.getFontSize());
        }
        else{
            font = new Font(Adapter.getFontName(),Font.ITALIC,Adapter.getFontSize());
        }
        
        button.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        button.setText(Adapter.getValue());
        button.setBackground(Color.CYAN);
        button.setFont(font);
        c.add(button);
    }
    
}
