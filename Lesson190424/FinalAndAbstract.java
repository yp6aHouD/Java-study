package Lesson190424;

import static java.lang.System.out;

/* final */ class B19046 // нельзя будет наследовать класс при наличии final
{
    final int X = 2; // final переменные пишут большими буквами
    // и они не могут быть НЕ проинициализированы
    public static final int Y = 3;
    final public static int Z = 3;

    final void f()
    {
        out.println("BBB");
    }
}

class C19046 extends B19046
{
    // void f() {out.println("CCC");} нельзя переопределить final метод
    void f(int x)
    {
        out.println("CCC");
    }
}

public class FinalAndAbstract
{
    public static void main(String[] args)    
    {
        /* 
         * final - ключевое слово, которое запрещает наследование класса 
         * или изменение в подклассе методов, помеченных как final
         * или изменение переменной, если она обозначена как final
         * 
         * после объявления переменной её значение можно изменить 1 раз
         */

        out.println("X = " + new B19046().X);
        out.println("Y = " + B19046.Y);
        out.println("Z = " + B19046.Z);
        // B19046.Y = 5; нельзя изменить значение final переменной

        C19046 c = new C19046();
        c.f(); // выведет "BBB"
        c.f(3); // выведет "CCC"
    }
}