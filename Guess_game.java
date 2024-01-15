import static java.lang.System.out; // позволяет не писать System.out
import static java.lang.System.in; // позволяет не писать System.in
import java.util.Scanner; 
import java.util.Random;

public class Guess_game 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(in);

        out.print("Input your number: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber)
        {
            out.println("************");
            out.println("* You win! *");
            out.println("************");
        }
        else
        {
            out.println("You lose!");
            out.println("Random number was: " + randomNumber + ".");
        }

        out.println("Thanks for the game!");

        keyboard.close();
    }
}