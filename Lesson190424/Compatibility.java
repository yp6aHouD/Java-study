package Lesson190424;

import static java.lang.System.out;

public class Compatibility
{
    /* 
     * можно объектам родительского класса назначать объекты подкласса
     * и вызывать методы родительского класса
     * 
     * НО НЕЛЬЗЯ НАОБОРОТ!
     * объектам подкласса нельзя назначать объекты родительского класса
     */
    public static void main(String[] args)    
    {
        B19044 b1;
        C19044 c1 = new C19044(3, 4);

        b1 = c1; // можно, т. к. объект b1 может расшириться до объекта c1
        // но нельзя наоборот, т. к. c1 не может сузиться до объекта b1 (будет потеря данных)
        out.println("b1.x = " + b1.x);
        b1.x = 5;
        out.println("c1.x = " + c1.x);
        out.println("c1.y = " + c1.y);
        
    }
}

class C19044 extends B19044
{
    int y;

    public C19044 (int m, int n)
    {
        super(m); // вызов конструктора родительского класса должен быть вначале конструктора!
        y = n;
    }
}

class B19044
{
    int x;
    
    public B19044(int m) {x = m;}
}