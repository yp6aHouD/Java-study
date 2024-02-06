import java.util.TooManyListenersException;

public class Temperature
{
    public enum TempScale
    {
        CELSIUS, FAHRENHEIT, KELVIN, RANKINE,
        NEWTON, DELISLE, LEIDEN
    };

    private double number;
    private TempScale scale;

    public Temperature()
    {
        number = 0.0;
        scale = TempScale.CELSIUS;
    }

    public Temperature(Double number)
    {
        this.number = number;
        scale = TempScale.CELSIUS;
    }

    public Temperature(TempScale scale)
    {
        number = 0.0;
        this.scale = scale;
    }
    
    public Temperature(Double number, TempScale scale)
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