import static java.lang.System.out;
import java.util.Scanner;


public class switch_case
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Почему эл стоит под дождём? ");
        int numb = keyboard.nextInt();
        switch(numb)
        {
            case 1:
                out.println("Потому что дождь идёт долго");
                break;
            case 2:
                out.println("Потому что он очень расстроен");
                break;
            case 3:
                out.println("Потому что он всё равно уже мокрый");
                break;
            default:
                out.println("Неверный ввод! пффф");
                break;
        }
        keyboard.close();
    }
}