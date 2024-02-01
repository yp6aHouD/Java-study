// расширение стандартного класса


public class PartTimeEmployee extends Employee
{
    private double hourlyRate;

    public void setHourlyRate(double rate)
    {
        hourlyRate = rate;
    }
    
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public double findPaymentAmount(int hours)
    {
        return hourlyRate * hours;
    }
}
