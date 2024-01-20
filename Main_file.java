import com.allmycode.dummiesframe.DummiesFrame;

public class Main_file
{
    public static void main(String[] args)
    {
        DummiesFrame frame = new DummiesFrame("Поздоровайтесь со мной, ссуки!");
        frame.addRow("Укажите Ваше имя, ССУКА!");
        frame.addRow("А ещё рост!");
        frame.go();
    }

    public static String calculate(String firstName, int bodyHeight)
    {
        return "Привет, " + firstName + " с ростом " + bodyHeight + "!";
    }
}