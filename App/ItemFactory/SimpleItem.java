package App.ItemFactory;

import App.ItemFactory.Button.SimpleButton;
import App.ItemFactory.EditBox.SimpleEditBox;
import App.ItemFactory.RadioButton.SimpleRadio;
import App.ItemFactory.TextBox.SimpleTextbox;


public class SimpleItem extends AbstractFactory{

    @Override
    public Item getItem(String itemType) {
        if(itemType.equalsIgnoreCase("Button")){
            return new SimpleButton();
       }
        else if(itemType.equalsIgnoreCase("TextBox")){
            return new SimpleTextbox();
        }
        else if(itemType.equalsIgnoreCase("EditBox")){
            return new SimpleEditBox();
        }
        else if(itemType.equalsIgnoreCase("RadioButton")){
            return new SimpleRadio();
        }
        return null;
    }
    
}
