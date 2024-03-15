package Lesson150324;
import static java.lang.System.out;
public class TypesSwitching 
{
    public static void main(String[] args)
    {
        /* 
         * Приведение типов
         */
        out.println(7 / 4);
        out.println(1.0 / 2);
        out.println(1 / 2.0);
        out.println(1.0 / 2.0);
        out.println("----------------------");
        
        out.println(5.7 % (4.2));
        out.println(5.7 % (-4.2));
        out.println((-5.7) % (-4.2)); // знак при делении по модулю положительный,
        out.println((-5.7) % (4.2));  // если делитель (верхняя часть) положительный
        out.println("----------------------");
        
    }
}
