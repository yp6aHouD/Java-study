

public class PlaceToLive
{
    private String city;
    private String address;
    private int num_of_rooms;
    private double area_of_rooms;
    private double cost_1_night;

    public void setCity(String aCity)
    {
        city = aCity;
    }

    public void setAddress(String anAddress)
    {
        address = anAddress;
    }

    public void setRooms(int aNumber)
    {
        num_of_rooms = aNumber;
    }

    public void setArea(double anArea)
    {
        area_of_rooms = anArea;
    }

    public void setCost(double aCost)
    {
        cost_1_night = aCost;
    }

    public String getCity()
    {
        return city;
    }

    public String getAddress()
    {
        return address;
    }

    public int getRooms()
    {
        return num_of_rooms;
    }

    public double getArea()
    {
        return area_of_rooms;
    }

    public double getCost()
    {
        return cost_1_night;
    }
    
    public double getRoomPrice()
    {
        return getCost() / getRooms();
    }

    public double getAreaPrice()
    {
        return getCost() / getArea();
    }
}