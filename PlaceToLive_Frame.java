import java.util.Locale;
import com.allmycode.dummiesframe.DummiesFrame;


public class PlaceToLive_Frame
{
    public static void main(String[] args)
    {
        DummiesFrame frame = new DummiesFrame("Find your room by address!");
        frame.addRow("Input city");
        frame.setButtonText("Tap this button!");
        frame.go();
    }

    public static String calculate(String inputAddress)
    {
        Locale.setDefault(Locale.CHINA);

        PlaceToLive first = new PlaceToLive();
        first.setCity("Chengdu");
        first.setAddress("ChengDu, First Street, 1'st house");
        first.setRooms(4);
        first.setArea(38.5);
        first.setCost(738.99);

        PlaceToLive second = new PlaceToLive();
        second.setCity("Beijing");
        second.setAddress("BeiJing, Second Street, 2'nd house");
        second.setRooms(6);
        second.setArea(45.2);
        second.setCost(1399.99);

        PlaceToLive third = new PlaceToLive();
        third.setCity("Harbin");
        third.setAddress("HaErBin, Third Street, 3'rd house");
        third.setRooms(2);
        third.setArea(27.9);
        third.setCost(279.90);

        if (inputAddress.equals(first.getCity()))
        {
            return  "Address: " + first.getAddress() +
                    " Number of rooms: " + first.getRooms() + 
                    " Total Area: " + first.getArea() + 
                    " Price for one room: " + first.getRoomPrice() +
                    " Price for 1 square meter: " + first.getAreaPrice();
        }

        else if (inputAddress.equals(second.getCity()))
        {
            return  " Address: " + second.getAddress() +
                    " Number of rooms: " + second.getRooms() +
                    " Total Area: " + second.getArea() +
                    " Price for one room: " + second.getRoomPrice() +
                    " Price for 1 square meter: " + second.getAreaPrice();
        }

        else if (inputAddress.equals(third.getCity())) 
        {
            return  "Address: " + third.getAddress() +
                    " Number of rooms: " + third.getRooms() +
                    " Total Area: " + third.getArea() +
                    " Price for one room: " + third.getRoomPrice() +
                    " Price for 1 square meter: " + third.getAreaPrice();
        }

        else
        {
            return  "There's no place for you at this city" + 
                    " or you just entered wrong!";
        }
    }
}