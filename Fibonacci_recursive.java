import static java.lang.System.out;

public class Fibonacci_recursive
{
    public static void main(String[] args) 
    {
        for (int i = 1; i < 50; i++)
        {
            out.print(Fibonacci(i) + " ");
        }
    }

    private static int Fibonacci(int a)
    {
        if (a < 0)
        {
            out.println("Error: Negative number");
            return -1;
        }
        int Fib[] = new int [a + 1];
        Fib[0] = 0;
        Fib[1] = 1;
        for (int i = 2; i <= a; i++)
        {
            Fib[i] = Fib[i - 1] + Fib[i - 2];
        }
        return Fib[a];
    }
}