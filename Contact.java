public class Contact
{
    private String name;
    private long phone_num;
    private double balance;

    public void setName(String aName)
    {
        name = aName;
    }

    public void setPhone(long aNum)
    {
        phone_num = aNum;
    }

    public void setBalance(double aBalance)
    {
        balance = aBalance;
    }

    public String getName()
    {
        return name;
    }

    public long getPhone()
    {
        return phone_num;
    }

    public double getBalance()
    {
        return balance;
    }

    public void printInfo()
    {
        System.out.println();
        System.out.println("Name: " + getName());
        System.out.println("Phone number: " + getPhone());
        System.out.printf("Balance: $%.2f", getBalance());
        System.out.println();
    }
}
