public class ApartmentWithFees extends Apartment
{
    private double fee;
    @Override

    public double getRentCost()
    {
        return super.getRentCost() + getFee(); // использование метода из суперкласса
    }

    public void setFee(double fee)
    {
        this.fee = fee;
    }

    public double getFee()
    {
        return fee / 4;
    }

    public double getAreaPrice()
    {
        return (getRentCost() + getFee()) / getArea();
    }

    public double get1RoomPrice()
    {
        return (getRentCost() + getFee()) / getRooms();
    }
}
