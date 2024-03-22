package Lesson150324;

import static java.lang.System.out;
import java.lang.Math;

public class StaticAndMath
{
    /*
     * объявление переменных класса (static нельзя объявлять в методах)
     */
    int x = 2; // эта переменная меняется внутри экземпляра
    static int y = 3; // эту переменную можно менять между экземплярами
    
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        StaticAndMath cl = new StaticAndMath();
        /* 
         * Внутри метода main() можно обращаться к статическим полям класса
         * и менять их значения для всех экземпляров класса
         */
        cl.y = 2;
        StaticAndMath.y = 4;

        out.println(cl.y);
        out.println(StaticAndMath.y);
        out.println("---------------");
        
        out.println("e = " + Math.E);
        out.println("Pi =" + Math.PI);
        out.println("Sin 30 = "+ Math.sin(Math.PI / 6)); // sin функция принимает радианы
        out.println(20 + (int)(Math.random() * (30 - 20))); // рандом от 20 (написан первым) до 30
    }
}