import static java.lang.System.out;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class FirstTryCatch
{
    public static void main(String[] args)
    {
        System.out.println("我们今天午饭吃什么，我的爱？");
        String answer = new String();
        Scanner keyboard = new Scanner(System.in);
        try
        {
            answer = keyboard.nextLine();
            out.println(answer);
        }
        catch (NoSuchElementException e)
        {
            out.println("Error reading from user");
        }
        finally
        {
            keyboard.close();
        }
    }
}