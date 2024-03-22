package HomeOfDesignFrame;

import java.text.DecimalFormat;
import ClothingItemFrame.MensClothingItem;
import ClothingItemFrame.clothesType;

public class HomeOfDesign extends MensClothingItem
{
    /* 
     * статические переменные, 
     * которые будут общими для всех объектов
     * их можно использовать без создания объекта
     */
    private static String designer;
    private static String color;
    private static DecimalFormat decFormat = new DecimalFormat();
    private static double sumPrice = 0;
    private static int count = 0;

    private double price = 0;
    
    /* 
     * конструкторы класса, вызывающие 
     * конструкторы родительского класса
     * и добавляющие свои поля
     */
    HomeOfDesign(clothesType kind)
    {
        super(kind);
        count++;
    }

    HomeOfDesign(clothesType kind, String name)
    {
        super(kind, name);
        count++;
    }
    
    HomeOfDesign(clothesType kind, String name, String color)
    {
        super(kind, name);
        HomeOfDesign.color = color;
        count++;
    }
    
    HomeOfDesign(clothesType kind, String name, double price)
    {
        super(kind, name);
        this.price = price;
        HomeOfDesign.sumPrice += price;
        count++;
    }
    
    HomeOfDesign(clothesType kind, String name, String color, double price)
    {
        super(kind, name);
        HomeOfDesign.color = color;
        this.price = price;
        HomeOfDesign.sumPrice += price;
        count++;
    }
    

    /* 
     * статически форматируем строку decFormat
     * чтобы отформатировать каждую цену
     */
    static
    {
        decFormat.setMinimumFractionDigits(3);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(2);
        decFormat.setMaximumFractionDigits(2);
    }


    /* 
     * делаем геттеры и сеттеры 
     * для полей подкласса
     */
    public void setDesigner(String designer)
    {
        HomeOfDesign.designer = designer;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setColor(String color)
    {
        HomeOfDesign.color = color;
    }

    public String getDesigner()
    {
        return HomeOfDesign.designer;
    }

    public String getColor()
    {
        return HomeOfDesign.color;
    }

    public double getPrice()
    {
        return this.price;
    }

    public String getPriceString()
    {
        return decFormat.format(price);
    }
    
    /* 
     * два статических метода, которые
     * работают со статическими переменными
     */
    public static double getSumPrice()
    {
        return HomeOfDesign.sumPrice;
    }

    public static String getSumPriceString()
    {
        return decFormat.format(HomeOfDesign.sumPrice);
    }

    public void printCount()
    {
        System.out.println("Count of clothes in the collection: " + count);
    }
}
