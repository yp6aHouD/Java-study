
public class Temperature
{
    public enum TempScale
    {
        CELSIUS, FAHRENHEIT, KELVIN, RANKINE,
        NEWTON, LEIDEN
    };

    private double number;
    private TempScale scale;

    public Temperature() // конструктор класса по умолчанию
    {
        number = 0.0;
        scale = TempScale.CELSIUS;
    }

    public Temperature(Double number) // конструктор со значением температуры
    {
        this.number = number;
        scale = TempScale.CELSIUS;
    }

    public Temperature(TempScale scale) // конструктор со шкалой температуры
    {
        number = 0.0;
        this.scale = scale;
    }
    
    public Temperature(Double number, TempScale scale) // конструктор с обоими значениями
    {
        this.number = number;
        this.scale = scale;
    }

    public void setNumber(double number)
    {
        this.number = number;
    }

    public double getNumber()
    {
        return number;
    }

    public void setScale(TempScale scale)
    {
        this.scale = scale;
    }

    public TempScale getScale()
    {
        return scale;
    }


}