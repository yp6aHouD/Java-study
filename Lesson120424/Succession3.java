package Lesson120424;
import static java.lang.System.out;

class G
{
    void f() {out.println("in G");}
}
class H extends G
{
    void f() {out.println("in H");} // метод в этом же классе
    void g() {super.f();} // вызов метода f() из класса G
    void f(int x) {out.println("FFF");}
    void g1() {f(); this.f(); super.f();} // super.f() вызывает метод f() из родительского класса G
}


public class Succession3 
{
    public static void main(String[] args)
    {
        H h = new H();
        h.g();

        h.f(2); // вызов метода f(int x) из класса H
        h.f(); // вызов метода из родительского для H класса G
        out.println("----------");
        h.g1();
    }    
}
