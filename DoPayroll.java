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

        payFullTimeEmployee();
        payPartTimeEmployee();

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
    static void payFullTimeEmployee()
    {
        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        ftEmployee.setName("Johnson");
        ftEmployee.setJobTitle("Manager");
        ftEmployee.setWeeklySalary(7000);
        ftEmployee.setBenefitDeduction(255);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
    }

    static void payPartTimeEmployee()
    {
        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        ptEmployee.setName("Tom");
        ptEmployee.setJobTitle("Scientist");
        ptEmployee.setHourlyRate(200);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(40));
    }
    
}