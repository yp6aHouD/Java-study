import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Guess_game_while
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int num_guesses = 0;
        int rand_num = random.nextInt(100) + 1;

        out.print("Guess a number from 1 to 100: ");
        int user_numb = keyboard.nextInt();
        num_guesses++;
        
        while (user_numb != rand_num)
        {
            if (user_numb > rand_num)
                out.println("Try a lower number");
            else 
                out.println("Try a higher number");

            System.out.println("Guess again: ");
            user_numb = keyboard.nextInt();
            num_guesses++;
        }

        out.println("Congratulations, you won using " + num_guesses + " tries!");
        
        keyboard.close();
    }
}