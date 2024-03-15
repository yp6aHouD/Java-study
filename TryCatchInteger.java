import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchInteger
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        
        do {
            try
            {
                out.print("Input a number: ");
                number = keyboard.nextInt();
                validInput = true;
            }
            catch (InputMismatchException wrongNum)
            {
                out.println("You were inputting a wrong type of data");
                keyboard.next(); // Очистить неверный ввод
            }
        } while (!validInput);

        out.println("Your number is: " + number);
        keyboard.close();
    }
}