import static java.lang.System.out;
import java.util.Scanner;


public class switch_case
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Почему эл стоит под дождём? ");
        String word = keyboard.next();
        switch(word)
        {
            case "один":
                out.println("Потому что дождь идёт долго");
                break;
            case "два":
                out.println("Потому что он очень расстроен");
                break;
            case "три":
                out.println("Потому что он всё равно уже мокрый");
                break;
            default:
                out.println("Неверный ввод! пффф");
                break;
        }
        keyboard.close();
    }
}