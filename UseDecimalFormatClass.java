import static java.lang.System.out;
import java.text.DecimalFormat;

/* 
 * класс DecimalFormat позволяет форматировать числа в строку
 */
public class UseDecimalFormatClass 
{
    public static void main(String[] args)
    {
        DecimalFormat format2 = new DecimalFormat();
        format2.setMinimumFractionDigits(2);
        format2.setNegativePrefix("("); // задание префикса отрицательного числа
        format2.setNegativeSuffix(")"); // задание постфикса отрицательного числа

        out.println(format2.format(342));
        out.println(format2.format(-345));
    }
}    
