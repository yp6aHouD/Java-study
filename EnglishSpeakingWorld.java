import static java.lang.System.out;

public class EnglishSpeakingWorld 
{
    String mars = "красная планета";

    void visitPennsylvania()
    {
        out.println("Выполняется visitPA: ");

        String mars = "родной город Джанин"; // переменная метода != переменная класса

        out.println(mars); // обращение к переменной метода
        out.println(this.mars); // обращение к переменной класса
    }
}
