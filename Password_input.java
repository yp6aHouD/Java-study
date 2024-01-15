import static java.lang.System.in; // позволяет не писать System.out and System.in
import static java.lang.System.out; // позволяет не писать System.out and System.in
import java.util.Scanner;



public class Password_input 
{
    public static void main(String[] args) 
    {
        out.print("Input a password: ");
        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();
        out.println("You've inputted >>" + password + "<< as a password.");

        if (password == "swordfish")
        {
            out.println("You're lucky, but access granted");
        }
        else
        {
            out.println("Access denied, you're unlucky");
        }
        out.println();

        if (password.equals("swordfish"))
        // или можно if ("swordfish".equals(password))
        {
            out.println("Access granted, right password!");
        }
        else
        {
            out.println("Access denied, password " + password + " is incorrect.");
        }
        
        keyboard.close();
    }
}