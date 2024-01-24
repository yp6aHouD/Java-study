import java.util.Scanner;
import java.io.File;
import java.util.Locale;


public class DoPayroll
{
    public static void main(String args[]) throws Exception
    {
        Locale.setDefault(Locale.CHINA);
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));

        for (int empNum = 1; empNum <= 3; empNum++)
        {
            payOneEmployee(diskScanner);
        }
        diskScanner.close();
    }

    static void payOneEmployee(Scanner aScanner)
    {
        Employee anEmployee = new Employee();
        
        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}