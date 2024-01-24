import static java.lang.System.out;
import java.util.Locale;
import java.util.Scanner;



public class DisplayThePlaces
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.CHINA);
        Scanner keyboard = new Scanner(System.in);
        
        PlaceToLive first = new PlaceToLive();
        first.setAddress("ChengDu, First Street, 1'st house");
        first.setRooms(4);
        first.setArea(38.5);

        PlaceToLive second = new PlaceToLive();
        second.setAddress("BeiJing, Second Street, 2'nd house");
        second.setRooms(6);
        second.setArea(45.2);

        PlaceToLive third = new PlaceToLive();
        third.setAddress("HaErBin, Third Street, 3'rd house");
        third.setRooms(2);
        third.setArea(27.9);

        setPrice(first, keyboard);
        setPrice(second, keyboard);
        setPrice(third, keyboard);
        
        printInfo(first);
        printInfo(second);
        printInfo(third);

        keyboard.close();
    }

    static void printInfo(PlaceToLive place)
    {
        out.println("\nAddress: " + place.getAddress());
        out.println("Number of rooms: " + place.getRooms());
        out.println("Total area: " + place.getArea());
        out.printf("Price for one room: %.2f\n", place.getRoomPrice());
        out.printf("Price for 1 square meter: %.2f\n", place.getAreaPrice());
    }

    static void setPrice(PlaceToLive place, Scanner in)
    {
        out.printf("Enter the price for hotel at %s: ", place.getAddress());
        place.setCost(in.nextDouble());
    }
}