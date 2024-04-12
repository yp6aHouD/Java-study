package Lesson120424;
import static java.lang.System.out;

public class MainArgs 
{
    /* 
     * можно работать с аргументами при запуске main
     */
    public static void main(String[] args) // задал аргументы через "Выполнить" -> Open Configurations
    {
        for (int i = 0; i < args.length; i++)
        {
            out.println("args[" + i + "] = " + args[i]); // выводит аргументы, каждый как строку
        }

        /* 
         * лучше всего напрямую не печатать аргументы, а проверять if
         */
        if (args.length >= 2)
        {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            out.println("x + y через Integer.parseInt = " + (x + y));
            out.println("x + y напрямую через args[0] + args[1] = " + (args[0] + args[1]));
        }
        else
        {
            out.println("Недостаточно аргументов");
        }

        out.println("---------------");

        char[] s = {'A', 'B', 'C'};
        String b;
        // b = s; - ошибка, нельзя присвоить массив char[] строке String
        b = new String(s); // можно создать новый объект String, используя массив char[]
        out.println("b = " + b);

        s = new char[10];
        s = b.toCharArray(); // можно преобразовать строку в массив char[]
        out.print("s = ");
        out.println(s);
        out.println("---------------");

        out.println("b before function = " + b);
        new MainArgs().f(b);
        out.println("b after function = " + b); // строка не изменилась, т. к. ЭТО НЕИЗМЕННЫЙ ТИП

        StringBuffer sb = new StringBuffer("DEF");
        out.println("sb before function = " + sb);
        new MainArgs().f(sb);
        out.println("sb after function = " + sb); // строка изменилась, т. к. ЭТО ИЗМЕНЯЕМЫЙ ТИП

        int[] arr = {1, 2, 3, 4, 5};
        out.println("arr[1] before function = " + arr[1]);
        new MainArgs().f(arr);
        out.println("arr[1] after function = " + arr[1]);
    }    

    public void f(String s)
    {
        s = "ABC";
    }

    public void f(StringBuffer sb)
    {
        // sb = "ABC"; - нельзя присвоить строку StringBuffer
        sb.reverse();
    }

    public void f(int[] arr)
    {
        arr[1] = 5;
    }
}
