import static java.lang.System.out;
import java.util.Scanner;

public class Create_org_and_fill
{
    private static class Organization
    {
        String name;
        double year_income;
        boolean is_commercial;
    }

    public static void main(String[] args)
    {
        useOrganisation useOrg = new useOrganisation();
        useOrg.input_data();
        useOrg.print_data();
    }

    private static class useOrganisation
    {
        Organization org = new Organization();
        Scanner keyboard = new Scanner(System.in);

        void input_data() {
            out.print("Enter name of organization: ");
            org.name = keyboard.next();
            out.print("Enter year income of organization: ");
            org.year_income = keyboard.nextDouble();
            out.print("Enter is organization commercial (true/false): ");
            org.is_commercial = keyboard.nextBoolean();

            keyboard.close();
        }

        void print_data() {
            out.println("Name of organization: " + org.name);
            out.println("Year income of organization: " + org.year_income);
            out.println("Is organization commercial: " + org.is_commercial);
        }
    }
}