import com.allmycode.dummiesframe.DummiesFrame;

public class calc_dummies_frame
{
    public static void main(String[] args)
    {
        DummiesFrame frame = new DummiesFrame("Введите два числа");
        frame.addRow("Первое число ");
        frame.addRow("Второе число ");
        frame.setButtonText("Посчитать разность");
        frame.go();
    }

    public static int calculate(int firstNumber, int secondNumber)
    {
        return firstNumber - secondNumber;
    }
}