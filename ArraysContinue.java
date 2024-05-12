import static java.lang.System.out;

public class ArraysContinue
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 4, 5, 3, 8};
        /* 
         * расширенный цикл for это
         * перебор всех элементов массива numbers
         * и запись в локальную переменную numValue
         */
        for (int numValue : numbers)
        {
            out.println(numValue);
        }
    }
}