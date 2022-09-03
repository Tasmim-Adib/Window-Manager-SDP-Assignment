package App.ItemFactory;

import App.ItemFactory.Button.DetailedButton;
import App.ItemFactory.EditBox.DetailedEditBox;
import App.ItemFactory.RadioButton.DetailedRadio;
import App.ItemFactory.TextBox.DetailedTextBox;

public class DetailedItem extends AbstractFactory{

    @Override
    public Item getItem(String itemType) {
        if(itemType.equalsIgnoreCase("Button")){
            return new DetailedButton();
        }
        else if(itemType.equalsIgnoreCase("TextBox")){
            return new DetailedTextBox();
        }
        else if(itemType.equalsIgnoreCase("EditBox")){
            return new DetailedEditBox();
        }
        else if(itemType.equalsIgnoreCase("RadioButton")){
            return new DetailedRadio();
        }
        return null;
    }
    
}
