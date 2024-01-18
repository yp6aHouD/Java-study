import static java.lang.System.out;
import java.util.Scanner;

public class Organization
{
    String name;
    double year_income;
    boolean is_commercial;

    public void input_data(Scanner input)
    {
        out.println();
        out.print("Enter name of organization: "); 
        name = input.next();

        out.print("Enter year income of organization: ");
        year_income = input.nextDouble();

        out.print("Enter is organization commercial (true/false): ");
        is_commercial = input.nextBoolean();
    }

    public void print_data()
    {
        out.println("\nName of organization: " + name);
        out.printf("Year income: $%.2f\n", year_income);
        out.println("Is organization commercial: " + is_commercial);
    }

    public double getInterest(double percentageRate)
    {
        return year_income * percentageRate / 100;
    }

    public double getTaxes()
    {
        if (is_commercial) return year_income * 0.1;
        else return year_income * 0.02;
    }
}