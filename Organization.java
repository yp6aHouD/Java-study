import static java.lang.System.out;
import java.util.Scanner;

public class Organization
{
    private String name;
    private double year_income;
    private boolean is_commercial;

    public void input_data(Scanner input)
    {
        out.println();
        out.print("Enter name of organization: ");
 
        if (input.hasNext()){
            name = input.next();
        }

        out.print("Enter year income of organization: ");

        while (!input.hasNextDouble())
        {
            out.print("Wrong input, put again: ");
            input.next(); // очищаем неверный ввод
        }
        year_income = input.nextDouble();

        while (year_income < 0)
        {
            out.print("Wrong input, put again: ");
            while (!input.hasNextDouble())
            {
                out.print("Wrong input, put again: ");
                input.next(); // очищаем неверный ввод
            }
            year_income = input.nextDouble();
        }

        out.print("Enter is organization commercial (true/false): ");

        while (!input.hasNextBoolean())
        {
            out.print("Wrong input, put again: ");
            input.next(); // очищаем неверный ввод
        }
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