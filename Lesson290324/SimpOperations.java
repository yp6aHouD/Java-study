package Lesson290324;

public class SimpOperations 
{ 
    public static void main(String[] args)
    {
        final int N = 10; 
        for (int i = 1; i < N; i++) // задаем количество строк (этажей)
        {
            for (int j = 0; j < N - i; j++) // задаем количество пробелов
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
