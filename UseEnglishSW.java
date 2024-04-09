import static java.lang.System.out;

public class UseEnglishSW 
{
    public static void main(String[] args)
    {
        out.println("Выполняется main:");
        EnglishSpeakingWorld e = new EnglishSpeakingWorld();

        out.println(e.mars);
        e.visitPennsylvania();
    }
}
