package Lesson190424;

import static java.lang.System.out;

public class Super 
{
    public static void main(String[] args)    
    {
        B19041 b = new B19041();
        b.f();
    }
}

class C19041
{
    void f() {out.println("CCCC");}
}
class B19041 extends C19041
{
    void f() {super.f(); out.println("BBBB");} // обращение к родительскому классу С1904
}