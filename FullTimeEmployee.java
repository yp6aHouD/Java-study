public class FullTimeEmployee extends Employee
{
    private double weeklySalary; // еженедельная зп
    private double benefitDeduction; // пенсия

    public void setWeeklySalary(double salary)
    {
        weeklySalary = salary;
    }

    public void setBenefitDeduction(double benefit)
    {
        benefitDeduction = benefit;
    }

    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    public double getBenefitDeduction()
    {
        return benefitDeduction;
    }

    public double findPaymentAmount()
    {
        return weeklySalary - benefitDeduction;
    }

}
