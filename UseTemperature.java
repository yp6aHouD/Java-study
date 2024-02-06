import static java.lang.System.out;

public class UseTemperature
{
    public static void main(String[] args)
    {
        final String format = "%5.2f градусов по %s\n"; // заготовка для использования в printf
    
        Temperature temp = new Temperature(); 
        temp.setNumber(33.5);
        temp.setScale(Temperature.TempScale.FAHRENHEIT);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(32.0);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(Temperature.TempScale.CELSIUS);
        out.printf(format, temp.getNumber(), temp.getScale());

        temp = new Temperature(-273.0, Temperature.TempScale.KELVIN);
        out.printf(format, temp.getNumber(), temp.getScale());
    }    
}
