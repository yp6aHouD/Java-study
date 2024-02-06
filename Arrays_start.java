import static java.lang.System.out;

public class Arrays_start
{
    public static void main(String[] args)
    {
        int[] array = new int[]{1, 2, 3, 4, 5}; // инициализация массива
        int[] array2 = {1, 2, 3, 4, 5}; // второй способ инициализации
        int[] array3 = new int[5];  // объявление без инициализации
        array3 = array.clone(); // копирование массива

        for (int i = 0; i < 5; i++)
        {
            out.printf("%d ", array[i]);
        }
        out.println();

        for (int i = 0; i < 5; i++)
        {
            out.printf("%d ", array2[i]);
        }
        out.println();

        for (int i = 0; i < 5; i++)
        {
            out.printf("%d ", array3[i]);
        }
        out.println();

    }
}