

enum clothesType
{
    BRIDGES, PANTS, T_SHIRT, JACKET, COAT, SHORTS
};

public class MensClothingItem
{
    private clothesType kind;
    private String name;

    public MensClothingItem(clothesType kind)
    {
        this.kind = kind;
        this.name = "No name, pls input using setter";
    }
    
    public MensClothingItem(clothesType kind, String name)
    {
        this.kind = kind;
        this.name = name;
    }

    public void setType(clothesType kind)
    {
        this.kind = kind;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public clothesType getType()
    {
        return kind;
    }

    public String getName()
    {
        return name;
    }
}