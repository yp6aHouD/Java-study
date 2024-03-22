package Lesson220324;
import static java.lang.System.out;

public class InstanceTypeChange 
{
    public static void main(String[] args)
    {
        /* 
         * instanceof - оператор, который проверяет
         * является ли объект экземпляром класса
         */
        Integer x = 2;
        String s = "java";
        boolean b = s instanceof String;
        out.println(b);

        InstanceTypeChange A = new InstanceTypeChange();
        b = A instanceof InstanceTypeChange;
        out.println(b);

        b = x instanceof Integer;
        out.println(b);
        out.println("-------");

        /* 
         * Преобразование строки в число (инт)
         */
        String str = "123";
        x = Integer.parseInt(str);
        out.println("String str to integer with Integer.parseInt: " + x);

        /* 
         * Преобразование строки в число (с точкой)
         */
        String str2 = "123.45";
        double u = Double.parseDouble(str2);
        out.println("String str2 to double with Double.parseDouble: " + u);
        out.println("-------");

        /* 
         * Преобразование числа с точкой в инт
         */
        out.println("double -3.9 to int" + (int) -3.9);
        out.println("double 3.2 to int" + (int) 3.2);
        out.println("-------");
    }
}
