package App;

import java.awt.Color;

public class Adapter {
    private static String itemName,value,bgColor,fontName,fontStyle;
    private static int id, xCor,yCor,height,width,fontSize;
    public Adapter(int id, String itemName,String value,String bgColor,String fontName,int fontSize,String 
    fontStyle,int xCor,int yCor,int height,int width){
        Adapter.id = id;
        Adapter.itemName = itemName;
        Adapter.value = value;
        Adapter.bgColor = bgColor;
        Adapter.fontName = fontName;
        Adapter.fontSize = fontSize;
        Adapter.fontStyle = fontStyle;
        Adapter.xCor = xCor;
        Adapter.yCor = yCor;
        Adapter.height = height;
        Adapter.width = width;
    }
    public Adapter(){};
    public static void setItemName(String s){
        itemName = s;
    }
    public static String getItemName(){
        return itemName;
    }
    public static void setValue(String s){
        value = s;
    }
    public static String getValue(){
        return value;
    }
    public static void setbgColor(String s){
        bgColor = s;
    }
    public static String getbgColor(){
        return bgColor;
    }
    public static void setFontName(String s){
        fontName = s;
    }
    public static String getFontName(){
        return fontName;
    }
    public static void setFontStyle(String s){
        fontStyle = s;
    }
    public static int getFontStyle(){
        if(fontStyle.equalsIgnoreCase("Bold")){
            return 1;
        }
        else{
            return 2;
        }
    }
    public static void setXcor(int s){
        xCor = s;
    }
    public static int getXcor(){
        return xCor;
    }
    public static void setYcor(int s){
        yCor = s;
    }
    public static int getYcor(){
        return yCor;
    }
    public static void setHeight(int s){
        height = s;
    }
    public static int getHeight(){
        return height;
    }
    public static void setWidth(int s){
        width = s;
    }
    public static int getWidth(){
        return width;
    }
    public static void setFontSize(int s){
        fontSize = s;
    }
    public static int getFontSize(){
        return fontSize;
    }
    public static void setId(int s){
        id = s;
    }
    public static int getId(){
        return id;
    }

}
