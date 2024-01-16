import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;

public class do_while
{
    public static void main(String[] args)
    {
          File evidence = new File("evidence.txt");
          if (evidence.exists())
          {
               Scanner keyboard = new Scanner(System.in);
               char reply;

               do
               {
                    out.print("Delete file? y/n: ");
                    reply = keyboard.findWithinHorizon(".", 0).charAt(0);
               } while (reply != 'y' && reply != 'n');

               if (reply == 'y')
               {
                    out.println("Deleting file...");
                    evidence.delete();
                    out.println("File deleted.");
               }
               else out.println("Okay, not deleting file.");     
               
               keyboard.close();
          }
          else out.println("File does not exist.");
    }
}