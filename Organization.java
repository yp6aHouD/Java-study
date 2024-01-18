import static java.lang.System.out;
import java.util.Scanner;

public class Organization
{
    String name;
    double year_income;
    boolean is_commercial;

    public void input_data()
    {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter name of organization: ");
        name = keyboard.next();
        out.print("Enter year income of organization: ");
        year_income = keyboard.nextDouble();
        out.print("Enter is organization commercial (true/false): ");
        is_commercial = keyboard.nextBoolean();
        keyboard.close();
    }

    public void print_data()
    {
        out.println("Name of organization: " + name);
        out.println("Year income of organization: " + year_income);
        out.println("Is organization commercial: " + is_commercial);
    }
    
    public void createOrganization()
    {
        Organization first = new Organization();
        first.input_data();
        first.print_data();
    }
}