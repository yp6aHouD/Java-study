import static java.lang.System.out;
import java.util.Scanner;


public class if_else_auth
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter username: ");
        String username = keyboard.next();

        if (username.equals("chenguang")) {
            out.print("Enter password: ");
            String password = keyboard.next();
            if (password.equals("yp6aHouD")) {
                out.println("Welcome, " + username);
            }
            else {
                out.println("Wrong password!");
            }
        }
        else {
            out.println("Wrong username, try again!");
        }
        
        keyboard.close();
    }
}