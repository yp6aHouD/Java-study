package Lesson190424;

import static java.lang.System.out;

/* 
 * при объявлении abstract класса, в нем нельзя будет создать объект
 * (можно просто использовать его методы)
 * 
 * при объявлении abstract метода, в классе, который наследует этот класс
 * обязательно должен быть переопределен этот метод
 * 
 * если в классе есть хотя бы 1 абстрактный метод,
 * то этот класс должен быть объявлен как абстрактный
 */

abstract class B19047
{
    abstract void f();
    abstract void g();
}

abstract class C19047 extends B19047
{
    void f()
    {
        out.println("CCC");
    }
}

class D19047 extends C19047
{
    void g()
    {
        out.println("DDD");
    }
}

public class Abstract2
{
    public static void main(String[] args)    
    {
        // B19047 b = new B19047() // нельзя создать объект абстрактного класса
        B19047 b;
        b = new D19047(); b.f(); b.g();
        out.println("----------");
        
        C19047 c;
        c = new D19047(); c.f(); c.g();
        out.println("----------");


    }
}