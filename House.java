

public class House extends PlaceToLive
{
    private double loan_cost;
    private double year_tax;

    public void setLoanPrice(double loan_cost)
    {
        this.loan_cost = loan_cost;
    }

    public void setYearTax(double year_tax)
    {
        this.year_tax = year_tax;
    }

    public double getLoanPrice()
    {
        return loan_cost;
    }

    public double getYearTax()
    {
        return year_tax;
    }

    public double get1RoomPrice()
    {
        return getRoomPrice() + getLoanPrice() / 12 + getYearTax() / 12;
    }

    public double get1SquareMeterPrice()
    {
        return getAreaPrice() + (getLoanPrice() / 12 + getYearTax() / 12) / getArea();
    }
}

