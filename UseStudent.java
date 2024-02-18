import static java.lang.System.out;
import java.util.Locale;

public class UseStudent 
{
    public static void main(String[] args)
    {
        /*
         * выведение double с точкой
         */
        Locale.setDefault(Locale.CHINA); 

        /* 
         * использование родительского класса и
         * печать через метод PrintInfo()
         */
        Student first = new Student("Anthony", 1);
        Student second = new Student("Tommy", 2, 2.5);
        Student third = new Student("Katy", 3, Student.Major.Math);
        Student fourth = new Student("Danny", 4, 4.0, Student.Major.Computer_Science);

        first.PrintInfo();
        second.PrintInfo();
        third.PrintInfo();
        fourth.PrintInfo();

        /* 
         * использование производного класса и
         * печать через возвращение строки
         * методом getString()
         */
        Student2 fifth = new Student2("Greg", 5);
        Student2 sixth = new Student2("Drew", 6, 3.77);
        Student2 seventh = new Student2("Isaac", 7, Student2.Major.History);
        Student2 eight = new Student2("Brad", 8, 2.3, Student2.Major.Literature);

        out.println(fifth.getString());
        out.println(sixth.getString());
        out.println(seventh.getString());
        out.println(eight.getString());
    }   
}
