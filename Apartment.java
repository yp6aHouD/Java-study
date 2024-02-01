public class Apartment extends PlaceToLive
{
    private double rent_cost;

    public void setRentCost(double rent_cost)
    {
        this.rent_cost = rent_cost;
    }

    public double getRentCost()
    {
        return rent_cost;
    }

    public double getAreaPrice()
    {
        return getRentCost() / getArea();
    }
    
    public double get1RoomPrice()
    {
        return getRentCost() / getRooms();
    }
}
