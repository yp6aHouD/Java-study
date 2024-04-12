package Lesson120424;
import static java.lang.System.out;

class B
{
    public B () {out.println("Now processing B:");} // Конструктор В
    private int x = 2;

    public int getX() 
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }
}

class C extends B // С наследует В (C success B)
{
    public C() {out.println("Now processing C:");} // Конструктор С
} 

public class SuccessionAndStates
{
    public static void main(String[] args)
    {
        C cObject = new C(); // при создании объекта выполняются 2 дефолтных конструктора (B и C)
        out.println("cObject.getX() = " + cObject.getX());
        cObject.setX(5);
        out.println("cObject.setX(5) then cObject.getX() = " + cObject.getX());
    }
}
