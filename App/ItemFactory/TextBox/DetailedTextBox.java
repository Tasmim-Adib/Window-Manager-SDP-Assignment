package App.ItemFactory.TextBox;

import App.Adapter;
import App.ItemFactory.Item;
import javafx.scene.paint.Color;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.Container;

public class DetailedTextBox implements Item{

    private JLabel textBox;
    private Font font;

    @Override
    public void drawItem(Container c) {
        textBox = new JLabel();
        int a = Adapter.getFontStyle();
        if(a == 1){
            font = new Font(Adapter.getFontName(),Font.BOLD,Adapter.getFontSize());
        }
        else{
            font = new Font(Adapter.getFontName(),Font.ITALIC,Adapter.getFontSize());
        }
        textBox.setBounds(Adapter.getXcor(),Adapter.getYcor(),Adapter.getWidth(),Adapter.getHeight());
        textBox.setText(Adapter.getValue());
        textBox.setFont(font);
        c.add(textBox);
        
    }
    
}
