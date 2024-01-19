import static java.lang.System.out;
import java.util.Scanner;



public class class_as_combination_of_methods_and_fields
{
    public static void main(String[] args)
    {
        second me = new second();
    //  me.balance = 100; // нельзя использовать, т. к. переменная private
        me.address = "Nobody knows where I'm living.";
        me.name = "yp6aHouD";

        out.println("nick: " + me.name);
        out.println("address: " + me.address);
    //  out.println("balance: " + me.balance);
        out.print("Input number for factorial: ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        out.println("Factorial of " + n + " is " + me.factorial(n));
        keyboard.close();
    }

}

class second // внешний класс
{
    public String name;         // стандартная, может использоваться везде
    protected String address;   // защищенный доступ
    /*private*/ int balance;        // не может использоваться другими классами, 
                               // а только внутри класса.
    double factorial(int n)
    {
        if (n < 1) return 0;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}