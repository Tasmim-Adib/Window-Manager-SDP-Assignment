package App;

import javax.swing.JFrame;

import App.Config.DetailedConfig;
import App.Config.SimpleConfig;
import App.ItemFactory.AbstractFactory;
import App.ItemFactory.Item;
import App.ItemFactory.ItemProducer;

import java.awt.Container;
import java.util.Scanner;

public class WindowManager extends JFrame {
    private static WindowManager instance = new WindowManager();


    public static Container container; 
    SimpleConfig simpleConfig;
    DetailedConfig detailedConfig;
    int nextChoice, designChoice;
    AbstractFactory itemFactory;

    //make the constructor private so that this class cannot be
    //instantiated
    private WindowManager(){
        initComponents();
    }
 
    //Get the only object available
    public static WindowManager getInstance(){
       return instance;
    }
 
    public void loadUI(){
        WindowManager frame = WindowManager.getInstance();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,700,600);
        frame.setTitle("Assignment 3");
        
    }
    private void initComponents() {
        container = this.getContentPane();
        container.setLayout(null);

        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("1. Simplistic Design");
        System.out.println("2. High Detailed Design");
        System.out.print("Enter your choice : ");
        designChoice = sc.nextInt();

        if(designChoice == 1){
            System.out.println("----You Choosed Simplistic Design---");

            System.out.println("1. Load From xml file");
            System.out.println("2. Load From config file");
            System.out.print("Enter your choice : ");
            nextChoice = sc.nextInt();

            if(nextChoice == 1){
                System.out.println("---Loaded from xml file---");
                simpleConfig = new SimpleConfig("xml");
            }
            else if(nextChoice == 2){
                System.out.println("---Loaded from config file---");
                simpleConfig = new SimpleConfig("config");
            }
            else{
                System.out.println("Wrong Choice");
                return;
            }
        }
        else if(designChoice == 2){
            System.out.println("----You Choosed High Detailed Design---");

            System.out.println("1. Load From xml file");
            System.out.println("2. Load From config file");
            System.out.print("Enter your choice : ");
            nextChoice = sc.nextInt();

            if(nextChoice == 1){
                System.out.println("---Loaded from xml file---");
                detailedConfig = new DetailedConfig("xml");
            }
            else if(nextChoice == 2){
                System.out.println("---Loaded from config file---");
                detailedConfig = new DetailedConfig("config");
            }
            else{
                System.out.println("Wrong Choice");
                return;
            }
        }
        else{
            System.out.println("Wrong Choice");
            return;
        }

        

        
        int i = 4;
        while(i > 0){
            if(designChoice == 1){
                if(nextChoice == 1){
                    simpleConfig.nextItemXml();
                    itemFactory = ItemProducer.getFcatory(true);
                }
                else if(nextChoice == 2){
                    simpleConfig.nextItem();
                    itemFactory = ItemProducer.getFcatory(true);
                }
                
                
            }
            else if(designChoice == 2){
                if(nextChoice == 1){
                    detailedConfig.nextItemXml();
                    itemFactory = ItemProducer.getFcatory(false);
                }
                else if(nextChoice == 2){
                    detailedConfig.nextItem();
                    itemFactory = ItemProducer.getFcatory(false);
                }
            }
            
            int a = Adapter.getId();

            if(a == 1){
                Item item1 = itemFactory.getItem("Button");
                item1.drawItem(container);
            }
            else if(a == 2){
                Item item1 = itemFactory.getItem("EditBox");
                item1.drawItem(container);
            }
            else if(a == 3){
                Item item1 = itemFactory.getItem("TextBox");
                item1.drawItem(container);
            } 
            else if(a == 4){
                Item item1 = itemFactory.getItem("RadioButton");
                item1.drawItem(container);
            }
            i--;    
        }
        
        
    }
}
