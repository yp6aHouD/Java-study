package Lesson070424;
import static java.lang.System.out;

public class ArraysJava {
    public static void main(String[] args) 
    {
        /* 
         * при объявлении массивов нельзя сразу вписывать
         * int[3] a = ...
         * так как int[] - это отдельный класс
         * только при создании объекта класса (массива)
         * можно указывать размерность
         */
        int[] a = {1, 2, 3};
        out.println(a[0]); // печатает цифру в массиве (по умолчанию 0)
        out.println(a); // печатает адрес массива
        out.println(a.length); // печатает длину массива
        out.println("---------");
        
        /* 
        * принт массива через for
        */
        int[] b = {3, 4, 6, 10, 22};
        for (int i = 0; i < b.length; i++)
        {
            out.print(b[i]);
            if (i != b.length - 1) out.print(", ");
        }
        out.println();
        out.println("---------");
        
        /* 
         *  двумерный массив 
         */
        int[][] c = new int[b.length][]; // определяем, сколько будет строк (зависит от длины b)
        for (int i = 0; i < b.length; i++)
        {
            c[i] = new int[b[i]]; // определяем, сколько будет столбцов (зависит от значения элемента b[i])
        }

        /* 
         * заполнение двумерного массива
         */
        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                c[i][j] = i + j;
            }
        }

        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                out.print("a[" + i + "][" + j + "]=" + c[i][j] + " ");
            }
            out.println();
        }
    }
}