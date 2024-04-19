package Lesson190424;

import static java.lang.System.out;

class B19045
{
    int x = 2;

    void who()
    {
        out.println("BBB");
    }
}

class C19045 extends B19045
{
    int x = 3;

    void who()
    {
        out.println("CCC");
    }
}

class D19045 extends C19045
{
    int x = 4;

    void who()
    {
        out.println("DDD");
    }
}

public class Polymorphism1
{
    public static void main(String[] args)    
    {
        B19045 b; // дед
        b = new B19045(); b.who(); // использование метода из класса B19045, т. к. b ссылается на объект класса B19045
        out.println("x1 = " + b.x);
        
        b = new C19045(); b.who(); // использование метода из класса С19045, т. к. b ссылается на объект класса С19045
        out.println("x2 = " + b.x);

        b = new D19045(); b.who(); // использование метода из класса D19045, т. к. b ссылается на объект класса D19045
        out.println("x3 = " + b.x);
        /* 
         * выводится х1, х2, х3 = 2, потому что b изначально создан как объект класса B19045
         * при переназначении класса он не знает переменные других классов,
         * на которые был переназначен, и поэтому выводит переменные из класса B19045
         */
        out.println("-------");

        C19045 c; // отец
        c = new C19045(); c.who();
        c = new D19045(); c.who();
        out.println("-------");

        D19045 d; // внук
        d = new D19045(); d.who();
    }
}