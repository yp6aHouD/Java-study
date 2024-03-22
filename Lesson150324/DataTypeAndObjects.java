package Lesson150324;
import static java.lang.System.out;

public class DataTypeAndObjects
{
    int z; // 成员变量 переменная класса, равна 0 по умолчанию
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        int z = 314;

        /* 
         * байтовый формат это целое число от -128 до 127 (1 байт)
         * при превышении выскакивает ошибка компиляции 
         */
        byte x, y;
        x = 127;
        y = -128;

        System.out.println("Integer.toBinaryString(15) = " + Integer.toBinaryString(15));
        System.out.println("15 Integer.toHexStrin(15) = " + Integer.toHexString(15));
        System.out.println("Max value of BYTE = " + Byte.MAX_VALUE);
        System.out.println("Min value of BYTE = " + Byte.MIN_VALUE);
        out.println("-----------------5-----");

        out.println(x);
        out.println(y);
        out.println("----------------------");
        
        /* 
        * формат boolean это да/нет (1 байт)
        */
        boolean a = true;
        out.println(a);
        a = 2 > 3;
        out.println(a);
        out.println("----------------------");
        
        /* 
        * создаем экземпляр класса внутри класса
        */
        DataTypeAndObjects cl = new DataTypeAndObjects();
        out.println("X while creating new object in class B = " + new B().x);
        out.println("X while creating new object in main class = " + new DataTypeAndObjects().z);
        out.println("X after creating object cl = " + cl.z);
        new DataTypeAndObjects().f();
        out.println("----------------------");
        
        final int b = 2+3; // константа, нельзя поменять в процессе программирования
        final int M; // после объявления константы можно присвоить значение 1 раз
        M = 5;
        
        out.println("Final b * 4 = " + b * 4);
        out.println("Final M, changed 1 time = " + M);
        out.println("----------------------");
    }
    void f()
    {
        int z = 5;
        out.println("X after using through void f() + this.z = " + this.z);
        out.println("X after using through void f() + z = " + z);
    }
}

class B
{
    int x = 3;
}