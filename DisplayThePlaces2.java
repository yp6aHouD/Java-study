import static java.lang.System.out;
import java.util.Locale;
import java.util.Scanner;



public class DisplayThePlaces2
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.CHINA);
        House hse = new House();
        Apartment apt = new Apartment();

        hse.setAddress("ChengDu, DianZiKeDa");
        hse.setCity("Chengdu");
        hse.setRooms(5);
        hse.setArea(38.5);
        hse.setCost(33730.5);
        hse.setLoanPrice(hse.getCost() * 0.25);
        hse.setYearTax(hse.getCost() * 0.06);
        
        apt.setAddress("BeiJing, BeiYuDaXue");
        apt.setCity("BeiJing");
        apt.setRooms(3);
        apt.setArea(43.5);
        apt.setCost(57780.5);
        apt.setRentCost(3250);

        printHseInfo(hse);
        printApsInfo(apt);
    }

    static void printHseInfo(House place)
    {
        out.println("\nAddress: " + place.getAddress());
        out.println("Number of rooms: " + place.getRooms());
        out.println("Total area: " + place.getArea());
        out.printf("Monthly price for one room: %.2f\n", (place.getRoomPrice() + place.getLoanPrice() / 12 + place.getYearTax() / 12));
        out.printf("Price for 1 square meter: %.2f\n", (place.getAreaPrice() + (place.getLoanPrice() / 12 + place.getYearTax() / 12) / place.getArea()));
    }

    static void printApsInfo(Apartment place)
    {
        out.println("\nAddress: " + place.getAddress());
        out.println("Number of rooms: " + place.getRooms());
        out.println("Total area: " + place.getArea());
        out.printf("Monthly price for one room: %.2f\n", place.getRentCost());
        out.printf("Price for 1 square meter: %.2f\n", (place.getRentCost() / place.getArea()));
    }

    static void setPrice(PlaceToLive place, Scanner in)
    {
        out.printf("Enter the price for hotel at %s: ", place.getAddress());
        place.setCost(in.nextDouble());
    }
}