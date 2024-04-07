package Lesson070424;
import static java.lang.System.out;

@SuppressWarnings("unused")
public class DestrAndPodclass 
{
    public static void main(String[] args)
    {
        D d = new D(new B(), new C());
    }
}

class B
{
   public B()
   {
        out.println("BBB");
   }
}

class C
{
    public C()
    {
        out.println("BBB");
    }
}

class D
{
    B b;
    C c;

    public D(B b1, C c1)
    {
        b = b1;
        c = c1;
        out.println("DDD");
    }
}