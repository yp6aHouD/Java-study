package HomeOfDesignFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import ClothingItemFrame.clothesType;
import java.awt.GridLayout;

public class HomeOfDesignFrame extends JFrame {
    public HomeOfDesignFrame()
    {
        /* 
         * добавляем массивы данных 
         * для удобного создания объектов
         * с разными характеристиками
         */
        clothesType[] types = {
                clothesType.BRIDGES, clothesType.COAT,
                clothesType.T_SHIRT, clothesType.JACKET,
                clothesType.SHORTS, clothesType.PANTS
        };
        String[] collections = {
                "Spring'23 collection", "Winter'24 collection",
                "Summer'24 collection", "Spring'24 collection",
                "Summer'24 collection", "Fall'23 collection"
        };
        String[] colors = {"BLUE", "RED", "GREEN", "YELLOW", "ORANGE", "BLACK"};
        double[] prices = {24.55, 124.99, 35.99, 78.99, 20.99, 34.99};
 
        /* 
         * создаем массив объектов и
         * заполняем первый объект данными + назначаем дизайнера
         */
        HomeOfDesign[] items = new HomeOfDesign[types.length];
        items[0] = new HomeOfDesign(types[0], collections[0], colors[0], prices[0]);
        items[0].setDesigner("ChenGuang");
        add(new JLabel(items[0].getDesigner()));
        add(new JLabel());
        add(new JLabel());
        add(new JLabel());
        addClothingToFrame(items[0]);
        
        /* 
        * заполняем остальные объекты данными и
        * добавляем их на фрейм
        */
        for (int num = 1; num < types.length; num++) {
            items[num] = new HomeOfDesign(types[num], collections[num], colors[num], prices[num]);
            addClothingToFrame(items[num]);
        }
        add(new JLabel(" ------"));
        add(new JLabel(" ------"));
        add(new JLabel(" ------"));
        add(new JLabel(" ------"));
        
        /* 
        * добавляем общую цену
        */
        add(new JLabel());
        add(new JLabel());
        add(new JLabel("Total price"));
        add(new JLabel(HomeOfDesign.getSumPriceString()));

        setTitle("Home of Design");
        setLayout(new GridLayout(9, 4, 4, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setSize(400, 200);
        setVisible(true);
    }

    void addClothingToFrame(HomeOfDesign clothObject) {
        add(new JLabel(" " + clothObject.getType().toString().toLowerCase()));
        add(new JLabel(" " + clothObject.getName()));
        add(new JLabel(" " + clothObject.getColor()));
        add(new JLabel(" " + clothObject.getPriceString()));
    }
}