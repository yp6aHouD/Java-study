package Lesson100524;
import static java.lang.System.out;

public class TryCatch 
{
    public static void main (String[] args)
    {
        new B00().g();
    }
}

class B00
{
    void f() throws Exception, ArithmeticException
    {
        int x = 3;
        out.println("in f()");
        if (x == 2) throw new Exception();
        if (x == 3) throw new ArithmeticException();
        out.println("AAAA");
    }

    void g()
    {
        try
        {
            f();
        }
        catch(ArithmeticException e)
        {
            out.println("3333");
        }
        catch(Exception e)
        {
            out.println("2222");
        }
    }

}
