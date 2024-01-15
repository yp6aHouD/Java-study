import static java.lang.System.out;
import java.util.Scanner;

public class Months_days_switch
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String month = keyboard.next();
        String leap_year_or_not = keyboard.next();
        boolean leap;

        if (leap_year_or_not.equals("да") || 
            leap_year_or_not.equals("Да")) leap = true;
        else leap = false;

        switch (month)
        {
            case "Январь":
                out.println("31 день");
                break;
            case "Февраль":
                if (leap) out.println("29 дней");
                else out.println("28 дней");
                break;
            case "Март":
                out.println("31 день");
                break;
            case "Апрель":
                out.println("30 дней");
                break;
            case "Май":
                out.println("31 день");
                break;
            case "Июнь":
                out.println("30 дней");
                break;
            case "Июль":
                out.println("31 день");
                break;
            case "Август":
                out.println("31 день");
                break;
            case "Сентябрь":
                out.println("30 дней");
                break;
            case "Октябрь":
                out.println("31 день");
                break;
            case "Ноябрь":
                out.println("30 дней");
                break;
            case "Декабрь":
                out.println("31 день");
                break;
            default:
                out.println("Неверный ввод");
        }
        keyboard.close();
    }
}