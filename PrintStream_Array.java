import java.io.IOException;
import java.io.File;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;


public class PrintStream_Array 
{
    public static void main(String[] args)
    {
        int guests[] = new int[10];
        int roomNum;

        Scanner diskScanner;
        try
        {
            diskScanner = new Scanner(new File("GuestList.txt"));
            for (roomNum = 0; roomNum < 10; roomNum++)
            {
                guests[roomNum] = diskScanner.nextInt();
            }
            diskScanner.close();
        }
        catch(IOException e)
        {
            out.println("Error in diskScanner: " + e.getMessage());
            return;
        }

        roomNum = 0;
        while (roomNum < 10 && guests[roomNum] != 0)
        {
            roomNum++;
        }

        if (roomNum == 10)
        {
            out.println("There're no empty rooms in the hotel");
            return;
        }
        else
        {
            out.print("How many guests will be staying in room № ");
            out.print(roomNum);
            out.println("?");
            out.print("Input number of guests: ");
        }

        Scanner keyboard = new Scanner(System.in);
        guests[roomNum] = keyboard.nextInt();
        keyboard.close();
       
        try
        {
            PrintStream listOut = new PrintStream("GuestList.txt");
            try
            {
                for (roomNum = 0; roomNum < 10; roomNum++)
                {
                    listOut.print(guests[roomNum]);
                    listOut.print(" ");
                }

            }
            catch (Exception e)
            {
                listOut.close();
            }
        }
        catch (IOException e)
        {
            out.println("Error in PrintStream: " + e.getMessage());
            return;
        }
        
    }
}
