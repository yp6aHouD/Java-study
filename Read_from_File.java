import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;



public class Read_from_File
{
    public static void main(String[] args) throws IOException
    {
        Locale.setDefault(Locale.CHINA);
        
        // Подключить файл + указать его имя
        File input = new File("Tryit.txt");
        Scanner fileScan = new Scanner(input);

        // Определить, где программа по умолчанию ищет файл
        System.out.println
        (
            "\nFolder, where file should be: " + 
            input.getCanonicalPath()
        );

        /* 
        * или
        * Scanner fileScan = new Scanner(new File("Tryit.txt")); 
        *
        * System.out.println
        * (
        *     "\nFolder, where file should be: " +
        *     new File("Tryit.txt").getCanonicalPath()
        * );
        */
        
        for (int i = 1; i <= 3; i++)
        {
            setContactInfo(fileScan);
        }

        fileScan.close();
    }

    static void setContactInfo(Scanner diskScanner)
    {
        Contact aContact = new Contact();
        aContact.setName(diskScanner.nextLine());
        aContact.setPhone(diskScanner.nextLong());
        diskScanner.nextLine(); // Удаляет мусор после nextLong()
        aContact.setBalance(diskScanner.nextDouble());
        diskScanner.nextLine(); // Удаляет мусор после nextDouble()

        aContact.printInfo();
    }

}