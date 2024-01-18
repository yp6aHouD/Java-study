import static java.lang.System.out;
import java.util.Scanner;

public class use_Organization
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Organization first = new Organization();
        Organization second = new Organization();

        first.input_data(keyboard);
        first.print_data();
        out.println();
        out.print("Additional Income: ");
        out.printf("$%.2f\n", first.getInterest(5.00));
        out.printf("Taxes: $%.2f\n", first.getTaxes());
        out.println();


        second.input_data(keyboard);
        second.print_data();
        out.println();
        out.print("Additional Income: ");
        out.printf("$%.2f\n", second.getInterest(5.00));
        out.printf("Taxes: $%.2f\n", second.getTaxes());
        out.println();
        

        keyboard.close();
    }
}