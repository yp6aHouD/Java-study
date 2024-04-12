package Lesson120424;
import static java.lang.System.out;

@SuppressWarnings("unused")
public class Succession2 
{
    public static void main(String[] args)
    {
        /* 
         * путь создания объекта F:
         * 1. создается объект F
         * 2. выполняется конструктор D (F extends D)
         * 3. выполняется конструктор E (D extends E) (печатается ЕЕЕ)
         * 4. в D создается объект Е (еще раз печатается ЕЕЕ)
         * 5. выполняется условие конструктора D (печатается DDD)
         * 6. в F создается объект Е (еще раз печатается ЕЕЕ)
         * 7. выполняется конструктор F (печатается FFF)
         */
        F fObject = new F();
    }
}

class E
{
    E() {out.println("EEE");}
}

/* 
 * сначала создается класс F и внутренние переменные (e)
 * выполняется конструктор e, потом только конструктор E
 */
class F extends D // 1. сначала выполняется конструктор extends D
{
    F() {out.println("FFF");} // 3. выполняется конструктор F
    E e = new E(); // 2. создается объект Е и опять выполняется конструктор Е
}

@SuppressWarnings("unused")
class D extends E // 1. сначала выполняется конструктор extends E
{
    D()  // 3. выполняется конструктор D
    {
        out.println("DDD"); 
    }
    private int y;

    E e = new E(); // 2. создается объект Е и опять выполняется конструктор Е
}
