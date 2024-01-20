import com.allmycode.dummiesframe.DummiesFrame;
import java.util.Random;

public class guess_dummies_frame
{
    public static void main(String[] args)
    {
        DummiesFrame frame = new DummiesFrame("Игра в угадывание чисел!");
        frame.addRow("Введите число от 1 до 10");
        frame.setButtonText(" Щёлкните по этой кнопке");
        frame.go();
    }

    public static String calculate(int inputNumber)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        if (inputNumber == randomNumber)
        {
            return "Вы угадали!";
        }
        else
        {
            return "Вы не угадали! Было загадано число "
            + randomNumber + ".";
        }
    }
}