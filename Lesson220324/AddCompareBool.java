package Lesson220324;
import static java.lang.System.out;


public class AddCompareBool
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        int y = 2, x = 3, z = x + y;
        boolean b = true;
        out.println("y = " + y + ", x = " + x + ", z = " + z); // + для печати переменных
        out.println(1 + 2 + "3"); // сначала вычисление слева, потом прибавление результата к строке
        out.println("1" + 2 + 3 + 4); // сначала преобразование в строку, потом прибавление символа к строке
        out.println("1" + (2 + 3 + 4)); // преобразование в строку, сумма, прибавление к строке
        out.println((2 + 3 + 4) + "1"); // сумма и преобразование в строку, прибавление 1 к концу
        out.println(4 > 3 && 3 > 4); // false, автоматом преображает в bool
        out.println("------");
        out.println(4 >= 3);
        // out.println(5 > 4 > 3); – так нельзя!
        out.println("------");
        
        out.println(true || x > 4); // не успевает сравнить второе значение, сразу = true
        out.println("------");

        b = true || ((x = 4) > 5); // из-за того, что true, второе значение не меняется
        out.println("x1 = " + x + ", b = " + b);
        b = false || ((x = 4) > 5); // из-за того, что true, второе значение не меняется
        out.println("x2 = " + x + ", b = " + b);
        b = true && ((x = 6) > 4);
        out.println("x3 = " + x + ", b = " + b);
        

    }   
}
