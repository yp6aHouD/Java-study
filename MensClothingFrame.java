import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;


public class MensClothingFrame extends JFrame
{
    public MensClothingFrame()
    {
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

        MensClothingItem[] items = new MensClothingItem[types.length];
        for (int i = 0; i < types.length; i++) {
            items[i] = new MensClothingItem(types[i], collections[i]);
            addClothingStylesInfo(items[i]);
        }

        setTitle("Mens Clothing for Spring 2024");
        setLayout(new GridLayout(6, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }
    
    void addClothingStylesInfo(MensClothingItem style) {
        add(new JLabel(" " + style.getName()));
        add(new JLabel(" " + style.getType().toString().toLowerCase()));
    }
}
