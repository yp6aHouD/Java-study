

public class Account
{
    private String name;
    private String address;     // доступы ко всем полям закрыты
    private double balance;

    public void setName(String n) // set-метод
    {
        if (!n.equals(""))
        {
            name = n;
        }
    }

    public String getName() // get-метод
    {
        return name;
    }

    public void setAddress(String n)
    {
        address = n;
    }

    public String getAddress()
    {
        return address;
    }

    public void setBalance(double n)
    {
        balance = n;
    }

    public double getBalance()
    {
        return balance;
    }
}