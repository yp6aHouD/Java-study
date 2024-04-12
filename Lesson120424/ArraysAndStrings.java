package Lesson120424;
import static java.lang.System.out;


public class ArraysAndStrings
{
    public static void main(String[] args)
    {
        /* 
         * есть 2 строковых литерала
         * String - является неизменяемым, после создания строки её нельзя изменить
         * каждый раз при выполнении операции над строкой создается новая строка, а не старая
         */
        
        String str = "Hello"; // или String str = new String("Hello");
        str += " World"; // Создает новый объект String
        String b, y;
        out.println(str);
        // out.println(b); - ошибка, переменная b не инициализирована
        b = new String();
        out.println("b = " + b); // Выведет пустую строку 
        b = "ABCDE";
        // b[1] = A; // Ошибка, строка неизменяема

        b.replace('B', 'Z'); // НЕ МЕНЯЕТ САМУ СТРОКУ, ЛИШЬ ТОЛЬКО ВОЗВРАЩАЕТ ИЗМЕНЕННУЮ
        out.println("b = " + b); 

        y = b.replace('B', 'Z');
        out.println("y = " + y);
        out.println("---------------");
        
        /* 
        * StringBuffer - является изменяемым, можно менять строку
        * без создания нового объекта
        */
        StringBuffer sb = new StringBuffer("Hello");
        // StringBuffer sb2 = "Allo"; - ошибка, нельзя присвоить строку StringBuffer. Нужно сначала создать объект.

        sb.append(" World"); // Изменяет существующий объект StringBuffer 
        out.println(sb);
        out.println("sb.length() = " + sb.length());
        out.println();

        sb.replace(1,4,"E"); // Заменяет символы с 1 по 4 на 1 символ "E" (на строку с одной буквой)
        out.println("после изменения sb.replace(): ");
        out.println(sb);
        
        out.println("sb.length() = " + sb.length());
        out.println("---------------");
        
        out.println("random text.length allo = " + "allo".length()); // можно напрямую искать длину строки
        out.println("---------------");
        
        boolean bool = b.equals("Heo World"); // сравнение строки b с "Heo World"
        out.println("b.equals('Heo World') = " + bool);
        bool = b.equals("ABCDE"); // сравнение строки b с "ABCDE"
        out.println("b.equals('ABCDE') = " + bool);
        
        sb.replace(0,10, "ABCDE");
        // bool = b.equals(sb); // ошибка, нельзя сравнивать строки с StringBuffer
        bool = b.equals(sb.toString());
        out.println("b.equals(sb.toString()) = " + bool); // можно сравнить строку с стрингбуфером после преобразования в строку
        out.println("sb.reverse = " + sb.reverse()); // переворачивает строку
        out.println("sb.append('B') = " + sb.append('B')); // добавляет символ в конец строки
        out.println("sb.insert(2, 'M') = " + sb.insert(2, 'M')); // вставляет символ после 2 элемента и между 3 и 4
        out.println("sb.replace(2, 5, 'KKK') = " + sb.replace(2,5,"KKK")); // меняет с 2 символа по 5 символ строкой "ККК"
        out.println("---------------");

        int x = Integer.parseInt("123");
        out.println("Integer.parseInt('123') = " + x);

        Double z = Double.parseDouble("123");
        out.println("Double.parseDouble('123') = " + z);

        z = Double.parseDouble("3.14");
        out.println("Double.parseDouble('3.14') = " + z);
        out.println("---------------");
        
    }
}
