package App.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element; 

import App.Adapter;

public class DetailedConfig implements ConfigManager{

    private String filePath;
    private int count = 0,totalItem, simpleXmlCount = -1;
    private Properties prop;
    private int id,fSize, x, y, h, w;
    NodeList nodeList;


    public DetailedConfig(String fileName){
        if(fileName.equalsIgnoreCase("config")){
            filePath = "App/File/DetailedConfig.conf";

            try {
                FileInputStream propsInput = new FileInputStream(filePath);
                prop = new Properties();
    
                try {
                    prop.load(propsInput);
                    totalItem = Integer.parseInt(prop.getProperty("TotalItem"));
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if(fileName.equalsIgnoreCase("xml")){
            try {
                File file = new File("App/File/Detailed.xml");
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
                DocumentBuilder db = dbf.newDocumentBuilder();  
                Document doc = db.parse(file);  
                doc.getDocumentElement().normalize();  

                nodeList = doc.getElementsByTagName("item"); 
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }

    @Override
    public void nextItem() {
        
            count++;
            if(hasMoreItems()){
                String Id = prop.getProperty("Item" + String.valueOf(count)+"ID");
                String itemName = prop.getProperty("Item" + String.valueOf(count));
                String xCor = prop.getProperty("Item" + String.valueOf(count)+"X");
                String yCor = prop.getProperty("Item" + String.valueOf(count)+"Y");
                String height = prop.getProperty("Item" + String.valueOf(count)+"Height");
                String width = prop.getProperty("Item" + String.valueOf(count)+"Width");
                String value = prop.getProperty("Item" + String.valueOf(count)+"Value");
                String bgcolor = prop.getProperty("Item" + String.valueOf(count)+"BGColor");
                String fontName = prop.getProperty("Item" + String.valueOf(count)+"FontName");
                String fontStyle = prop.getProperty("Item" + String.valueOf(count)+"FontStyle");
                String fontSize = prop.getProperty("Item" + String.valueOf(count)+"FontSize");
                try {
                    id = Integer.parseInt(Id);
                    fSize = Integer.parseInt(fontSize);
                    x = Integer.parseInt(xCor);
                    y = Integer.parseInt(yCor);
                    h = Integer.parseInt(height);
                    w =  Integer.parseInt(width);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            Adapter adapter = new Adapter(id,itemName,value,bgcolor,fontName,fSize,fontStyle, x,y,h ,w);
            }

        
        
        
        
    }

    @Override
    public boolean hasMoreItems() {
        if(count <= totalItem)
                return true;
            return false;
        
    }

    @Override
    public void nextItemXml() {
        simpleXmlCount++;
        if(hasMoreItemsXml()){
            Node node = nodeList.item(simpleXmlCount);  
            
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) node;
                    String Id = eElement.getElementsByTagName("id").item(0).getTextContent();
                    String itemName = eElement.getElementsByTagName("name").item(0).getTextContent(); 
                    String xCor = eElement.getElementsByTagName("xcordinate").item(0).getTextContent();  
                    String yCor = eElement.getElementsByTagName("ycordinate").item(0).getTextContent();  
                    String height = eElement.getElementsByTagName("height").item(0).getTextContent();  
                    String width = eElement.getElementsByTagName("width").item(0).getTextContent();  
                    String value = eElement.getElementsByTagName("value").item(0).getTextContent();  
                    String bgcolor = eElement.getElementsByTagName("bgColor").item(0).getTextContent();
                    String fontName = eElement.getElementsByTagName("fontName").item(0).getTextContent();
                    String fontSize = eElement.getElementsByTagName("fontSize").item(0).getTextContent();
                    String fontStyle = eElement.getElementsByTagName("fontStyle").item(0).getTextContent();
                    try {
                        id = Integer.parseInt(Id);
                        fSize = Integer.parseInt(fontSize);
                        x = Integer.parseInt(xCor);
                        y = Integer.parseInt(yCor);
                        h = Integer.parseInt(height);
                        w =  Integer.parseInt(width);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    Adapter adapter = new Adapter(id,itemName,value,bgcolor,fontName,fSize,fontStyle, x,y,h ,w);
                }
        }
        
    }

    @Override
    public boolean hasMoreItemsXml() {
        if(simpleXmlCount <= 3){
            return true;
        }
        return false;
    }
    
}
