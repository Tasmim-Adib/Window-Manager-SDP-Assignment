package App.ItemFactory;

public class ItemProducer {
    public static AbstractFactory getFcatory(Boolean simple){
        if(simple){
            return new SimpleItem();
        }
        else{
            return new DetailedItem();
        }
    }
}
