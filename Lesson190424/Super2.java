package Lesson190424;

import static java.lang.System.out;

public class Super2
{
    public static void main(String[] args)    
    {
        C19043 c = new C19043(2, 3);

        c.f2();
        out.println("------");    
        c.g();
        out.println("------");    

        out.println("x2 = " + c.getX2());
        out.println("x3 = " + c.getX3());
    }
}

class C19043 extends B19043
{
    public C19043 (int m, int n)
    {
        super(m); // вызов конструктора родительского классад должен быть вначале конструктора!
        x3 = n;
        out.println("CCCCC");
    }

    int x = 3;
    private int x3;

    int getX3() {return x3;}

    void f2()
    {
        int x = 4;
        out.println("x = " + x); // обращение к локальной переменной х (строкой выше)
        out.println("this.x = " + this.x); // обращение к переменной класса C19043
        out.println("super.x = " + super.x); // обращение к переменной класса B19043
    }

    void f()
    {
        out.println("CCC");
    }

    void g()
    {
        f();
        this.f();
        super.f();
    }
}

class B19043
{
    public B19043(int m)
    {
        x2 = m;
        out.println("BBBBB");
    }
    int getX2() {return x2;}

    int x = 2;
    private int x2 = 2;

    void f()
    {
        out.println("BBB");
    }
}