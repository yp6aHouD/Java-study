package Lesson290324;

class B
{
    /*
     * Конструкторы на китайском называются 构造方法
     * Нельзя делать два конструктора с одинаковыми параметрами
     * Можно сделать с разными типами разных параметров в разных комбинациях
     */
    public B() {System.out.println("In B");} 
    public B(int m) {System.out.println("Bbbbb");}
    public B(int m, int n) {System.out.println("Ccccc");}
    public B(double m) {System.out.println("Ddddd");}
    public B(double m, int n) {System.out.println("Eeeee");}
    public B(int n, double m) {System.out.println("Fffff");}
    // public B(int m, double n) {System.out.println("Fffff");} // этот метод добавить нельзя

    /* 
     * Можно называть методы одинаково, но тогда
     * Аргументы должны быть разными!
     */
    public void f(){System.out.println("2Aaaaaa");}
    public void f(int m){System.out.println("2Bbbbbb");}
    public void f(int m, int n){System.out.println("2Cccccc");}
    public void f(double n){System.out.println("2Dddddd");}
}

@SuppressWarnings ("unused")
public class ClassesAndMethods
{
    public static void main(String[] args)
    {
        B b = new B();
        B a = new B(5);
        System.out.println("---------");
        new B();
        new B(2);
        new B(2, 3);
        new B(3.5);
        new B(3.5, 5);
        new B(5, 3.5);
        System.out.println("---------");
        b.f();
        b.f(1);
        b.f(1,2);
        b.f(3.4);
    }
}