package Lesson190424;

import static java.lang.System.out;

public class This1 
{
    public static void main(String[] args)    
    {
        C19042 c1 = new C19042(2, 3);
        c1.write();

        C19042 c2 = new C19042(4);
        c2.write();

        C19042 c3 = new C19042();
        c3.write(); 

        C19042 c4 = new C19042();
        c4.f2(c4);
        c4.write();

        C19042 c5 = new C19042();
        c5.f3().f3().f3().write();
    }
}

class C19042
{
    int x = 2, y;
    public C19042(int m, int n) {x = m; y = n;}
    public C19042(int t) {this(t,t);} // обращение к собственному же конструктору
    public C19042() {this(0, 0);}

    void f()
    {
        int x = 3;
        out.println("x = " + x); // обращение к локальной переменной х
        out.println("this.x = " + this.x); // обращение к переменной класса С19042
        // если переменная х в классе находится в едином виде, то можно не использовать this
    }

    public void f2(C19042 c) // x + 2 в конце функции
    {
        c.x++; 
        this.x++; 
        x++;
    }

    public C19042 f3()
    {
        x++;
        this.x++;
        return this;
    }
    
    void write()
    {
        out.println("x = " + x + ", y = " + y);
    }
}
class B19042 extends C19042
{
    void f() {super.f(); out.println("BBBB");} // обращение к родительскому классу С1904
}