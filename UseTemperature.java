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

        out.println();
        
        TemperatureNice temp2 = new TemperatureNice(); // создание объекта в подклассе
        temp2.display();                               // с определенным методом display

        temp2 = new TemperatureNice(33.0);
        temp2.display();

        temp2 = new TemperatureNice(TemperatureNice.TempScale.KELVIN);
        temp2.display();

        temp2 = new TemperatureNice(24.5, TemperatureNice.TempScale.CELSIUS);
        temp2.display();
    }   
}
